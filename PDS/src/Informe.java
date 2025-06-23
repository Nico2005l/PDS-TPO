public class Informe {
    public static void imprimirInforme(String titulo, String contenido) {
        ConcesionariaSingleton concesionaria = ConcesionariaSingleton.getConcesionaria();
        System.out.println("========================================");
        System.out.printf("        %s%n", concesionaria.getRazonSocial());
        System.out.println("----------------------------------------");
        System.out.printf("CUIT:        %s%n", concesionaria.getCuit());
        System.out.printf("Dirección:   %s%n", concesionaria.getDireccion());
        System.out.printf("Teléfono:    %s%n", concesionaria.getTelefono());
        System.out.printf("Email:       %s%n", concesionaria.getEmail());
        System.out.printf("Página Web:  %s%n", concesionaria.getPaginaWeb());
        System.out.println("========================================");
        System.out.printf("        %s%n", titulo);
        System.out.println("========================================");
        System.out.printf(contenido);
        System.out.println("========================================");
        System.out.println("Informe generado el " + java.time.LocalDate.now());
        System.out.println("========================================");
    }

    
}