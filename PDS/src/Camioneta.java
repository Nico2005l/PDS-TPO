public class Camioneta extends Vehiculo {
    @Override
    public int calcularImpuesto() {
        double nacional = getCosto() * 0.10;
        double provincialGeneral = getCosto() * 0.05;
        double provincialAdicional = getCosto() * 0.02;
        return (int)(nacional + provincialGeneral + provincialAdicional);
    }

    public Camioneta(String marca, int costo, String modelo, String color, String nroChasis, String nroMotor) {
        super(marca, costo, modelo, color, nroChasis, nroMotor);
    }
}