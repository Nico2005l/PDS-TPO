public class AreaCobranzas implements Area {
    private Area siguienteArea = new AreaImpuestos();
    @Override
    public void procesarPedido(PedidoCompra p) {
        System.out.println("Procesando pedido en el área de cobranzas.");
        p.avanzarEstado(siguienteArea);
    }
    @Override
    public void actualizarEstado() {

        System.out.println("Área Ventas: estado interno actualizado.");
    }
    
}