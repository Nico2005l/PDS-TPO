public class Moto extends Vehiculo {
    
    public Moto(String marca, int costo, String modelo, String color, String nroChasis, String nroMotor) {
        super(marca, costo, modelo, color, nroChasis, nroMotor);
    }

    @Override
    public int calcularImpuesto() {
        double provincialGeneral = getCosto() * 0.05;
        double provincialAdicional = getCosto() * 0.01;
        return (int)(provincialGeneral + provincialAdicional);
        
    }
    
}