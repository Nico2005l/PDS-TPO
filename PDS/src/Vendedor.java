public class Vendedor {
    private String nombre;
    private String apellido;
    // getters, setters, constructor
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
}