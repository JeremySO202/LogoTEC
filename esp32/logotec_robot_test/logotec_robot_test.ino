/*
 * LogoTEC Robot Test - Control con MPU6050
 *
 * Hardware:
 * - ESP32-D0WD-V3
 * - 2 Motores DC con driver L298N
 * - Servo para lápiz
 * - MPU6050 (giroscopio/acelerómetro)
 *
 * Funcionalidades:
 * - Control preciso de giro usando MPU6050, mediante ajuste de velocidad
 * - Movimiento adelante/atrás con compensación de velocidad
 * - Servo para simular lápiz arriba/abajo
 */

#include <ESP32Servo.h>
#include <Wire.h>
#include <MPU6050_light.h>

// ============================================
// CONFIGURACIÓN DE HARDWARE - PINES
// ============================================

// Servo para lápiz
Servo penServo;
const int servoPin = 32;
const int PEN_UP_ANGLE = 135;  // Ángulo para lápiz arriba
const int PEN_DOWN_ANGLE = 90; // Ángulo para lápiz abajo

// Motor A (Rueda Derecha) - L298N
const int motorA_IN1 = 14; // Control dirección
const int motorA_IN2 = 27; // Control dirección
const int motorA_PWM = 12; // Control velocidad (PWM)

// Motor B (Rueda Izquierda) - L298N
const int motorB_IN3 = 26; // Control dirección
const int motorB_IN4 = 25; // Control dirección
const int motorB_PWM = 33; // Control velocidad (PWM)

// Configuración PWM para motores
const int pwmFreq = 5000;    // Frecuencia PWM en Hz
const int pwmResolution = 8; // Resolución 8 bits (0-255)

// ============================================
// PARÁMETROS DE CONTROL DE GIRO
// ============================================
const int MIN_SPEED_TURN = 185;   // Velocidad mínima para girar
const int MAX_SPEED_TURN = 200;   // Velocidad máxima para girar
const float TOLERANCE_TURN = 3.0; // Tolerancia ±3° para considerar objetivo alcanzado
const float SLOW_ZONE = 20.0;     // Cuando faltan <20° reducir velocidad gradualmente

// ============================================
// PARÁMETROS DE CONTROL DE MOVIMIENTO (PD)
// ============================================
const float KP_MOVE = 15.0;       // Ganancia proporcional para movimiento
const float KD_MOVE = 5.0;        // Ganancia derivativa para movimiento
const int MIN_SPEED_MOVE = 100;   // Velocidad mínima para movimiento
const int MAX_SPEED_MOVE = 200;   // Velocidad máxima para movimiento
const float TOLERANCE_MOVE = 0.5; // Tolerancia en cm

// ============================================
// PARÁMETROS DE MOVIMIENTO
// ============================================
const int BASE_SPEED_A = 255; // Velocidad base motor derecho (más rápido)
const int BASE_SPEED_B = 220; // Velocidad base motor izquierdo (compensado)
const double CM_PER_MS = 0.2; // Estimación: cm recorridos por milisegundo

// ============================================
// GIROSCOPIO MPU6050
// ============================================
MPU6050 mpu(Wire);   // Instancia del MPU6050
float mpu_yaw = 0.0; // Ángulo actual del robot (0-360°)

// ============================================
// CONTROL DE PRUEBAS AUTOMÁTICAS
// ============================================
int testStep = 0;                         // Paso actual de la prueba
unsigned long lastTestTime = 0;           // Última vez que se ejecutó un paso
const unsigned long TEST_INTERVAL = 2000; // Intervalo entre comandos (2 segundos)

