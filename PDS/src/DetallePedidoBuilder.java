import java.util.ArrayList;
import java.util.List;

public class DetallePedidoBuilder {
    private DetallePedido detalle;

    public DetallePedidoBuilder() {
        reset();
    }

    public void reset() {
        detalle = new DetallePedido();
    }

    public void buildVehiculo(Vehiculo vehiculo) {
        detalle.setVehiculo(vehiculo);
    }

    public void buildCliente(Cliente cliente) {
        detalle.setCliente(cliente);
    }

    public void buildAdicionales() {
        // Ejemplo: agregar adicionales por defecto
        List<ConfiguracionAdicional> adicionales = new ArrayList<>();
        adicionales.add(new ConfiguracionAdicional("Seguro básico", 5000));
        adicionales.add(new ConfiguracionAdicional("Kit de emergencia", 1500));
        detalle.setAdicionales(adicionales);
    }

    public void buildVendedor(Vendedor vendedor) {
        detalle.setVendedor(vendedor);
    }

    public void buildFormaDePago(FormaPago forma) {
        detalle.setFormaDePago(forma);
    }

    public DetallePedido getResult(Vehiculo vehiculo, Cliente cliente, Vendedor vendedor, FormaPago forma) {
        reset();
        buildVehiculo(vehiculo);
        buildCliente(cliente);
        buildAdicionales();
        buildVendedor(vendedor);
        buildFormaDePago(forma);

        return detalle;
    }
}