import java.util.List;

public class Pruebas {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        Cliente cliente = new Cliente("Juan Perez", "12345678", "48468790", "dd@mail.com", "123456789");
        Vendedor vendedor = new Vendedor("Maria Lopez", "87654321");
        // Replace 'Auto' with the actual concrete subclass of Vehiculo if different
        Vehiculo vehiculo = new Auto("Toyota", 500000, "Corolla", "Rojo", "CH123456789", "MO987654321");
        // Replace 'TarjetaCredito' with the actual concrete subclass of FormaPago if different
        FormaPago formaPago = new PagoTarjeta();
        sistema.registrarCliente(cliente);
        sistema.registrarVehiculo(vehiculo);
        sistema.registrarPedido(cliente, vendedor, vehiculo, formaPago);
        List<PedidoCompra> pedidos = sistema.getPedidosPorCliente(cliente);

       
        for (PedidoCompra pedido : pedidos) {
            sistema.generarInforme("Informe de Pedidos", pedido.toString());
        }
}
}
