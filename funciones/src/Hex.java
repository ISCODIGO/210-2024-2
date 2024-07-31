import java.util.Scanner;

public class Hex {
    static int hexValue(char digitoHex) {
        switch (digitoHex) {
            case 'a': case 'A':
                return 10;
            case 'b': case 'B':
                return 11;
            case 'c': case 'C':
                return 12;
            case 'd': case 'D':
                return 13;
            case 'e': case 'E':
                return 14;
            case 'f': case 'F':
                return 15;
        }

        int resultado;
        try {
            resultado = Integer.parseInt(String.valueOf(digitoHex));
        } catch (NumberFormatException e) {
            resultado = -1;
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escriba el valor HEX: ");
        String valorHex = entrada.next();

        int valor = 0;
        for (int i = 0; i < valorHex.length(); i++) {
            int valorDec = hexValue(valorHex.charAt(i));

            if (valorDec == -1) {
                System.out.println("No es un numero HEX");
                return;
            }

            valor = valor * 16 + valorDec;
        }
        System.out.println("DEC: " + valor);
    }
}
/*

ABC
iteracion   letra   valor
1           A       0 + 10
2           B       160 + 11
3           C       171 * 16 + 12 = 2748


 */