// ============================================
// INICIALIZACIÓN DEL SISTEMA
// ============================================
void setup()
{
    // Iniciar comunicación serial para debug
    Serial.begin(115200);
    Serial.println("\n=================================");
    Serial.println("LogoTEC - Robot Test con MPU6050");
    Serial.println("=================================\n");

    // Configurar pines de motores como salidas
    pinMode(motorA_IN1, OUTPUT);
    pinMode(motorA_IN2, OUTPUT);
    pinMode(motorB_IN3, OUTPUT);
    pinMode(motorB_IN4, OUTPUT);

    // Configurar canales PWM para control de velocidad
    ledcAttach(motorA_PWM, pwmFreq, pwmResolution);
    ledcAttach(motorB_PWM, pwmFreq, pwmResolution);

    // Inicializar comunicación I2C para MPU6050
    Serial.println("Inicializando I2C...");
    Wire.begin();
    delay(100);

    // Inicializar y verificar MPU6050
    Serial.println("Inicializando MPU6050...");
    byte status = mpu.begin();
    if (status != 0)
    {
        Serial.print("Error MPU6050: ");
        Serial.println(status);
        Serial.println("Verifica las conexiones I2C (SDA=21, SCL=22)");
        while (1)
            delay(1000); // Detener ejecución si falla
    }
    Serial.println("MPU6050 encontrado!");

    // Calibrar MPU6050 (importante: mantener robot quieto)
    Serial.println("Calibrando MPU6050 (mantén el robot quieto)...");
    mpu.calcOffsets(); // Calcula offsets de giroscopio y acelerómetro
    Serial.println("[OK] Calibracion completada!");

    // Configurar servo para lápiz
    ESP32PWM::allocateTimer(2);
    penServo.setPeriodHertz(50);
    penServo.attach(servoPin, 500, 2400);
    penServo.write(PEN_DOWN_ANGLE); // Iniciar con lápiz abajo

    // Asegurar que los motores estén detenidos
    stopMotors();

    Serial.println("Sistema inicializado");
    Serial.println("Iniciando secuencia de pruebas en 2 segundos...\n");

    delay(2000);
    lastTestTime = millis();
}

// ============================================
// BUCLE PRINCIPAL
// ============================================
void loop()
{
    // Actualizar lectura del MPU6050 continuamente
    updateMPU6050();

    // Ejecutar comandos de prueba cada TEST_INTERVAL milisegundos
    if (millis() - lastTestTime >= TEST_INTERVAL)
    {
        lastTestTime = millis();
        executeTest(testStep);
        testStep++;

        // Al completar todos los pasos, reiniciar el ciclo
        if (testStep > 20)
        {
            Serial.println("\n=================================");
            Serial.println("CICLO DE PRUEBAS COMPLETADO");
            Serial.println("Reiniciando en 5 segundos...");
            Serial.println("=================================\n");
            delay(5000);
            testStep = 0;
        }
    }
}

void executeTest(int step)
{
    Serial.println("─────────────────────────────────");

    switch (step)
    {
    case 0:
        simulateCommand("RESET");
        break;
    case 1:
        simulateCommand("BAJALAPIZ");
        simulateCommand("BAJALAPIZ");
        break;
    case 2:
        simulateCommand("AVANZA 40");
        break;
    case 3:
        simulateCommand("GIRADERECHA 90");
        break;
    case 4:
        simulateCommand("AVANZA 40");
        break;
    case 5:
        simulateCommand("GIRADERECHA 90");
        break;
    case 6:
        simulateCommand("AVANZA 40");
        break;
    case 7:
        simulateCommand("GIRADERECHA 90");
        break;
    case 8:
        simulateCommand("AVANZA 40");
        break;
    case 9:
        simulateCommand("GIRADERECHA 90");
        break;
    case 10:
        simulateCommand("SUBELAPIZ");
        break;
    case 11:
        simulateCommand("PONRUMBO 45");
        break;
    case 12:
        simulateCommand("AVANZA 20");
        break;
    case 13:
        simulateCommand("BAJALAPIZ");
        break;
    case 14:
        simulateCommand("GIRADERECHA 120");
        break;
    case 15:
        simulateCommand("AVANZA 40");
        break;
    case 16:
        simulateCommand("GIRADERECHA 120");
        break;
    case 17:
        simulateCommand("AVANZA 40");
        break;
    case 18:
        simulateCommand("GIRADERECHA 120");
        break;
    case 19:
        simulateCommand("AVANZA 40");
        break;
    case 20:
        simulateCommand("SUBELAPIZ");
        break;
    }

    Serial.println("─────────────────────────────────\n");
}

