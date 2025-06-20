public class Vendedor {
    private String nombre;
    private String apellido;

    public Vendedor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }

    @Override
    public String toString() {
        return String.format("Vendedor: %s %s", nombre, apellido);
    }
}