import java.util.List;

public class PruebasTest {

    private Sistema sistema;
    private Cliente cliente;
    private Vendedor vendedor;
    private Vehiculo vehiculo;
    private FormaPago formaPago;

    public void setUp() {
        sistema = new Sistema();
        cliente = new Cliente("Juan Perez", "12345678", "48468790", "dd@mail.com", "123456789");
        vendedor = new Vendedor("Maria Lopez", "87654321");
        vehiculo = new Auto("Toyota", 500000, "Corolla", "Rojo", "CH123456759", "MO987654321");
        formaPago = new PagoTarjeta();
    }

    public void testRegistrarPedido() {
        sistema.registrarCliente(cliente);
        sistema.registrarVehiculo(vehiculo);
        sistema.registrarPedido(cliente, vendedor, vehiculo, formaPago);
        List<PedidoCompra> pedidos = sistema.getPedidosPorCliente(cliente.getDni());
        assertEquals(1, pedidos.size(), "Debe haber un pedido registrado para el cliente");
        PedidoCompra pedido = pedidos.get(0);
        DetallePedido detalle = pedido.getDetallePedido();
        assertEquals(cliente, detalle.getCliente());
        assertEquals(vendedor, detalle.getVendedor());
        assertEquals(vehiculo, detalle.getVehiculo());
        assertEquals(formaPago.getClass(), detalle.getFormaPago().getClass());
    }
    

    public void testRegistrarMultiplesPedidos() {
        sistema.registrarCliente(cliente);
        sistema.registrarVehiculo(vehiculo);
        sistema.registrarPedido(cliente, vendedor, vehiculo, formaPago);
        sistema.registrarPedido(cliente, vendedor, vehiculo, formaPago);
        List<PedidoCompra> pedidos = sistema.getPedidosPorCliente(cliente.getDni());
        assertEquals(2, pedidos.size(), "Debe haber dos pedidos registrados para el cliente");
    }

    public void testFacadeAdminInformePorEstado() {
        sistema.registrarCliente(cliente);
        sistema.registrarVehiculo(vehiculo);
        sistema.registrarPedido(cliente, vendedor, vehiculo, formaPago);
        FacadeAdmin adminFacade = new FacadeAdmin(sistema);
        Area area = new AreaSeguimiento();

        // Captura la salida estándar
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        java.io.PrintStream originalOut = System.out;
        System.setOut(new java.io.PrintStream(outContent));

        adminFacade.informePorEstado(area);

        System.setOut(originalOut);
        String output = outContent.toString().trim();
        assertNotNull(output, "El informe no debe estar vacío");
        if (output.isEmpty()) {
            throw new AssertionError("El informe no debe estar vacío");
        }
    }

    // Simple assertion methods
    private void assertEquals(Object expected, Object actual) {
        if (expected == null && actual == null) return;
        if (expected != null && expected.equals(actual)) return;
        throw new AssertionError("Expected: " + expected + ", but was: " + actual);
    }

    private void assertEquals(Object expected, Object actual, String message) {
        if (expected == null && actual == null) return;
        if (expected != null && expected.equals(actual)) return;
        throw new AssertionError(message + " Expected: " + expected + ", but was: " + actual);
    }

    private void assertNotNull(Object obj, String message) {
        if (obj == null) throw new AssertionError(message);
    }

    public static void main(String[] args) {
        PruebasTest test = new PruebasTest();
        try {
            test.setUp();
            System.out.println("testRegistrarVehiculo passed");
            test.setUp();
            test.testRegistrarPedido();
            System.out.println("testRegistrarPedido passed");
            test.setUp();
            test.testRegistrarMultiplesPedidos();
            System.out.println("testRegistrarMultiplesPedidos passed");
            test.setUp();
            test.testFacadeAdminInformePorEstado();
            System.out.println("testFacadeAdminInformePorEstado passed");
        } catch (AssertionError e) {
            System.err.println("Test failed: " + e.getMessage());
        }
    }
}
