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
    // getters, setters, constructor
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
}