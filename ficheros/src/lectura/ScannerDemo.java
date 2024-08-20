package lectura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {
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
}

