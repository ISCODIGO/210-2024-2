public class Main {
    static void saludar(String saludo, String... nombres) {
        int conteo = 0;
        for(String nombre : nombres) {
            if (conteo == 2) {
                return;
            }
            System.out.println(saludo + " " + nombre);
            conteo++;
        }
    }

    /*static int sumar(int a, int b) {
        return a + b;
    }

    static int sumar(int a, int b, int c) {
        return a + b + c;
    }

    static int sumar(int[] arr) {
        int suma = 0;
        for (int i = 0; i < arr.length; i++) {
            suma += arr[i];
        }
        return suma;
    }*/

    static int sumar(int... numeros) {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        return suma;
    }


    public static void main(String[] args) {
        saludar("Que tal", "Jose");
        short x = 10;
        byte y = 20;
        double d = 3.45;
        System.out.println(sumar(x, y));
        System.out.println(sumar(1, 2, 3));
        System.out.println(sumar(new int[]{
                10, 20, 30, 40, 50
        }));

        saludar("Hola", "Jose", "Maria", "Pedro");
    }
}