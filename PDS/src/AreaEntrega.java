public class AreaEntrega implements Area {
    private Area siguienteArea = new AreaSeguimiento();
    @Override
    public void procesarPedido(PedidoCompra p) {
        System.out.println("Procesando pedido en el área de entrega.");
        p.avanzarEstado(siguienteArea);
    }
    
}