package figuras;

public class Circulo implements Figura {
    public double radio;


    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double perimetro() {
        return Math.PI * radio * 2.0;
    }
}
