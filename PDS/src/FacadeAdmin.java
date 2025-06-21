import java.sql.Date;
import java.util.List;

public class FacadeAdmin {
    private Sistema sistema;

    public FacadeAdmin(Sistema sistema) {
        this.sistema = sistema;
    }

    public void verClientes() {
        System.out.println();
        System.out.println("=== Clientes registrados ===");
        // mostrar todos los clientes
        for (Cliente c : sistema.getClientes()) {
            System.out.println(c.getNombre() + " " + c.getApellido() + " - DNI: " + c.getDni());
        }
        if (sistema.getClientes().isEmpty()) {
            System.out.println("No hay clientes registrados.");
        }
        System.out.println();
    }

    public void verVehiculos() {
        System.out.println();
        System.out.println("=== Vehículos en el catálogo ===");
        // mostrar todos los vehículos
        for (Vehiculo v : sistema.getCatalogoVehiculos()) {
            System.out.println(v.getMarca() + " " + v.getModelo() + " - Chasis: " + v.getNroChasis());
        }
    }

    public void verPedidos() {
        System.out.println();
        System.out.println("=== Pedidos registrados ===");
        // mostrar todos los pedidos
        for (PedidoCompra p : sistema.getPedidos()) {
            System.out.println("Pedido Nro: " + p.getDetallePedido().getNroPedido());
        }
        if (sistema.getPedidos().isEmpty()) {
            System.out.println("No hay pedidos registrados.");
        }
        System.out.println();
    }

    public void eliminarCliente(String cliente) {
        Cliente clienteAEliminar = sistema.getClientes().stream()
                .filter(c -> c.getDni().equals(cliente))
                .findFirst()
                .orElse(null);
        if (clienteAEliminar != null) {
            // Actualizar cliente
            sistema.getClientes().remove(clienteAEliminar);
            System.out.println("Cliente eliminado: " + clienteAEliminar.getNombre() + " " + clienteAEliminar.getApellido());
        }else {
            throw new IllegalArgumentException("El cliente no está registrado.");
        }
    }

    public void eliminarVehiculo(String vehiculo) {
        Vehiculo vehiculoAEliminar = sistema.getCatalogoVehiculos().stream()
                .filter(v -> v.getNroChasis().equals(vehiculo))
                .findFirst()
                .orElse(null);
        if (vehiculoAEliminar != null) {
            // Actualizar vehículo
            sistema.getCatalogoVehiculos().remove(vehiculoAEliminar);
            System.out.println("Vehículo eliminado: " + vehiculoAEliminar.getMarca() + " " + vehiculoAEliminar.getModelo());
        }else {
            throw new IllegalArgumentException("El vehículo no está registrado.");
        }
    }

    public void eliminarPedido(int pedido) {
        PedidoCompra pedidoAEliminar = sistema.getPedidos().stream()
                .filter(p -> p.getDetallePedido().getNroPedido() == pedido)
                .findFirst()
                .orElse(null);
        if (pedidoAEliminar != null) {
            // Actualizar pedido
            sistema.getPedidos().remove(pedidoAEliminar);
            System.out.println("Pedido eliminado: " + pedidoAEliminar.getDetallePedido().getNroPedido());
        }else {
            throw new IllegalArgumentException("El pedido no está registrado.");
        }
    }

    public void informePorFecha(Date fecha) {
        List<PedidoCompra> pedidosPorFecha = sistema.getPedidosPorFecha(fecha);
        if (pedidosPorFecha.isEmpty()) {
            System.out.println("No hay pedidos para la fecha: " + fecha);
        } else {
            String contenido = "";
            for (PedidoCompra pedido : pedidosPorFecha) {
                contenido += pedido.toString() + "\n" + "---------------------------------\n";
            }
            sistema.generarInforme("Informe Por Fecha", contenido);
        }
    }

    public void informePorEstado(Area estado) {
        List<PedidoCompra> pedidosPorEstado = sistema.getPedidosPorEstado(estado);
        if (pedidosPorEstado.isEmpty()) {
            System.out.println("No hay pedidos con el estado: " + estado);
        } else {
            String contenido = "";
            for (PedidoCompra pedido : pedidosPorEstado) {
                contenido += pedido.toString() + "\n" + "---------------------------------\n";
            }
            sistema.generarInforme("Informe Por Estado", contenido);
        }
    }

