
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

    public void buildAdicionales(List<ConfiguracionAdicional> adicionales) {
        detalle.setAdicionales(adicionales);
    }

    public void buildVendedor(Vendedor vendedor) {
        detalle.setVendedor(vendedor);
    }

    public void buildFormaDePago(FormaPago forma) {
        detalle.setFormaDePago(forma);
    }

    public DetallePedido getResult(Vehiculo vehiculo, Cliente cliente, Vendedor vendedor, FormaPago forma, List<ConfiguracionAdicional> adicionales) {
        reset();
        buildVehiculo(vehiculo);
        buildCliente(cliente);
        buildAdicionales(adicionales);
        buildVendedor(vendedor);
        buildFormaDePago(forma);

        return detalle;
    }
}