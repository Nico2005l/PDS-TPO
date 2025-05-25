public class Camion extends Vehiculo {
    @Override
    public int calcularImpuesto() {
        double provincialGeneral = getCosto() * 0.05;
        double provincialAdicional = getCosto() * 0.02;
        return (int)(provincialGeneral + provincialAdicional);
    }

    public Camion(String marca, int costo, String modelo, String color, String nroChasis, String nroMotor) {
        super(marca, costo, modelo, color, nroChasis, nroMotor);
    }
}