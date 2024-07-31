// Implementamos la interfaz Pago en una clase llamada TarjetaCredito
public class TarjetaCredito implements Pago {
    private String estado;

    @Override
    public void realizarPago(double monto) {
        estado = "Pago con tarjeta de crédito de " + monto + " realizado.";
        System.out.println(estado);
    }

    @Override
    public void cancelarPago() {
        estado = "Pago con tarjeta de crédito cancelado.";
        System.out.println(estado);
    }

    @Override
    public String obtenerEstado() {
        return estado;
    }
}
