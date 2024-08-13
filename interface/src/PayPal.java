public class PayPal implements Pago {
    private String estado;

    @Override
    public void realizarPago(double monto) {
        estado = "Pago con PayPal de " + monto + " realizado.";
        System.out.println(estado);
    }

    @Override
    public void cancelarPago() {
        estado = "Pago con PayPal cancelado.";
        System.out.println(estado);
    }

    @Override
    public String obtenerEstado() {
        return estado;
    }
}