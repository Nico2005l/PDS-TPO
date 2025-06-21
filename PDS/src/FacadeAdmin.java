import java.sql.Date;
import java.util.List;

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

    public void generarInforme() {
       
    }

    public void informePorFecha(Date fecha) {
        List<PedidoCompra> pedidosPorFecha = sistema.getPedidosPorFecha(fecha);
        if (pedidosPorFecha.isEmpty()) {
            System.out.println("No hay pedidos para la fecha: " + fecha);
        } else {
            String contenido = "";
            for (PedidoCompra pedido : pedidosPorFecha) {
                contenido += pedido.toString() + "\n" + "---------------------------------\n";
            }
            sistema.generarInforme("Informe Por Fecha", contenido);
        }
    }

    public void informePorEstado(Area estado) {
        List<PedidoCompra> pedidosPorEstado = sistema.getPedidosPorEstado(estado);
        if (pedidosPorEstado.isEmpty()) {
            System.out.println("No hay pedidos con el estado: " + estado);
        } else {
            String contenido = "";
            for (PedidoCompra pedido : pedidosPorEstado) {
                contenido += pedido.toString() + "\n" + "---------------------------------\n";
            }
            sistema.generarInforme("Informe Por Estado", contenido);
        }
    }

    public void administrarConfiguracion() {
        //implementar lógica para administrar la configuración del sistema
        System.out.println("Administrando configuración del sistema...");
    }
}
