import java.util.List;

public class PedidoCompra {
    private DetallePedido detallePedido;
    private Area estadoPedido;
    private List<Area> areas;
    private String historial;
    

    public PedidoCompra(DetallePedido detallePedido) {

        this.historial = "";
        this.estadoPedido = new AreaVentas(); // Estado inicial del pedido
        this.areas = new java.util.ArrayList<Area>();
        this.detallePedido = detallePedido;
        areas.add(new AreaVentas()); // Agregar área de ventas como ejemplo
        areas.add(new AreaCobranzas()); // Agregar área de cobranzas como ejemplo
        areas.add(new AreaImpuestos()); // Agregar área de impuestos como ejemplo
        areas.add(new AreaEntrega()); // Agregar área de entrega como ejemplo
        areas.add(new AreaSeguimiento()); // Agregar área de seguimiento como ejemplo
        areas.add(new AreaEmbarque()); // Agregar área de embarque como ejemplo
        areas.add(new AreaLogistica()); // Agregar área de logística como ejemplo
    }

    public void avanzarEstado(Area nuevo) {
        estadoPedido = nuevo;
        notificarAreas();
        historial += "Estado cambiado de " + (estadoPedido != null ? estadoPedido.getClass().getSimpleName() : "Ninguno") + " a " + nuevo.getClass().getSimpleName() + "\n";
        if (estadoPedido != null) {
            estadoPedido.procesarPedido(this);
        }
        
        
    }
    public int getCosto() {
        // Implementación
        return 0;
    }
    public String getHistorial() {
        return historial;
    }
    public void añadirArea(Area a) {
        if (a == null) {
            throw new IllegalArgumentException("El área no puede ser nula");
        }
        if (!areas.contains(a)) {
            areas.add(a);
        } else {
            throw new IllegalArgumentException("El área ya está registrada.");
        }
    }
    public void quitarArea(Area a) {
        if (a == null) {
            throw new IllegalArgumentException("El área no puede ser nula");
        }
        if (areas.contains(a)) {
            areas.remove(a);
        } else {
            throw new IllegalArgumentException("El área no está registrada.");
        }
    }
    private void notificarAreas() {
        for (Area area : areas) {
            System.out.println("Notificando a " + area.getClass().getSimpleName()  + " del cambio de estado del pedido.");
        }
        
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        PedidoCompra other = (PedidoCompra) obj;
        if (detallePedido == null || other.detallePedido == null) return false;
        return detallePedido.getNroPedido() == other.detallePedido.getNroPedido();
    }

    public DetallePedido getDetallePedido() {
        return detallePedido;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append("").append(detallePedido);
        sb.append(", estadoPedido:").append(estadoPedido != null ? estadoPedido.getClass().getSimpleName()+"\n" : "Ninguno"+"\n");
        sb.append(", historial:'").append(historial).append('\'');
        return sb.toString();
    }

    public Area getEstado() {
        return estadoPedido;
    }
}