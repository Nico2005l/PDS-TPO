import java.util.List;

public class PedidoCompra {
    private DetallePedido detallePedido;
    private Area estadoPedido;
    private List<Area> areas;
    private String historial;

    public void avanzarEstado(Area nuevo) {
        // Implementación
    }
    public void crearDetallePedido() {
        // Implementación
    }
    public int getCosto() {
        // Implementación
        return 0;
    }
    public String getHistorial() {
        return historial;
    }
    public void añadirArea(Area a) {
        // Implementación
    }
    public void quitarArea(Area a) {
        // Implementación
    }
    private void notificarAreas() {
        // Implementación
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        PedidoCompra other = (PedidoCompra) obj;
        if (detallePedido == null || other.detallePedido == null) return false;
        return detallePedido.getNroPedido() == other.detallePedido.getNroPedido();
    }
}