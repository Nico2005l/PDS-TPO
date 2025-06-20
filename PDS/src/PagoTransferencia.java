public class PagoTransferencia implements FormaPago {
    @Override
    public boolean procesarPago(double monto) {
        // Implementación
        return true;
    }
    @Override
    public String toString() {
        return "Pago Transferencia";
    }
}