public class ConcesionariaSingleton {
    private static ConcesionariaSingleton concesionariaSingleton;
    private String razonSocial = "Concesionaria S.A.";
    private String cuit = "20-12345678-9";
    private String direccion = "Av. Siempre Viva 1234";
    private String telefono = "1234-5678";
    private String email = "abcd@mail.com";
    private String paginaWeb = "www.concesionaria.com";

    private ConcesionariaSingleton() {}

    public static ConcesionariaSingleton getConcesionaria() {
        if (concesionariaSingleton == null) {
            concesionariaSingleton = new ConcesionariaSingleton();
        }
        return concesionariaSingleton;
    }

    public String getRazonSocial() {
        return razonSocial;
    }
    public String getCuit() {
        return cuit;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }
}