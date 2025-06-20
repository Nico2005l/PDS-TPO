import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Sistema {
    private List<Vehiculo> catalogoVehiculos;
    private List<Cliente> clientes;
    private List<PedidoCompra> pedidoCompras;


    public Sistema() {
        this.catalogoVehiculos = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.pedidoCompras = new ArrayList<>();
    }

    public List<Vehiculo> getCatalogoVehiculos() {
        return catalogoVehiculos;
    }

    public List<PedidoCompra> getPedidosPorFecha(Date fecha) {
        List<PedidoCompra> clientesPorFecha = new ArrayList<>();
        for (PedidoCompra pedido : pedidoCompras) {
            if (pedido.getDetallePedido().getFechaCreacion().equals(fecha)) {
                clientesPorFecha.add(pedido);
            }
        }
        return clientesPorFecha;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<PedidoCompra> getPedidos() {
        return pedidoCompras;
    }

    public void cargarCatalogoVehiculos(List<Vehiculo> catalogoVehiculos) {
        this.catalogoVehiculos = catalogoVehiculos;
    }

    public void registrarCliente(Cliente c) {
        if (!clientes.contains(c)) {
            clientes.add(c);
        }else {
            throw new IllegalArgumentException("El cliente ya está registrado.");
        }
    }
    public void registrarVehiculo(Vehiculo v) {
        if (!catalogoVehiculos.contains(v)) {
            catalogoVehiculos.add(v);
        }else {
            throw new IllegalArgumentException("El vehículo ya está registrado.");
        }
    }
    public void registrarPedido(PedidoCompra p) {
        if (!pedidoCompras.contains(p)) {
            pedidoCompras.add(p);
        }else {
            throw new IllegalArgumentException("El pedido ya está registrado.");
        }
    }

    public void realizarPedido(Cliente c, Vendedor v, Vehiculo vehiculo) {
        // Implementación
    }
    public void generarInforme() {
        // Implementación
    }
}