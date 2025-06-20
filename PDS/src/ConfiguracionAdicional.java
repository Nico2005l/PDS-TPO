public class ConfiguracionAdicional {
    private String descripcion;
    private double costo;
    // getters, setters, constructor

    public ConfiguracionAdicional(String descripcion, double costo) {
        this.descripcion = descripcion;
        this.costo = costo;
    }
    public String getDescripcion() {
        return descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return String.format("Descripción: %s | Costo: $%.2f", descripcion, costo);
    }

    
}