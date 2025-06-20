import java.util.Date;
import java.util.List;

public class DetallePedido {
    private int nroPedido;
    private Date fechaCreacion;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private List<ConfiguracionAdicional> adicionales;
    private Vendedor vendedor;
    private FormaPago formaDePago;

    public DetallePedido() {
        this.nroPedido = (int) (Math.random() * 1000000); // Genera un número de pedido aleatorio
        this.fechaCreacion = new Date(); // Fecha actual
    }

    public double calcularCosto() {
        return vehiculo.getCosto() + adicionales.stream()
                .mapToDouble(ConfiguracionAdicional::getCosto)
                .sum();
    }

    public void agregarAdicional(ConfiguracionAdicional adicional) {
        adicionales.add(adicional);
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public void setFormaDePago(FormaPago formaDePago) {
        this.formaDePago = formaDePago;
    }

    public void setAdicionales(List<ConfiguracionAdicional> adicionales) {
        this.adicionales = adicionales;
    }

    public int getNroPedido() {
        return nroPedido;
    }
    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DetallePedido \n");
        sb.append("  nroPedido: ").append(nroPedido).append(",\n");
        sb.append("  fechaCreacion: ").append(fechaCreacion).append(",\n");
        sb.append("  cliente: ").append(cliente != null ? cliente.toString() : "null").append(",\n");
        sb.append("  vehiculo: ").append(vehiculo != null ? vehiculo.toString() : "null").append(",\n");
        sb.append("  adicionales: ");
        if (adicionales != null && !adicionales.isEmpty()) {
            for (int i = 0; i < adicionales.size(); i++) {
                sb.append(adicionales.get(i));
                if (i < adicionales.size() - 1) sb.append(", ");
            }
        }
        sb.append(",\n");
        sb.append("  vendedor: ").append(vendedor != null ? vendedor.toString() : "null").append(",\n");
        sb.append("  formaDePago: ").append(formaDePago != null ? formaDePago.toString() : "null").append("\n");
        sb.append("");
        return sb.toString();
    }
}