package lambda;

public class Calculadora {
    public static void main(String[] args) {
        // Definición de operaciones utilizando expresiones lambda
        Operacion suma = (double a, double b) -> { return (a + b); };
        Operacion resta = (double a, double b) -> a - b;
        Operacion multiplicacion = (a, b) -> a * b;
        Operacion division = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("No se puede dividir por cero");
            }
            return a / b;
        };

        // Uso de las operaciones
        double num1 = 10;
        double num2 = 5;

        System.out.println("Suma: " + operar(num1, num2, suma));
        System.out.println("Resta: " + operar(num1, num2, resta));
        System.out.println("Multiplicación: " + operar(num1, num2, multiplicacion));
        System.out.println("División: " + operar(num1, num2, division));
    }

    // Método que toma dos números y una operación, y devuelve el resultado de la operación
    public static double operar(double a, double b, Operacion operacion) {
        return operacion.calcular(a, b);
    }
}
