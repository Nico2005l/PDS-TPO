import java.util.List;

public class FacadeComprador {
    private Sistema sistema;
    private String cliente;

    public FacadeComprador(Sistema sistema, String cliente) {
        this.sistema = sistema;
        this.cliente = cliente;
    }

    public void verMisPedidos() {
        List<PedidoCompra> pedidos = sistema.getPedidosPorCliente(cliente);
        for (PedidoCompra pedido : pedidos) {
            System.out.println(pedido);
        }
        
    }

    public void verVehiculosDisponibles() {
        // Mostrar vehículos que no estén en proceso de venta
        List<Vehiculo> vehiculosDisponibles = sistema.getCatalogoVehiculos();
        for (Vehiculo vehiculo : vehiculosDisponibles) {
            if (!vehiculo.isEnVenta()) {
                System.out.println(vehiculo);
            }
        }
    }
}
