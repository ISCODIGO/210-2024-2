import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        String inputFilePath = "src/input.txt";
        String outputFilePath = "src/output.txt";
        int lineas = 0;
        try {
            /*
            1. Crear un objeto [lector1] para leer del archivo `input.txt`.
			Debe leer carácter por carácter desde el archivo de entrada
    		y almacenar el contenido.

            2. Si el carácter es un salto de línea ‘\n’ contarlo en una
			variable denominada [lineas].
            Al finalizar la lectura, cerrar el objeto lector1.

            3. Crear un objeto [escritor1] para escribir en el archivo `output.txt`
            Debe escribir todo el contenido leído de `input.txt`
            en el archivo de salida, línea por línea.
            Cerrar el objeto escritor1.

            4. Crear un objeto [lector2] para escribir en el archivo `output.txt`
            Este debe agregar (append) en una línea final la cantidad
            de líneas del archivo.
            Cerrar el objeto lector2.
            */

            FileReader lector1 = new FileReader(inputFilePath);
            PrintWriter escritor1 = new PrintWriter(outputFilePath);
            int caracter;
            boolean leer = true;
            while(leer) {
                caracter = lector1.read();

                if (caracter == -1) {
                    leer = false;
                    continue;
                }

                char c = (char) caracter;
                if (c == '\n') {
                    lineas++;
                }
                escritor1.print(c);
            }

            lector1.close();
            escritor1.close();

            FileWriter lector2 = new FileWriter(outputFilePath, true);
            lector2.write("\n" + lineas);
            lector2.close();
        } catch (IOException e) {
            // Manejo de excepciones relacionadas con la entrada/salida
            e.printStackTrace();
        }
    }
}