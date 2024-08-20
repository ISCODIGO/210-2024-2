package escritura;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterAppendDemo {
    public static void main(String[] args) {
        // Ruta del archivo donde se agregará el contenido
        String filePath = "output.txt";

        // Usando FileWriter para agregar contenido al archivo
        try (FileWriter writer = new FileWriter(filePath, true)) { // El segundo argumento 'true' indica agregar contenido
            writer.write("Esta es una nueva línea agregada.\n");
            writer.write("Otra línea agregada al final del archivo.\n");

            System.out.println("Contenido agregado exitosamente en " + filePath);
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el archivo: " + e.getMessage());
        }
    }
}
