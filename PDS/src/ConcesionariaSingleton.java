public class ConcesionariaSingleton {
    private static ConcesionariaSingleton concesionariaSingleton;

    private ConcesionariaSingleton() {}

    public static ConcesionariaSingleton getConcesionaria() {
        if (concesionariaSingleton == null) {
            concesionariaSingleton = new ConcesionariaSingleton();
        }
        return concesionariaSingleton;
    }
}