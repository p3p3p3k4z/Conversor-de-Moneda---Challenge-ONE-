import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ClienteApi clienteApi = new ClienteApi();
        ServicioConversion servicioConversion = new ServicioConversion(clienteApi);

        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n=== Conversor de Monedas ===");
            System.out.println("Seleccione una opción:");
            System.out.println("1. Convertir USD a EUR");
            System.out.println("2. Convertir USD a MXN");
            System.out.println("3. Convertir EUR a USD");
            System.out.println("4. Convertir MXN a USD");
            System.out.println("5. Convertir MXN a BRL");
            System.out.println("6. Convertir BRL a ARS");
            System.out.println("7. Salir");
            System.out.print("Opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();
            System.out.println("========================");
            System.out.println("\n\n");

            System.out.println("========================");
            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese la cantidad en USD: ");
                    double cantidad = scanner.nextDouble();
                    double convertido = servicioConversion.convertirMoneda("USD", "EUR", cantidad);
                    if (convertido != -1) {
                        System.out.printf("%.2f USD equivalen a %.2f EUR%n", cantidad, convertido);
                    }
                }
                case 2 -> {
                    System.out.print("Ingrese la cantidad en USD: ");
                    double cantidad = scanner.nextDouble();
                    double convertido = servicioConversion.convertirMoneda("USD", "MXN", cantidad);
                    if (convertido != -1) {
                        System.out.printf("%.2f USD equivalen a %.2f MXN%n", cantidad, convertido);
                    }
                }
                case 3 -> {
                    System.out.print("Ingrese la cantidad en EUR: ");
                    double cantidad = scanner.nextDouble();
                    double convertido = servicioConversion.convertirMoneda("EUR", "USD", cantidad);
                    if (convertido != -1) {
                        System.out.printf("%.2f EUR equivalen a %.2f USD%n", cantidad, convertido);
                    }
                }
                case 4 -> {
                    System.out.print("Ingrese la cantidad en MXN: ");
                    double cantidad = scanner.nextDouble();
                    double convertido = servicioConversion.convertirMoneda("MXN", "USD", cantidad);
                    if (convertido != -1) {
                        System.out.printf("%.2f MXN equivalen a %.2f USD%n", cantidad, convertido);
                    }
                }

                case 5 -> {
                    System.out.print("Ingrese la cantidad en MXN: ");
                    double cantidad = scanner.nextDouble();
                    double convertido = servicioConversion.convertirMoneda("MXN", "BRL", cantidad);
                    if (convertido != -1) {
                        System.out.printf("%.2f MXN equivalen a %.2f BRL%n", cantidad, convertido);
                    }
                }

                case 6 -> {
                    System.out.print("Ingrese la cantidad en BRL: ");
                    double cantidad = scanner.nextDouble();
                    double convertido = servicioConversion.convertirMoneda("BRL", "ARS", cantidad);
                    if (convertido != -1) {
                        System.out.printf("%.2f BRL equivalen a %.2f ARS%n", cantidad, convertido);
                    }
                }

                case 7 -> {
                    System.out.println("Gracias por usar el conversor de monedas. ¡Hasta luego ^^!");
                    salir = true;
                }

                default -> {
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
                }
            }
            System.out.println("========================");
            System.out.println("\nPresione ENTER para continuar...");
            scanner.nextLine();
            scanner.nextLine();
        }

        scanner.close();
    }
}
