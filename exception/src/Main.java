import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        try {
            System.out.print("Escriba el primer numero: ");
            int numero1 = entrada.nextInt();
            System.out.print("Escriba el segundo numero: ");
            int numero2 = entrada.nextInt();
            System.out.println(numero1 / numero2);
        }
        catch (ArithmeticException e1) {
            System.out.println(e1.getMessage());
        }
        catch (InputMismatchException e2) {
            e2.printStackTrace();
        }
        catch (Exception e3) {
            System.out.println(e3.getMessage());
        }

    }
}