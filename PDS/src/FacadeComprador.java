public class FacadeComprador {
    private Sistema sistema;
    private String dniCliente;

    public void verMisPedidos(String dniCliente) {
        for (PedidoCompra pedido : sistema.getPedidos()) {
            if (pedido.getDetallePedido().getCliente().getDni().equals(this.dniCliente)) {
                System.out.println(pedido);
            }
        }
    }

    public void verVehiculosDisponibles() {
        // Mostrar vehículos que no estén en proceso de venta
    }
}