    public void administrarConfiguracion() {
        //implementar lógica para administrar la configuración del sistema
        System.out.println("Administrando configuración del sistema...");
    }

    public void registrarPedido() {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Ingrese el nombre del cliente:");
        String nombreCliente = scanner.nextLine();
        System.out.println("Ingrese el apellido del cliente:");
        String apellidoCliente = scanner.nextLine();
        System.out.println("Ingrese el DNI del cliente:");
        String dniCliente = scanner.nextLine();
        if (dniCliente.length() != 8) {
            throw new IllegalArgumentException("El DNI debe tener 8 dígitos.");

        }

        System.out.println("Ingrese el número de teléfono del cliente:");
        String telefonoCliente = scanner.nextLine();
        if (telefonoCliente.length() != 10) {
            throw new IllegalArgumentException("El número de teléfono debe tener 10 dígitos.");
        }
        System.out.println("Ingrese el mail del cliente:");
        String mailCliente = scanner.nextLine();

        System.out.println("Ingrese el nombre del vendedor:");
        String nombreVendedor = scanner.nextLine();
        System.out.println("Ingrese el apellido del vendedor:");
        String apellidoVendedor = scanner.nextLine();

        for (Vehiculo v : sistema.getCatalogoVehiculos()) {
            System.out.println("Vehículo disponible: " + v.getMarca() + " " + v.getModelo() + " - Chasis: " + v.getNroChasis());
        }

        System.out.println("Ingrese el número de chasis del vehículo seleccionado:");
        String nroChasisVehiculo = scanner.nextLine();

        Vehiculo vehiculoSeleccionado = sistema.getCatalogoVehiculos().stream()
                .filter(v -> v.getNroChasis().equals(nroChasisVehiculo))
                .findFirst()
                .orElse(null);
        if (vehiculoSeleccionado == null) {
            throw new IllegalArgumentException("El vehículo seleccionado no está disponible.");
        }

        System.out.println("Seleccione la forma de pago:");
        System.out.println("1. Tarjeta de Crédito");
        System.out.println("2. Contado");
        System.out.println("3. Transferencia Bancaria");
        int opcionPago = scanner.nextInt();
        FormaPago formaPagoSeleccionada;
        if (opcionPago == 1) {
            formaPagoSeleccionada = new PagoTarjeta();
        } else if (opcionPago == 2) {
            formaPagoSeleccionada = new PagoContado();
        } else if (opcionPago == 3) {
            formaPagoSeleccionada = new PagoTransferencia();
        } else {
            throw new IllegalArgumentException("Forma de pago no válida.");
        }

       

        Cliente cliente = new Cliente(nombreCliente, apellidoCliente, dniCliente, mailCliente, telefonoCliente);
        Vendedor vendedor = new Vendedor(nombreVendedor, apellidoVendedor);
        sistema.registrarCliente(cliente);
        sistema.registrarPedido(cliente, vendedor, vehiculoSeleccionado, formaPagoSeleccionada);

        System.out.println("Pedido registrado exitosamente.");
        System.out.println("Cliente: " + cliente.getNombre() + " " + cliente.getApellido());
        System.out.println("Vendedor: " + vendedor.getNombre() + " " + vendedor.getApellido());
        System.out.println("Vehículo: " + vehiculoSeleccionado.getMarca() + " " + vehiculoSeleccionado.getModelo() + " - Chasis: " + vehiculoSeleccionado.getNroChasis());
        System.out.println("Forma de pago: " + formaPagoSeleccionada.getClass().getSimpleName());
        System.out.println("Número de pedido: " + sistema.getPedidos().get(sistema.getPedidos().size() - 1).getDetallePedido().getNroPedido());
        System.out.println("Fecha de creación: " + sistema.getPedidos().get(sistema.getPedidos().size() - 1).getDetallePedido().getFechaCreacion());
        System.out.println("Costo total del pedido: " + sistema.getPedidos().get(sistema.getPedidos().size() - 1).getCosto());
        System.out.println();



        
    }
}

