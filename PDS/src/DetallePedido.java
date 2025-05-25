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

    public void calcularCosto() {
        // Implementación
    }

    public void agregarAdicional(ConfiguracionAdicional adicional) {
        // Implementación
    }

    public DetallePedido(int nroPedido, Date fechaCreacion, Cliente cliente, Vehiculo vehiculo,
            List<ConfiguracionAdicional> adicionales, Vendedor vendedor, FormaPago formaDePago) {
        this.nroPedido = nroPedido;
        this.fechaCreacion = fechaCreacion;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.adicionales = adicionales;
        this.vendedor = vendedor;
        this.formaDePago = formaDePago;
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