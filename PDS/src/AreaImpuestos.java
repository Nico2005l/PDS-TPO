public class AreaImpuestos implements Area {
    private Area siguienteArea = new AreaEmbarque();
    @Override
    public void procesarPedido(PedidoCompra p) {
        System.out.println("Procesando pedido en el área de impuestos.");
        p.avanzarEstado(siguienteArea);
    }
    @Override
    public void actualizarEstado() {
        System.out.println("Área Ventas: estado interno actualizado.");
    }
  
}