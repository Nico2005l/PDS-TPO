public class DetallePedidoBuilder {
    private DetallePedido detalle;

    public DetallePedidoBuilder() {
        reset();
    }

    public void reset() {
        detalle = new DetallePedido();
    }

    public void buildVehiculo(Vehiculo vehiculo) {
        detalle.setVehiculo(vehiculo);
    }

    public void buildCliente(Cliente cliente) {
        detalle.setCliente(cliente);
    }

    public void buildAdicionales() {
        // Implementar según lógica
    }

    public void buildVendedor(Vendedor vendedor) {
        detalle.setVendedor(vendedor);
    }

    public void buildFormaDePago(FormaPago forma) {
        detalle.setFormaDePago(forma);
    }

    public DetallePedido getResult() {
        return detalle;
    }
}