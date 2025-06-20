public class PagoContado implements FormaPago {
    @Override
    public boolean procesarPago(double monto) {
        return true;
    }

    
}
