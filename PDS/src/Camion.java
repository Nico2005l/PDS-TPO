public class Camion extends Vehiculo {
    @Override
    public int calcularImpuesto() {
        // Implementación específica
        return 0;
    }

    public Camion(String marca, int costo, String modelo, String color, String nroChasis, String nroMotor) {
        super(marca, costo, modelo, color, nroChasis, nroMotor);
    }
}