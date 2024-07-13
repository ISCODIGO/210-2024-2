package pkg0;

public class Encapsulamiento {
    public int atrPublico;
    private int atrPrivado;
    protected int atrProtegido;
    int atrDefault;

    public static void main(String[] args) {
        Encapsulamiento x = new Encapsulamiento();
        x.atrPrivado = 10;
        x.atrProtegido = 20;
        x.atrDefault = 30;
        x.atrPublico = 40;

        Encapsulamiento y = new Encapsulamiento(1, 2, 3, 4);

        Encapsulamiento z = new Encapsulamiento(y);
        System.out.println(z.atrPublico);
    }

    public Encapsulamiento(int atrDefault, int atrProtegido, int atrPrivado, int atrPublico) {
        this.atrDefault = atrDefault;
        this.atrProtegido = atrProtegido;
        this.atrPrivado = atrPrivado;
        this.atrPublico = atrPublico;
    }

    public Encapsulamiento() {
    }

    public Encapsulamiento(Encapsulamiento otro) {
        this.atrDefault = otro.atrDefault;
        this.atrProtegido = otro.atrProtegido;
        this.atrPrivado = otro.atrPrivado;
        this.atrPublico = otro.atrPublico;
    }

    public int getAtrPublico() {
        return atrPublico;
    }

    public void setAtrPublico(int atrPublico) {
        this.atrPublico = atrPublico;
    }

    public int getAtrPrivado() {
        return atrPrivado;
    }

    public void setAtrPrivado(int atrPrivado) {
        this.atrPrivado = atrPrivado;
    }

    public int getAtrProtegido() {
        return atrProtegido;
    }

    public void setAtrProtegido(int atrProtegido) {
        this.atrProtegido = atrProtegido;
    }

    public int getAtrDefault() {
        return atrDefault;
    }

    public void setAtrDefault(int atrDefault) {
        this.atrDefault = atrDefault;
    }
}
