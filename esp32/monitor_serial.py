#!/usr/bin/env python3
"""
Monitor Serial del ESP32 - LogoTEC
Monitorea el puerto serial del ESP32 y muestra los datos en tiempo real
"""

import serial
import serial.tools.list_ports
import sys
import time


def find_esp32_port():
    """Busca automáticamente el puerto del ESP32"""
    ports = serial.tools.list_ports.comports()

    for port in ports:
        # ESP32 suele aparecer como CP210x, CH340, o USB Serial
        if any(
            keyword in port.description.upper()
            for keyword in ["CP210", "CH340", "USB", "SERIAL", "ESP32"]
        ):
            return port.device

    return None


def list_ports():
    """Lista todos los puertos disponibles"""
    ports = serial.tools.list_ports.comports()
    print("\nPuertos seriales disponibles:")
    print("-" * 60)
    for i, port in enumerate(ports):
        print(f"{i+1}. {port.device}")
        print(f"   Descripción: {port.description}")
        print(f"   Hardware ID: {port.hwid}")
        print()
    return ports


def monitor_serial(port, baudrate=115200):
    """Monitorea el puerto serial"""
    try:
        print(f"\n{'='*60}")
        print(f"Conectando a {port} @ {baudrate} baud...")
        print(f"{'='*60}\n")

        ser = serial.Serial(port, baudrate, timeout=1)
        time.sleep(2)  # Esperar a que se establezca la conexión

        print("[OK] Conexion establecida")
        print("Presiona Ctrl+C para detener el monitoreo\n")
        print(f"{'─'*60}\n")

        while True:
            if ser.in_waiting > 0:
                try:
                    line = ser.readline().decode("utf-8", errors="replace").rstrip()
                    if line:
                        print(line)
                except UnicodeDecodeError:
                    pass

    except serial.SerialException as e:
        print(f"\n[ERROR] Error de conexion serial: {e}")
        print("Verifica que:")
        print("  1. El ESP32 este conectado")
        print("  2. No haya otro programa usando el puerto")
        print("  3. Tengas permisos para acceder al puerto")
        sys.exit(1)
    except KeyboardInterrupt:
        print(f"\n\n{'─'*60}")
        print("Monitor detenido por el usuario")
        print(f"{'─'*60}\n")
        ser.close()
        sys.exit(0)
    except Exception as e:
        print(f"\n[ERROR] Error inesperado: {e}")
        sys.exit(1)


def main():
    print("╔" + "═" * 58 + "╗")
    print("║  LogoTEC - Monitor Serial ESP32                          ║")
    print("╚" + "═" * 58 + "╝")

    # Intentar encontrar el ESP32 automáticamente
    port = find_esp32_port()

    if port:
        print(f"\n[OK] ESP32 detectado en: {port}")
        response = input("¿Usar este puerto? (S/n): ").strip().lower()
        if response == "n":
            port = None

    # Si no se encontró o el usuario rechazó, mostrar lista
    if not port:
        ports = list_ports()

        if not ports:
            print("\n[ERROR] No se encontraron puertos seriales")
            print("Verifica que el ESP32 este conectado")
            sys.exit(1)

        try:
            selection = int(input("\nSelecciona el numero del puerto: ")) - 1
            if 0 <= selection < len(ports):
                port = ports[selection].device
            else:
                print("[ERROR] Seleccion invalida")
                sys.exit(1)
        except ValueError:
            print("[ERROR] Entrada invalida")
            sys.exit(1)

    # Preguntar por el baudrate
    baudrate_input = input("\nBaudrate (default 115200): ").strip()
    baudrate = int(baudrate_input) if baudrate_input else 115200

    # Iniciar monitoreo
    monitor_serial(port, baudrate)


if __name__ == "__main__":
    main()
