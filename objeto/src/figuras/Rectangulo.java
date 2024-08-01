package figuras;

public class Rectangulo implements Figura {
    double ancho;
    double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double perimetro() {
        return 2 * alto + 2 * ancho;
    }

    @Override
    public double area() {
        return alto * ancho;
    }
}
