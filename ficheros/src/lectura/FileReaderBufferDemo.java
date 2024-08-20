package lectura;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderBufferDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader(new File("src/wikipedia.txt"));

        int c, iteraciones = 0;
        char[] buffer;
        do {
            buffer = new char[1024];
            c = fr.read(buffer);
            System.out.print(String.valueOf(buffer));
            iteraciones++;
        } while (c != -1);

        System.out.printf("%n** Leyo el contenido en %d iteraciones **", iteraciones);
    }
}

