import java.util.List;

public class FacadeVendedor {
    private Sistema sistema;

    public FacadeVendedor(Sistema sistema) {
        this.sistema = sistema;
    }

    public void verVehiculosDisponibles() {
        System.out.println();
        // Mostrar vehículos que no estén en proceso de venta
        List<Vehiculo> vehiculosDisponibles = sistema.getCatalogoVehiculos();
        for (Vehiculo vehiculo : vehiculosDisponibles) {
            if (!vehiculo.isEnVenta()) {
                System.out.println(vehiculo);
            }
        }
    }
}
