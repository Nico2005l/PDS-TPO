public abstract class Vehiculo {
    private String marca;
    private int costo;
    private String modelo;
    private String color;
    private String nroChasis;
    private String nroMotor;
    private int precio;
    private boolean enVenta;

    public abstract int calcularImpuesto();

    public Vehiculo(String marca, int costo, String modelo, String color, String nroChasis, String nroMotor) {
        this.marca = marca;
        this.costo = costo;
        this.modelo = modelo;
        this.color = color;
        this.nroChasis = nroChasis;
        this.nroMotor = nroMotor;
        this.enVenta = false;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNroChasis() {
        return nroChasis;
    }

    public void setNroChasis(String nroChasis) {
        this.nroChasis = nroChasis;
    }

    public String getNroMotor() {
        return nroMotor;
    }

    public void setNroMotor(String nroMotor) {
        this.nroMotor = nroMotor;
    }

    public boolean isEnVenta() {
        return enVenta;
    }

    public void setEnVenta(boolean enVenta) {
        this.enVenta = enVenta;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) obj;
        return nroChasis != null && nroChasis.equals(vehiculo.nroChasis);
    }
}