package escritura;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) {
        // Ruta del archivo donde se escribirá
        String filePath = "output.txt";

        // Usando PrintWriter para escribir en el archivo
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            writer.println("Esta es la primera línea de texto.");
            writer.println("Esta es la segunda línea de texto.");
            writer.println("¡Es fácil escribir texto en un archivo usando PrintWriter!");

            // Escribiendo un entero
            int number = 42;
            writer.println("El número es: " + number);

            // Escribiendo un objeto
            Object obj = new Object();
            writer.println("La referencia del objeto es: " + obj);

            System.out.println("Texto escrito exitosamente en " + filePath);
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el archivo: " + e.getMessage());
        }
    }
}
