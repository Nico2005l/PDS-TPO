import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Sistema sistema = new Sistema();
        

        int opcion;

        do {
            System.out.println("=== Menú Principal ===");
            System.out.println("1. Administrador");
            System.out.println("2. Comprador");
            System.out.println("3. Vendedor");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Menú de Administrador seleccionado.");
                    // Menú de Administrador
                    int opcionAdmin;
                    do {
                        FacadeAdmin facadeAdmin = new FacadeAdmin(sistema);
                        System.out.println("=== Menú Administrador ===");
                        System.out.println("1. Ver clientes");
                        System.out.println("2. Ver vehículos");
                        System.out.println("3. Ver pedidos");
                        System.out.println("4. Eliminar cliente");
                        System.out.println("5. Eliminar vehículo");
                        System.out.println("6. Eliminar pedido");
                        System.out.println("7. Informe por fecha");
                        System.out.println("8. Informe por estado");
                        System.out.println("9. Administrar configuración");
                        System.out.println("10. Registrar pedido");
                        System.out.println("0. Volver");
                        System.out.print("Seleccione una opción: ");
                        opcionAdmin = scanner.nextInt();
                        scanner.nextLine(); // Limpiar buffer

                        switch (opcionAdmin) {
                            case 1:
                                facadeAdmin.verClientes();
                                break;
                            case 2:
                                facadeAdmin.verVehiculos();
                                break;
                            case 3:
                                facadeAdmin.verPedidos();
                                break;
                            case 4:
                                System.out.print("Ingrese DNI del cliente a eliminar: ");
                                String dniCliente = scanner.nextLine();
                                facadeAdmin.eliminarCliente(dniCliente);
                                break;
                            case 5:
                                System.out.print("Ingrese número de chasis del vehículo a eliminar: ");
                                String nroChasis = scanner.nextLine();
                                facadeAdmin.eliminarVehiculo(nroChasis);
                                break;
                            case 6:
                                System.out.print("Ingrese número de pedido a eliminar: ");
                                int nroPedido = scanner.nextInt();
                                scanner.nextLine();
                                facadeAdmin.eliminarPedido(nroPedido);
                                break;
                            case 7:
                                System.out.print("Ingrese fecha (yyyy-MM-dd): ");
                                String fechaStr = scanner.nextLine();
                                // Convertir String a Date
                                java.sql.Date fecha = java.sql.Date.valueOf(fechaStr);
                                facadeAdmin.informePorFecha(fecha);
                                break;
                            case 8:
                                System.out.print("Ingrese estado (nombre del área): ");
                                String estadoStr = scanner.nextLine();
                                // Convertir String a Area
                                Area area = null;
                                if (estadoStr.equalsIgnoreCase("ventas")) {
                                    area = new AreaVentas();
                                } else if (estadoStr.equalsIgnoreCase("impuestos")) {
                                    area = new AreaImpuestos();
                                } else if (estadoStr.equalsIgnoreCase("embarque")) {
                                    area = new AreaEmbarque();
                                } else if (estadoStr.equalsIgnoreCase("cobranzas")) {
                                    area = new AreaCobranzas();
                                } else if (estadoStr.equalsIgnoreCase("seguimiento")) {
                                    area = new AreaSeguimiento();
                                } else if (estadoStr.equalsIgnoreCase("logistica")) {
                                    area = new AreaLogistica();
                                } else if (estadoStr.equalsIgnoreCase("entrega")) {
                                    area = new AreaEntrega();
                                } else {
                                    System.out.println("Área no válida. Intente nuevamente.");
                                    break;
                                }
                                facadeAdmin.informePorEstado(area);
                                break;
                            case 9:
                                facadeAdmin.administrarConfiguracion();
                                break;
                            case 10:
                                facadeAdmin.registrarPedido();
                                break;
                            case 0:
                                System.out.println("Volviendo al menú principal...");
                                break;
                            default:
                                System.out.println("Opción no válida. Intente nuevamente.");
                        }
                        System.out.println();
                    } while (opcionAdmin != 0);
                    break;
                case 2:
                    System.out.println("Menú de Comprador seleccionado.");
                    // Menú de Comprador
                    int opcionComprador;
                    do {
                        System.out.print("Ingrese su DNI: ");
                        String dniComprador = scanner.nextLine();
                        FacadeComprador facadeComprador = new FacadeComprador(sistema, dniComprador);
                        System.out.println("=== Menú Comprador ===");
                        System.out.println("1. Ver vehículos disponibles");
                        System.out.println("2. Ver mis pedidos");
                        System.out.println("0. Volver");
                        System.out.print("Seleccione una opción: ");
                        opcionComprador = scanner.nextInt();
                        scanner.nextLine(); // Limpiar buffer
                        switch (opcionComprador) {
                            case 1:
                                facadeComprador.verVehiculosDisponibles();
                                break;
                            case 2:
                                facadeComprador.verMisPedidos();
                                break;
                            case 0:
                                System.out.println("Volviendo al menú principal...");
                                break;
                            default:
                                System.out.println("Opción no válida. Intente nuevamente.");
                        }
                        System.out.println();
                    } while (opcionComprador != 0); 
                    break;
                case 3:
                    System.out.println("Menú de Vendedor seleccionado.");
                    // Menú de Administrador
                    int opcionVendedor;
                    do {
                        FacadeVendedor facadeVendedor = new FacadeVendedor(sistema);
                        System.out.println("=== Menú Vendedor ===");
                        System.out.println("1. Ver vehículos disponibles");
                        System.out.println("0. Volver");
                        System.out.print("Seleccione una opción: ");
                        opcionVendedor = scanner.nextInt();
                        scanner.nextLine(); // Limpiar buffer
                        switch (opcionVendedor) {
                            case 1:
                                facadeVendedor.verVehiculosDisponibles();
                                break;
                            case 0:
                                System.out.println("Volviendo al menú principal...");
                                break;
                            default:
                                System.out.println("Opción no válida. Intente nuevamente.");
                        }
                        System.out.println();
                    } while (opcionVendedor != 0);
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
            System.out.println();
        } while (opcion != 0);

        scanner.close();
    }
}
