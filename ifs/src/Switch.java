import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba un numero [1-7]: ");
        int opcion = entrada.nextInt();

        switch (opcion) {
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Lunes");
            case 7 -> System.out.println("Sabado");
            default -> {
                System.out.println("Opcion default");
                System.out.println("Dia no valido");
            }
        }

        String dia = switch (opcion) {
            case 1 -> "Domingo";
            case 2 -> "Lunes";
            case 7 -> "Sabado";
            default -> "Dia no valido";
        };

        System.out.println(dia);
    }
}
