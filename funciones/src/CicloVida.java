import java.util.Arrays;

public class CicloVida {
    static void ejemplo(int variable) {
        variable = 100;
        System.out.println("Dentro de la funcion: " + variable);
    }

    static void ejemplo2(int[] arr) {
        arr[0] = 100;
        System.out.println("Dentro" +
                Arrays.toString(arr));  // imprimir el contenido de un array
    }
    public static void main(String[] args) {
        int x = 3;
        ejemplo(x);
        System.out.println("Fuera de la funcion: " + x);

        int[] a = {1, 2, 3, 4};
        System.out.println("Al inicio: " + Arrays.toString(a));
        ejemplo2(a);
        System.out.println("Fuera: " + Arrays.toString(a));
    }
}
