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
}