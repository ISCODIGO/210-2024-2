public class Main {
    public static void main(String[] args) {
        Pago pagoTarjeta = new TarjetaCredito();
        Pago pagoPayPal = new PayPal();
        Pago pagoTransferencia = new TransferenciaBancaria();

        // Realizar pagos
        pagoTarjeta.realizarPago(100.50);
        System.out.println(pagoTarjeta.obtenerEstado());
        pagoTarjeta.cancelarPago();
        System.out.println(pagoTarjeta.obtenerEstado());

        pagoPayPal.realizarPago(200.75);
        System.out.println(pagoPayPal.obtenerEstado());
        pagoPayPal.cancelarPago();
        System.out.println(pagoPayPal.obtenerEstado());

        pagoTransferencia.realizarPago(300.25);
        System.out.println(pagoTransferencia.obtenerEstado());
        pagoTransferencia.cancelarPago();
        System.out.println(pagoTransferencia.obtenerEstado());
    }
}
