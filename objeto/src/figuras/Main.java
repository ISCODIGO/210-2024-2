package figuras;

public class Main {
    public static void main(String[] args) {
        Figura figuras[] = new Figura[3];

        figuras[0] = new Cuadrado(10);
        figuras[1] = new Circulo(10);
        figuras[2] = new Rectangulo(4, 10);

        for (Figura figura : figuras) {
            System.out.println("Area: " + figura.area());
            System.out.println("Perimetro: " + figura.perimetro());
        }
    }
}
