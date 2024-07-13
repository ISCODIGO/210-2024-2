package pkg1;

import pkg0.Encapsulamiento;

public class OtroPackage {
    public static void main(String[] args) {
        Encapsulamiento x = new Encapsulamiento();
        // x.atrPrivado = 10;
        // x.atrProtegido = 20;
        // x.atrDefault = 30;
        x.atrPublico = 40;
    }
}
