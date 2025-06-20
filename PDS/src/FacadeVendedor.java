import java.util.List;

public class FacadeVendedor {
    private Sistema sis;

    public FacadeVendedor(Sistema sistema) {
        this.sis = sistema;
    }

    /**
     * Muestra todos los vehículos disponibles en el catálogo.
     */
    public void verVehiculosDisponibles() {
        List<Vehiculo> catalogo = sis.getCatalogoVehiculos();
        System.out.println("Catálogo de vehículos disponibles:");
        for (Vehiculo v : catalogo) {
            System.out.printf("- %s %s ($%d)%n", v.getClass().getSimpleName(), v.toString(), v.getCosto());
        }
    }

}
