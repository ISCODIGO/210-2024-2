package inner;

public class OuterClass {
    private String mensaje = "Hola desde la clase externa";

    // Inner class
    class InnerClass {
        void mostrarMensaje() {
            // Accediendo al miembro de la clase contenedora
            System.out.println(mensaje);
        }
    }

    public static void main(String[] args) {
        // Crear una instancia de la clase externa
        OuterClass outer = new OuterClass();
        // Crear una instancia de la clase interna
        OuterClass.InnerClass inner = outer.new InnerClass();
        // Llamar al método de la clase interna
        inner.mostrarMensaje();
    }
}
