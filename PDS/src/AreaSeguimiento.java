public class AreaSeguimiento implements Area {
    @Override
    public void procesarPedido(PedidoCompra p) {
        System.out.println("Procesando pedido en el área de seguimiento.");
        // Aquí podrías agregar lógica específica para el seguimiento del pedido.
        // Por ejemplo, actualizar el estado del pedido o notificar al cliente.
        
        // Si no hay más áreas, podrías finalizar el proceso o realizar
    }

    @Override
    public void actualizarEstado() {
        // Simula transición de estado interno de ventas
        System.out.println("Área Ventas: estado interno actualizado.");
    }
}
