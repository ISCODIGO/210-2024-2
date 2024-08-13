// Definimos una interfaz llamada Pago
public interface Pago {
    void realizarPago(double monto);
    void cancelarPago();
    String obtenerEstado();
}
