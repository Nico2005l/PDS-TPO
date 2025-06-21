public class AreaEntrega implements Area {
    private Area siguienteArea = new AreaSeguimiento();
    @Override
    public void procesarPedido(PedidoCompra p) {
        
        p.avanzarEstado(siguienteArea);
    }
    @Override
    public void actualizarEstado() {
        System.out.println("Área Ventas: estado interno actualizado.");
    }
    
}