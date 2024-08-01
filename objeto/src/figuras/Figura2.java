package figuras;

public class Figura2 {
    double lados;
    double largo;

    public Figura2(double lados, double largo) {
        this.lados = lados;
        this.largo = largo;
    }

    public double perimetro() {
        return lados * largo;
    }

    public double area() {
        return 0;
    }
}
