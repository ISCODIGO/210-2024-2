import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Lectura {
    public static void leerPorScanner() {
        File archivo = new File("src/datos.txt");
        try {
            Scanner sc = new Scanner(archivo);
            while (sc.hasNext()) {
                System.out.println(sc.next());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void leerPorFileReader() throws IOException {
        FileReader fr = new FileReader(new File("src/wikipedia.txt"));

        int c, caracteres = 0;
        do {
            c = fr.read();
            System.out.print((char) c);
            caracteres++;
        } while (c != -1);

        System.out.println("\nLeyo " + caracteres);
    }

    public static void leerPorFileReaderBuffer() throws IOException {
        FileReader fr = new FileReader(new File("src/wikipedia.txt"));

        int c, iteraciones = 0;
        char[] buffer;
        do {
            buffer = new char[1024];
            c = fr.read(buffer);
            System.out.print(String.valueOf(buffer));
            iteraciones++;
        } while (c != -1);

        System.out.println("\nIteraciones " + iteraciones);
    }


    public static void main(String[] args) throws IOException {
        leerPorFileReaderBuffer();
    }
}