void simulateCommand(String cmd)
{
    Serial.print(">> Comando: ");
    Serial.println(cmd);
    processCommand(cmd);
    Serial.println();
}

// ============================================
// PROCESADOR DE COMANDOS LOGO
// ============================================
void processCommand(String cmd)
{
    // Separar comando de parámetros
    int spaceIndex = cmd.indexOf(' ');
    String action = spaceIndex > 0 ? cmd.substring(0, spaceIndex) : cmd;
    String params = spaceIndex > 0 ? cmd.substring(spaceIndex + 1) : "";
    action.toUpperCase();

    // Ejecutar comando correspondiente
    if (action == "RESET")
    {
        executeReset();
    }
    else if (action == "AVANZA")
    {
        double dist = params.toDouble();
        executeAvanza(dist);
    }
    else if (action == "RETROCEDE")
    {
        double dist = params.toDouble();
        executeRetrocede(dist);
    }
    else if (action == "GIRADERECHA")
    {
        double deg = params.toDouble();
        executeGiraDerecha(deg);
    }
    else if (action == "GIRAIZQUIERDA")
    {
        double deg = params.toDouble();
        executeGiraIzquierda(deg);
    }
    else if (action == "PONRUMBO")
    {
        double angle = params.toDouble();
        executePonRumbo(angle);
    }
    else if (action == "BAJALAPIZ")
    {
        executeBajaLapiz();
    }
    else if (action == "SUBELAPIZ")
    {
        executeSubeLapiz();
    }
}

// ============================================
// AVANZAR HACIA ADELANTE (con control PD)
// ============================================
void executeAvanza(double dist_objetivo)
{
    Serial.printf("Avanzando %.2f cm con control PD\n", dist_objetivo);

    float distancia_recorrida = 0;
    float error_anterior = 0;
    unsigned long tiempo_anterior = millis();
    unsigned long startTime = millis();
    const unsigned long timeout = (unsigned long)(dist_objetivo * 100); // Timeout generoso

    while (millis() - startTime < timeout)
    {
        // Calcular tiempo transcurrido
        unsigned long tiempo_actual = millis();
        float dt = (tiempo_actual - tiempo_anterior) / 1000.0; // en segundos

        // Estimar distancia recorrida basada en tiempo y velocidad
        distancia_recorrida += CM_PER_MS * dt * 1000.0;

        // Calcular error
        float error = dist_objetivo - distancia_recorrida;

        // Si llegamos a la tolerancia, salir
        if (error <= TOLERANCE_MOVE)
        {
            Serial.println("   [OK] Distancia alcanzada!");
            break;
        }

        // Calcular derivada del error
        float derivada = (error - error_anterior) / dt;

        // Control PD
        float control = KP_MOVE * error + KD_MOVE * derivada;

        // Limitar velocidad (motor A es más rápido, aplicar factor de corrección)
        int speed_A = constrain(abs(control) * 0.86, MIN_SPEED_MOVE, MAX_SPEED_MOVE * 0.86);
        int speed_B = constrain(abs(control), MIN_SPEED_MOVE, MAX_SPEED_MOVE);

        // Mover hacia adelante
        moveForward(speed_A, speed_B);

        // Actualizar variables
        error_anterior = error;
        tiempo_anterior = tiempo_actual;

        delay(10); // Período de muestreo
    }

    stopMotors();
    delay(100);

    Serial.printf("   [OK] Distancia estimada: %.2f cm\n", distancia_recorrida);
}

