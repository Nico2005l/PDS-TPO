public class AreaSeguimiento implements Area {
    @Override
    public void procesarPedido(PedidoCompra p) {
        System.out.println("Procesando pedido en el área de seguimiento.");
    }

    @Override
    public void actualizarEstado() {
        // Simula transición de estado interno de ventas
        System.out.println("Área Ventas: estado interno actualizado.");
    }
}
