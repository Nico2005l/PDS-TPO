import java.util.List;

public class FacadeVendedor {
    private Sistema sistema;

    public FacadeVendedor(Sistema sistema) {
        this.sistema = sistema;
    }

    public void verVehiculosDisponibles() {
        List<Vehiculo> catalogo = sistema.getCatalogoVehiculos();
        System.out.println("Catálogo de vehículos disponibles:");
        for (Vehiculo v : catalogo) {
            System.out.printf("- %s %s ($%d)%n", v.getClass().getSimpleName(), v.toString(), v.getCosto());
        }
    }

}
