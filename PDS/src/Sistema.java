import java.util.List;

public class Sistema {
    private List<Vehiculo> catalogoVehiculos;
    private List<Cliente> clientes;

    public void registrarCliente(Cliente c) {
        if (!clientes.contains(c)) {
            clientes.add(c);
        }
    }
    public void registrarVehiculo(Vehiculo v) {
        catalogoVehiculos.add(v);
    }
    public void realizarPedido(Cliente c, Vendedor v, Vehiculo vehiculo) {
        // Implementación
    }
    public void generarInforme() {
        // Implementación
    }
}