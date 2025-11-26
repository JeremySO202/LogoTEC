/*
 * Test I2C Scanner para ESP32
 * Escanea el bus I2C para detectar dispositivos conectados
 */

#include <Wire.h>

void setup()
{
    Serial.begin(115200);
    delay(1000);

    Serial.println("\n=== I2C Scanner ===");
    Serial.println("Escaneando dispositivos I2C...\n");

    // Inicializar I2C con pines por defecto
    Wire.begin();

    Serial.println("Pines I2C por defecto:");
    Serial.println("  SDA -> GPIO 21");
    Serial.println("  SCL -> GPIO 22\n");

    scanI2C();

    // Probar con otros pines comunes
    Serial.println("\n--- Probando con GPIO 4 (SDA) y GPIO 15 (SCL) ---");
    Wire.begin(4, 15);
    scanI2C();

    Serial.println("\n--- Probando con GPIO 23 (SDA) y GPIO 22 (SCL) ---");
    Wire.begin(23, 22);
    scanI2C();
}

void loop()
{
    delay(5000);
    Serial.println("\n=== Reescaneando... ===");
    scanI2C();
}

void scanI2C()
{
    byte error, address;
    int nDevices = 0;

    Serial.println("Escaneando direcciones 0x01 a 0x7F...");

    for (address = 1; address < 127; address++)
    {
        Wire.beginTransmission(address);
        error = Wire.endTransmission();

        if (error == 0)
        {
            Serial.print("Dispositivo I2C encontrado en 0x");
            if (address < 16)
                Serial.print("0");
            Serial.print(address, HEX);
            Serial.print(" (");
            Serial.print(address);
            Serial.println(")");

            // Identificar dispositivos comunes
            if (address == 0x68 || address == 0x69)
            {
                Serial.println("  -> Probablemente MPU6050!");
            }

            nDevices++;
        }
        else if (error == 4)
        {
            Serial.print("Error desconocido en dirección 0x");
            if (address < 16)
                Serial.print("0");
            Serial.println(address, HEX);
        }
    }

    if (nDevices == 0)
    {
        Serial.println("No se encontraron dispositivos I2C.");
        Serial.println("\nVerifica:");
        Serial.println("  1. Conexiones SDA y SCL");
        Serial.println("  2. Alimentación del MPU6050 (3.3V)");
        Serial.println("  3. Resistencias pull-up (generalmente ya están en el módulo)");
        Serial.println("  4. Que el MPU6050 esté funcionando");
    }
    else
    {
        Serial.print("\nTotal de dispositivos encontrados: ");
        Serial.println(nDevices);
    }
}
