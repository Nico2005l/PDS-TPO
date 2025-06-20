public class FacadeAdmin {
    private Sistema sistema;

    public FacadeAdmin(Sistema sistema) {
        this.sistema = sistema;
    }

    public void verClientes() {
        // mostrar todos los clientes
        for (Cliente c : sistema.getClientes()) {
            System.out.println(c.getNombre() + " " + c.getApellido() + " - DNI: " + c.getDni());
        }
    }

    public void verVehiculos() {
        // mostrar todos los vehículos
        for (Vehiculo v : sistema.getCatalogoVehiculos()) {
            System.out.println(v.getMarca() + " " + v.getModelo() + " - Chasis: " + v.getNroChasis());
        }
    }

    public void verPedidos() {
        // mostrar todos los pedidos
        for (PedidoCompra p : sistema.getPedidos()) {
            System.out.println("Pedido Nro: " + p.getDetallePedido().getNroPedido());
        }
    }

    public void generarInformes() {
        sistema.generarInforme();
    }

    public void administrarConfiguracion() {
        
    }
}
