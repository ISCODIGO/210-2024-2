package staticinner;

public class OuterClass {
    private static String mensaje = "Hola desde la clase externa estática";

    // Static inner class
    static class StaticInnerClass {
        void mostrarMensaje() {
            // Accediendo al miembro estático de la clase contenedora
            System.out.println(mensaje);
        }
    }

    public static void main(String[] args) {
        // Crear una instancia de la clase interna estática
        OuterClass.StaticInnerClass inner = new OuterClass.StaticInnerClass();
        // Llamar al método de la clase interna estática
        inner.mostrarMensaje();
    }
}
