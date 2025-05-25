public abstract class Vehiculo {
    protected String marca;
    protected int costo;
    protected String modelo;
    protected String color;
    protected String nroChasis;
    protected String nroMotor;
    protected boolean enVenta;

    public abstract int calcularImpuesto();
    // getters, setters, constructor
}