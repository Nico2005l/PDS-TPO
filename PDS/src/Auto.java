public class Auto extends Vehiculo {
    @Override
    public int calcularImpuesto() {
        double nacional = getCosto() * 0.21;
        double provincialGeneral = getCosto() * 0.05;
        double provincialAdicional = getCosto() * 0.01;
        return (int)(nacional + provincialGeneral + provincialAdicional);
    }

    public Auto(String marca, int costo, String modelo, String color, String nroChasis, String nroMotor) {
        super(marca, costo, modelo, color, nroChasis, nroMotor);
    }
}