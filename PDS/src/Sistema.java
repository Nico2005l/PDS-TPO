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
        // Cargar datos iniciales si es necesario
        cargarDatosIniciales();
    }

    private void cargarDatosIniciales() {
        // Aquí puedes cargar datos iniciales si es necesario
        // Por ejemplo, agregar algunos vehículos y clientes de prueba
        Vehiculo vehiculo1 = new Auto("Toyota", 500000, "Corolla", "Rojo", "CH123456789", "MO987654321");
        Vehiculo vehiculo2 = new Auto("Ford", 600000, "Focus", "Azul", "CH987654321", "MO123456789");
        Vehiculo vehiculo3 = new Auto("Chevrolet", 550000, "Onix", "Blanco", "CH111111111", "MO222222222");
        Vehiculo vehiculo4 = new Auto("Volkswagen", 700000, "Golf", "Negro", "CH333333333", "MO444444444");
        Vehiculo vehiculo5 = new Auto("Renault", 480000, "Sandero", "Gris", "CH555555555", "MO666666666");
        Vehiculo vehiculo6 = new Auto("Peugeot", 530000, "208", "Rojo", "CH777777777", "MO888888888");
        Vehiculo vehiculo7 = new Auto("Honda", 800000, "Civic", "Azul", "CH999999999", "MO000000000");
        Vehiculo vehiculo8 = new Auto("Nissan", 620000, "Sentra", "Blanco", "CH121212121", "MO343434343");
        Vehiculo vehiculo9 = new Auto("Fiat", 470000, "Cronos", "Gris", "CH565656565", "MO787878787");
        Vehiculo vehiculo10 = new Auto("Kia", 750000, "Rio", "Negro", "CH909090909", "MO101010101");
        Vehiculo vehiculo11 = new Auto("Hyundai", 850000, "Elantra", "Azul", "CH232323232", "MO454545454");
        Vehiculo vehiculo12 = new Auto("Mazda", 900000, "3", "Rojo", "CH676767676", "MO898989898");
        Vehiculo vehiculo13 = new Auto("Subaru", 950000, "Impreza", "Blanco", "CH212121212", "MO434343434");
        Vehiculo vehiculo14 = new Auto("Mitsubishi", 780000, "Lancer", "Gris", "CH656565656", "MO878787878");
        Vehiculo vehiculo15 = new Auto("Suzuki", 520000, "Swift", "Rojo", "CH191919191", "MO232323232");
        Vehiculo vehiculo16 = new Auto("Jeep", 1200000, "Renegade", "Negro", "CH353535353", "MO575757575");
        Vehiculo vehiculo17 = new Auto("BMW", 2000000, "320i", "Blanco", "CH797979797", "MO131313131");
        Vehiculo vehiculo18 = new Auto("Mercedes-Benz", 2500000, "Clase A", "Gris", "CH171717171", "MO292929292");
        Vehiculo vehiculo19 = new Auto("Audi", 2300000, "A3", "Azul", "CH393939393", "MO616161616");
        Vehiculo vehiculo20 = new Auto("Lexus", 2700000, "IS", "Rojo", "CH838383838", "MO353535353");

        catalogoVehiculos.add(vehiculo1);
        catalogoVehiculos.add(vehiculo2);
        catalogoVehiculos.add(vehiculo3);
        catalogoVehiculos.add(vehiculo4);
        catalogoVehiculos.add(vehiculo5);
        catalogoVehiculos.add(vehiculo6);
        catalogoVehiculos.add(vehiculo7);
        catalogoVehiculos.add(vehiculo8);
        catalogoVehiculos.add(vehiculo9);
        catalogoVehiculos.add(vehiculo10);
        catalogoVehiculos.add(vehiculo11);
        catalogoVehiculos.add(vehiculo12);
        catalogoVehiculos.add(vehiculo13);
        catalogoVehiculos.add(vehiculo14);
        catalogoVehiculos.add(vehiculo15);
        catalogoVehiculos.add(vehiculo16);
        catalogoVehiculos.add(vehiculo17);
        catalogoVehiculos.add(vehiculo18);
        catalogoVehiculos.add(vehiculo19);
        catalogoVehiculos.add(vehiculo20);
        catalogoVehiculos.add(vehiculo1);
        catalogoVehiculos.add(vehiculo2);
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
    public void registrarPedido(Cliente c, Vendedor v, Vehiculo vehiculo, FormaPago forma) {
        DetallePedido detalle = new DetallePedidoBuilder().getResult(vehiculo, c, v, forma, List.of());
        PedidoCompra p = new PedidoCompra(detalle);
        

        if (!pedidoCompras.contains(p)) {
            pedidoCompras.add(p);
        }else {
            throw new IllegalArgumentException("El pedido ya está registrado.");
        }
    }

    public List<PedidoCompra> getPedidosPorCliente(String dni) {
        List<PedidoCompra> pedidosPorCliente = new ArrayList<>();
        for (PedidoCompra pedido : pedidoCompras) {
            if (pedido.getDetallePedido().getCliente().getDni().equals(dni)) {
                pedidosPorCliente.add(pedido);
            }
        }
        return pedidosPorCliente;
    }

    public List<PedidoCompra> getPedidosPorEstado(Area estado) {
        List<PedidoCompra> pedidosPorEstado = new ArrayList<>();
        for (PedidoCompra pedido : pedidoCompras) {
            if (pedido.getEstado().equals(estado)) {
                pedidosPorEstado.add(pedido);
            }
        }
        return pedidosPorEstado;
    }

    public void generarInforme(String titulo, String contenido) {
        Informe.imprimirInforme(titulo, contenido);
    }
}