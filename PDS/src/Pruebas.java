public class Pruebas {
    public static void main(String[] args) {
        PedidoCompra pedido = new PedidoCompra();
        
        pedido.avanzarEstado(new AreaVentas());
    }
}
