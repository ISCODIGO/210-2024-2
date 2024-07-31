public class TransferenciaBancaria implements Pago {
    private String estado;

    @Override
    public void realizarPago(double monto) {
        estado = "Pago por transferencia bancaria de " + monto + " realizado.";
        System.out.println(estado);
    }

    @Override
    public void cancelarPago() {
        estado = "Pago por transferencia bancaria cancelado.";
        System.out.println(estado);
    }

    @Override
    public String obtenerEstado() {
        return estado;
    }
}
