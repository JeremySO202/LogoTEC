# 🐢 LogoTEC - Compilador e Intérprete

**LogoTEC** es un lenguaje de programación educativo inspirado en Logo, con análisis semántico completo y un intérprete gráfico interactivo.

---

## 📋 Tabla de Contenidos

- [Características](#-características)
- [Estructura del Proyecto](#-estructura-del-proyecto)
- [Requisitos](#-requisitos)
- [Instalación](#-instalación)
- [Uso](#-uso)
- [Arquitectura](#-arquitectura)
- [Desarrollo](#-desarrollo)

---

## ✨ Características

- 🔍 **Análisis Léxico y Sintáctico** con ANTLR4
- 🧠 **Análisis Semántico** completo con tabla de símbolos
- 🎨 **Interfaz Gráfica** moderna con JavaFX
- 🐢 **Intérprete Gráfico** para visualizar programas Logo
- 📝 **Editor de Código** integrado
- 🚀 **Compilación y Ejecución** en tiempo real

---

## 📁 Estructura del Proyecto

```
LogoTEC/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── logotec/
│   │   │           ├── parser/          # Clases generadas por ANTLR
│   │   │           │   ├── LogoTECLexer.java
│   │   │           │   ├── LogoTECParser.java
│   │   │           │   └── LogoTECVisitor.java
│   │   │           ├── semantics/       # Análisis semántico
│   │   │           │   ├── SemanticAnalyzer.java
│   │   │           │   ├── SymbolTable.java
│   │   │           │   ├── ErrorReporter.java
│   │   │           │   ├── SemanticError.java
│   │   │           │   └── Type.java
│   │   │           ├── interpreter/     # Intérprete (próximamente)
│   │   │           ├── ui/              # Interfaz gráfica
│   │   │           │   ├── Launcher.java
│   │   │           │   ├── HelloApplication.java
│   │   │           │   └── HelloController.java
│   │   │           └── SemanticTestMain.java
│   │   └── resources/
│   │       └── com/
│   │           └── logotec/
│   │               └── ui/
│   │                   └── hello-view.fxml
│   └── test/                            # Archivos de prueba
│       ├── prueba_basica.jabf
│       ├── prueba_avanzada.jabf
│       └── prueba_completa.jabf
├── LogoTEC.g4                           # Gramática ANTLR
├── pom.xml                              # Configuración Maven
└── README.md

```

---

## 🔧 Requisitos

- **Java**: JDK 11 o superior
- **Maven**: 3.6 o superior
- **JavaFX**: Se descarga automáticamente vía Maven
- **ANTLR4**: 4.13.2 (incluido como dependencia)

---

## 📥 Instalación

### 1. Clonar el repositorio

```bash
git clone <repository-url>
cd LogoTEC
```

### 2. Compilar el proyecto

```bash
mvn clean install
```

---

## 🚀 Uso

### Opción 1: Interfaz Gráfica (Recomendada)

Ejecuta la aplicación con interfaz gráfica:

```bash
mvn javafx:run
```

O desde IntelliJ IDEA:
1. Selecciona la configuración **"Run LogoTEC"**
2. Haz clic en el botón verde ▶️

#### Funcionalidades de la GUI:
- **File**: Cargar un archivo `.jabf`
- **Compile**: Compilar el código
- **Execute**: Ejecutar el programa
- **Done**: Guardar cambios
- **Erase**: Limpiar todo

### Opción 2: Análisis Semántico por Línea de Comandos

Analiza archivos LogoTEC desde la terminal:

```bash
# Analizar archivos de prueba predeterminados
mvn exec:java

# Analizar un archivo específico
mvn exec:java -Dexec.args="src/test/prueba_basica.jabf"

# Analizar múltiples archivos
mvn exec:java -Dexec.args="archivo1.jabf archivo2.jabf"
```

O desde IntelliJ IDEA:
- Selecciona la configuración **"Semantic Analysis"**

---

## 🏗️ Arquitectura

### Paquetes Principales

#### `com.logotec.parser`
Contiene las clases generadas por ANTLR4 para el análisis léxico y sintáctico:
- **LogoTECLexer**: Analizador léxico
- **LogoTECParser**: Analizador sintáctico
- **LogoTECVisitor**: Patrón Visitor para recorrer el AST

#### `com.logotec.semantics`
Implementa el análisis semántico:
- **SemanticAnalyzer**: Visitante que valida la semántica del programa
- **SymbolTable**: Tabla de símbolos para variables y procedimientos
- **ErrorReporter**: Recolector de errores semánticos
- **Type**: Enumeración de tipos de datos

#### `com.logotec.ui`
Interfaz gráfica con JavaFX:
- **Launcher**: Punto de entrada para JavaFX
- **HelloApplication**: Aplicación principal JavaFX
- **HelloController**: Controlador de eventos de la interfaz

#### `com.logotec.interpreter`
Intérprete del lenguaje (en desarrollo)

---

## 🛠️ Desarrollo

### Regenerar el Parser ANTLR

Si modificas la gramática `LogoTEC.g4`:

```bash
# Instalar ANTLR4 CLI (si no lo tienes)
# Debian/Ubuntu:
sudo apt install antlr4

# Generar clases Java
antlr4 -visitor -o src/main/java/com/logotec/parser LogoTEC.g4

# O usar el plugin de Maven
mvn antlr4:antlr4
```

### Ejecutar Tests

```bash
mvn test
```

### Empaquetar la Aplicación

```bash
mvn package
```

El JAR ejecutable se generará en `target/logotec-1.0-SNAPSHOT.jar`

---

## 📝 Sintaxis de LogoTEC

### Ejemplo Básico

```logo
# Dibujar un cuadrado
repetir 4 [
  avanza 100
  giraderecha 90
]
```

### Ejemplo con Variables

```logo
hacer :lado 50
hacer :angulo 90

repetir 4 [
  avanza :lado
  giraderecha :angulo
]
```

### Ejemplo con Procedimientos

```logo
para cuadrado :tamaño
  repetir 4 [
    avanza :tamaño
    giraderecha 90
  ]
fin

cuadrado 100
```

---

## 🐛 Solución de Problemas

### Error: "el método principal debe devolver un valor del tipo void"

**Solución**: Asegúrate de ejecutar `com.logotec.Launcher` en lugar de `HelloApplication` directamente.

### Error: "Folder parameter must be a valid folder"

**Solución**: El directorio `src/test` no existe. Créalo o la aplicación usará tu directorio home automáticamente.

### Error: "Graphics Device initialization failed"

**Solución**: Estás usando las librerías locales de JavaFX en lugar de las de Maven. Ejecuta:
```bash
mvn clean install
```

---

## 📚 Recursos

- [Documentación de ANTLR4](https://www.antlr.org/)
- [Documentación de JavaFX](https://openjfx.io/)
- [Logo Programming Language](https://en.wikipedia.org/wiki/Logo_(programming_language))

---

## 👥 Contribuidores

- Tu nombre aquí

---

## 📄 Licencia

Este proyecto es de código abierto y está disponible bajo la licencia MIT.

---

## 🎯 Próximas Funcionalidades

- [ ] Implementar intérprete completo
- [ ] Agregar más primitivas de Logo
- [ ] Exportar dibujos como imagen
- [ ] Modo de depuración paso a paso
- [ ] Autocompletado en el editor
- [ ] Resaltado de sintaxis

---

**¡Disfruta programando con LogoTEC! 🐢**