// ============================================
// RETROCEDER (con control PD)
// ============================================
void executeRetrocede(double dist_objetivo)
{
    Serial.printf("Retrocediendo %.2f cm con control PD\n", dist_objetivo);

    float distancia_recorrida = 0;
    float error_anterior = 0;
    unsigned long tiempo_anterior = millis();
    unsigned long startTime = millis();
    const unsigned long timeout = (unsigned long)(dist_objetivo * 100);

    while (millis() - startTime < timeout)
    {
        unsigned long tiempo_actual = millis();
        float dt = (tiempo_actual - tiempo_anterior) / 1000.0;

        distancia_recorrida += CM_PER_MS * dt * 1000.0;

        float error = dist_objetivo - distancia_recorrida;

        if (error <= TOLERANCE_MOVE)
        {
            Serial.println("   [OK] Distancia alcanzada!");
            break;
        }

        float derivada = (error - error_anterior) / dt;
        float control = KP_MOVE * error + KD_MOVE * derivada;

        int speed_A = constrain(abs(control), MIN_SPEED_MOVE, MAX_SPEED_MOVE);
        int speed_B = constrain(abs(control) * 0.86, MIN_SPEED_MOVE, MAX_SPEED_MOVE * 0.86);

        moveBackward(speed_A, speed_B);

        error_anterior = error;
        tiempo_anterior = tiempo_actual;

        delay(10);
    }

    stopMotors();
    delay(100);

    Serial.printf("   [OK] Distancia estimada: %.2f cm\n", distancia_recorrida);
}

// ============================================
// GIRAR A LA DERECHA (usa MPU6050)
// ============================================
void executeGiraDerecha(double deg)
{
    // Leer ángulo inicial del MPU6050
    mpu.update();
    delay(50);
    mpu.update();
    float angulo_inicial = mpu.getAngleZ();

    Serial.printf("Girando derecha %.2f°\n", deg);
    Serial.printf("   Ángulo inicial: %.2f°\n", angulo_inicial);

    unsigned long startTime = millis();
    const unsigned long timeout = (unsigned long)(deg * 100); // Timeout: 100ms por grado
    int count_stopped = 0;                                    // Contador para confirmar que llegamos al objetivo

    while (millis() - startTime < timeout)
    {
        mpu.update();
        float angulo_actual = mpu.getAngleZ();

        // Calcular cuánto hemos girado (DERECHA = negativo)
        float girado = angulo_inicial - angulo_actual;

        // Normalizar para manejar el cruce de 0°/360°
        if (girado > 180)
            girado -= 360;
        if (girado < -180)
            girado += 360;

        // Calcular cuánto falta para el objetivo
        float error = deg - girado;

        // Verificar si llegamos al objetivo
        if (abs(error) <= TOLERANCE_TURN)
        {
            count_stopped++;
            if (count_stopped >= 3) // 3 lecturas consecutivas = objetivo alcanzado
            {
                Serial.println("   Objetivo alcanzado!");
                break;
            }
            stopMotors();
            delay(50);
            continue;
        }
        else
        {
            count_stopped = 0;
        }

        // Calcular velocidad: más lento cuando nos acercamos al objetivo
        int speed;
        if (abs(error) < SLOW_ZONE)
        {
            // Zona lenta: reducir velocidad proporcionalmente
            speed = map(abs(error), 0, SLOW_ZONE, MIN_SPEED_TURN, MAX_SPEED_TURN / 2);
        }
        else
        {
            speed = MAX_SPEED_TURN;
        }

        // Aplicar movimiento en la dirección correcta
        if (error > 0)
        {
            turnRight(speed, speed); // Falta girar más a la derecha
        }
        else
        {
            turnLeft(speed, speed); // Nos pasamos, corregir
        }

        delay(20);
    }

    stopMotors();
    delay(200);

    // Mostrar resultado final
    mpu.update();
    float angulo_final = mpu.getAngleZ();
    float girado_total = angulo_inicial - angulo_final;
    if (girado_total > 180)
        girado_total -= 360;
    if (girado_total < -180)
        girado_total += 360;

    Serial.printf("   Ángulo final: %.2f°\n", angulo_final);
    Serial.printf("   Total girado: %.2f° (objetivo: %.2f°)\n", girado_total, deg);
    Serial.printf("   Error: %.2f°\n", deg - girado_total);
}

