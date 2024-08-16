import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/numeros"));
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        String oper = sc.next();

        double res = switch (oper) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> Double.NaN;
        };

        System.out.println("Resultado: " + res);
    }
}
