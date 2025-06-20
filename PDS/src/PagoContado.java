public class PagoContado implements FormaPago {
    @Override
    public boolean procesarPago(double monto) {
        return true;
    }

    @Override
    public String toString() {
        return "Pago Contado";
    }

    
}
