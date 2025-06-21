public class AreaSeguimiento implements Area {
    @Override
    public void procesarPedido(PedidoCompra p) {
        System.out.println("Procesando pedido en el área de seguimiento.");
    }

    @Override
    public void actualizarEstado() {
        System.out.println("Área Ventas: estado interno actualizado.");
    }

    @Override
    public String toString() {
        return "Área Seguimiento";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        AreaSeguimiento other = (AreaSeguimiento) obj;
        return this.toString().equals(other.toString());
    }
}