// ============================================
// GIRAR A LA IZQUIERDA (usa MPU6050)
// ============================================
void executeGiraIzquierda(double deg)
{
    // Leer ángulo inicial del MPU6050
    mpu.update();
    delay(50);
    mpu.update();
    float angulo_inicial = mpu.getAngleZ();

    Serial.printf("Girando izquierda %.2f°\n", deg);
    Serial.printf("   Ángulo inicial: %.2f°\n", angulo_inicial);

    unsigned long startTime = millis();
    const unsigned long timeout = (unsigned long)(deg * 100);
    int count_stopped = 0;

    while (millis() - startTime < timeout)
    {
        mpu.update();
        float angulo_actual = mpu.getAngleZ();

        // Calcular cuánto hemos girado (IZQUIERDA = positivo)
        float girado = angulo_actual - angulo_inicial;

        // Normalizar para manejar el cruce de 0°/360°
        if (girado > 180)
            girado -= 360;
        if (girado < -180)
            girado += 360;

        // Calcular cuánto falta para el objetivo
        float error = deg - girado;

        // Verificar si llegamos al objetivo
        if (abs(error) <= TOLERANCE_TURN)
        {
            count_stopped++;
            if (count_stopped >= 3)
            {
                Serial.println("   Objetivo alcanzado!");
                break;
            }
            stopMotors();
            delay(50);
            continue;
        }
        else
        {
            count_stopped = 0;
        }

        // Calcular velocidad
        int speed;
        if (abs(error) < SLOW_ZONE)
        {
            speed = map(abs(error), 0, SLOW_ZONE, MIN_SPEED_TURN, MAX_SPEED_TURN / 2);
        }
        else
        {
            speed = MAX_SPEED_TURN;
        }

        // Aplicar movimiento
        if (error > 0)
        {
            turnLeft(speed, speed); // Falta girar más a la izquierda
        }
        else
        {
            turnRight(speed, speed); // Nos pasamos, corregir
        }

        delay(20);
    }

    stopMotors();
    delay(200);

    // Mostrar resultado final
    mpu.update();
    float angulo_final = mpu.getAngleZ();
    float girado_total = angulo_final - angulo_inicial;
    if (girado_total > 180)
        girado_total -= 360;
    if (girado_total < -180)
        girado_total += 360;

    Serial.printf("   [OK] Angulo final: %.2f°\n", angulo_final);
    Serial.printf("   [OK] Total girado: %.2f° (objetivo: %.2f°)\n", girado_total, deg);
    Serial.printf("   [OK] Error: %.2f°\n", deg - girado_total);
}

// ============================================
// ============================================
// PONER RUMBO (orientar robot a un ángulo específico)
// ============================================
void executePonRumbo(double angle)
{
    // Normalizar ángulo objetivo
    while (angle >= 360.0)
        angle -= 360.0;
    while (angle < 0)
        angle += 360.0;

    mpu.update();
    delay(50);
    mpu.update();
    float angulo_inicial = mpu.getAngleZ();

    // Calcular diferencia más corta
    float diff = angle - angulo_inicial;
    while (diff > 180)
        diff -= 360;
    while (diff < -180)
        diff += 360;

    Serial.printf("Ajustando rumbo a %.2f°\n", angle);
    Serial.printf("   Ángulo inicial: %.2f°\n", angulo_inicial);
    Serial.printf("   Diferencia: %.2f° (%s)\n", abs(diff), diff > 0 ? "izquierda" : "derecha");

    // Si la diferencia es muy pequeña, no hacer nada
    if (abs(diff) <= TOLERANCE_TURN)
    {
        Serial.println("   Ya estamos en el rumbo objetivo!");
        return;
    }

    // Determinar si es más fácil girar a la derecha o izquierda
    if (diff > 0)
    {
        executeGiraIzquierda(abs(diff));
    }
    else
    {
        executeGiraDerecha(abs(diff));
    }
}

