public class AreaEmbarque implements Area {
    private Area siguienteArea = new AreaLogistica();
    @Override
    public void procesarPedido(PedidoCompra p) {
        // Implementación específica para el área de embarque
        System.out.println("Procesando pedido en el área de embarque: ");
        // Aquí se pueden agregar más detalles sobre el procesamiento del pedido
        p.avanzarEstado(siguienteArea);

    }
    @Override
    public void actualizarEstado() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actualizarEstado'");
    }
    
}
