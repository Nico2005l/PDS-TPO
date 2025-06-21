public class AreaVentas implements Area {
    private Area siguienteArea = new AreaCobranzas();
    @Override
    public void procesarPedido(PedidoCompra p) {
        
        p.avanzarEstado(siguienteArea);
    }
    @Override
    public void actualizarEstado() {
        // Simula transición de estado interno de ventas
        System.out.println("Área Ventas: estado interno actualizado.");
    }

    @Override
    public String toString() {
        return "Área Ventas";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        AreaVentas other = (AreaVentas) obj;
        return this.toString().equals(other.toString());
    }
}