package anonymous;

interface Saludo {
    void saludar();
}

public class Main {
    public static void main(String[] args) {
        // Implementación de una clase anónima de la interfaz Saludo
        Saludo saludoAnonimo = new Saludo() {
            @Override
            public void saludar() {
                System.out.println("Hola desde una clase anónima");
            }
        };

        // Llamar al método de la clase anónima
        saludoAnonimo.saludar();
    }
}
