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

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public void setFormaDePago(FormaPago formaDePago) {
        this.formaDePago = formaDePago;
    }

    public int getNroPedido() {
        return nroPedido;
    }
    public Date getFechaCreacion() {
        return fechaCreacion;
    }
}