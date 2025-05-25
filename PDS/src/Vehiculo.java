public class Vehiculo {
    private String marca;
    private int costo;
    private String modelo;
    private String color;
    private String nroChasis;
    private String nroMotor;
    private boolean enVenta;

    public Vehiculo(String marca, int costo, String modelo, String color, String nroChasis, String nroMotor) {
        this.marca = marca;
        this.costo = costo;
        this.modelo = modelo;
        this.color = color;
        this.nroChasis = nroChasis;
        this.nroMotor = nroMotor;
        this.enVenta = true; // Por defecto, el vehículo está en venta
    }

    public int calcularImpuesto() {
        // Lógica para calcular el impuesto según el costo del vehículo
       return (int) (costo * 0.1); // Ejemplo: 10% del costo
    }
}
