package escritura;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        // Ruta del archivo donde se escribirá
        String filePath = "output.txt";

        // Usando FileWriter para sobrescribir en el archivo
        try (FileWriter writer = new FileWriter(filePath, false)) { // El segundo argumento 'false' indica sobrescribir
            writer.write("Esta es la nueva primera línea de texto.\n");
            writer.write("Esta es la nueva segunda línea de texto.\n");
            writer.write("Este archivo ha sido sobrescrito.\n");

            System.out.println("Texto sobrescrito exitosamente en " + filePath);
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el archivo: " + e.getMessage());
        }
    }
}
