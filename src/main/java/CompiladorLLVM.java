import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CompiladorLLVM {
    public static void main(String[] args) {
        try {
            // Generar archivo objeto desde el .ll
            ejecutarComando("llc -filetype=obj programa.ll -o programa.o");

            // Compilar el runtime en C++
            ejecutarComando("clang++ -c native/logo_runtime.cpp -o logo_runtime.o");

            // Enlazar ambos objetos
            ejecutarComando("clang++ programa.o logo_runtime.o  -no-pie -o programa");

            // Ejecutar el binario final
            ejecutarComando("./programa");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Método auxiliar para ejecutar comandos y mostrar salida
    private static void ejecutarComando(String comando) throws Exception {
        System.out.println("\n>>> Ejecutando: " + comando);
        ProcessBuilder pb = new ProcessBuilder("bash", "-c", comando);
        pb.redirectErrorStream(true); // Combina stdout y stderr
        Process proceso = pb.start();

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(proceso.getInputStream()))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        }

        int codigoSalida = proceso.waitFor();
        System.out.println("Código de salida: " + codigoSalida);
        if (codigoSalida != 0) {
            throw new RuntimeException("Error al ejecutar: " + comando);
        }
    }
}

