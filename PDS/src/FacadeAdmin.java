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

    public void eliminarCliente(Cliente cliente) {
        if (sistema.getClientes().contains(cliente)) {
            // Actualizar cliente
            sistema.getClientes().remove(cliente);
        }else {
            throw new IllegalArgumentException("El cliente no está registrado.");
        }
    }

    public void eliminarVehiculo(Vehiculo vehiculo) {
        if (sistema.getCatalogoVehiculos().contains(vehiculo)) {
            // Actualizar vehículo
            sistema.getCatalogoVehiculos().remove(vehiculo);
        }else {
            throw new IllegalArgumentException("El vehículo no está registrado.");
        }
    }

    public void eliminarPedido(PedidoCompra pedido) {
        if (sistema.getPedidos().contains(pedido)) {
            // Actualizar pedido
            sistema.getPedidos().remove(pedido);
        }else {
            throw new IllegalArgumentException("El pedido no está registrado.");
        }
    }

    public void generarInformes() {
        sistema.generarInforme();
    }

    public void administrarConfiguracion() {
        //terminar
    }
}
