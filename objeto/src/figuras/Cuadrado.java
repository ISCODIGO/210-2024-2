package figuras;

public class Cuadrado implements Figura {
    private double largo;
    private final double LADOS = 4;

    public Cuadrado(double largo) {
        this.largo = largo;
    }

    @Override
    public double area() {
        return largo * largo;
    }

    @Override
    public double perimetro() {
        return LADOS * largo;
    }
}