// ============================================
// RESETEAR SISTEMA
// ============================================
void executeReset()
{
    stopMotors();
    penServo.write(PEN_DOWN_ANGLE);
    delay(500); // Esperar a que el servo complete el movimiento
    Serial.println("Sistema reseteado");
}

// ============================================
// BAJAR Y SUBIR LÁPIZ
// ============================================
void executeBajaLapiz()
{
    penServo.write(PEN_DOWN_ANGLE);
    delay(500); // Esperar a que el servo complete el movimiento
    Serial.println("   [OK] Lapiz bajado");
}

void executeSubeLapiz()
{
    penServo.write(PEN_UP_ANGLE);
    delay(500); // Esperar a que el servo complete el movimiento
    Serial.println("   [OK] Lapiz subido");
}

// ============================================
// FUNCIONES DE CONTROL DE MOTORES
// ============================================

// Mover hacia adelante
void moveForward(int speedA, int speedB)
{
    digitalWrite(motorA_IN1, HIGH);
    digitalWrite(motorA_IN2, LOW);
    ledcWrite(motorA_PWM, speedA);

    digitalWrite(motorB_IN3, HIGH);
    digitalWrite(motorB_IN4, LOW);
    ledcWrite(motorB_PWM, speedB);
}

// Mover hacia atrás
void moveBackward(int speedA, int speedB)
{
    digitalWrite(motorA_IN1, LOW);
    digitalWrite(motorA_IN2, HIGH);
    ledcWrite(motorA_PWM, speedA);

    digitalWrite(motorB_IN3, LOW);
    digitalWrite(motorB_IN4, HIGH);
    ledcWrite(motorB_PWM, speedB);
}

// Girar a la izquierda (motor derecho adelante, izquierdo atrás)
void turnLeft(int speedA, int speedB)
{
    digitalWrite(motorA_IN1, HIGH);
    digitalWrite(motorA_IN2, LOW);
    ledcWrite(motorA_PWM, speedA);

    digitalWrite(motorB_IN3, LOW);
    digitalWrite(motorB_IN4, HIGH);
    ledcWrite(motorB_PWM, speedB);
}

// Girar a la derecha (motor derecho atrás, izquierdo adelante)
void turnRight(int speedA, int speedB)
{
    digitalWrite(motorA_IN1, LOW);
    digitalWrite(motorA_IN2, HIGH);
    ledcWrite(motorA_PWM, speedA);

    digitalWrite(motorB_IN3, HIGH);
    digitalWrite(motorB_IN4, LOW);
    ledcWrite(motorB_PWM, speedB);
}

// Detener ambos motores
void stopMotors()
{
    digitalWrite(motorA_IN1, LOW);
    digitalWrite(motorA_IN2, LOW);
    ledcWrite(motorA_PWM, 0);

    digitalWrite(motorB_IN3, LOW);
    digitalWrite(motorB_IN4, LOW);
    ledcWrite(motorB_PWM, 0);
}

// ============================================
// ACTUALIZAR LECTURA DEL MPU6050
// ============================================
void updateMPU6050()
{
    mpu.update();
    mpu_yaw = mpu.getAngleZ();

    // Normalizar a rango 0-360
    while (mpu_yaw >= 360.0)
        mpu_yaw -= 360.0;
    while (mpu_yaw < 0)
        mpu_yaw += 360.0;
}