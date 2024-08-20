package lectura;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader(new File("src/wikipedia.txt"));

        int c, iteraciones = 0;
        do {
            c = fr.read();
            System.out.print((char) c);
            iteraciones++;
        } while (c != -1);

        System.out.printf("%n** Leyo el contenido en %d iteraciones **", iteraciones);
    }
}
