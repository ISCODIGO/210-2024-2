package figuras;

public class Figura1 {
    private int lados;
    private int largo;

    public double area() {
        switch (lados) {
            case 3 -> { return Math.sqrt(3) * largo / 4.0; }
            case 4 -> { return Math.pow(largo, 2); }
        }
        return 0;
    }

    public double perimetro() {
        return lados * largo;
    }
}
