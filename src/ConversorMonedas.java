import java.util.Scanner;

public class ConversorMonedasConMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tasas de cambio
        double tasaUSDToEUR = 0.85; // 1 USD = 0.85 EUR
        double tasaUSDToMXN = 20.0; // 1 USD = 20 MXN
        double tasaEURToUSD = 1.18; // 1 EUR = 1.18 USD
        double tasaMXNToUSD = 0.05; // 1 MXN = 0.05 USD

        int opcion;
        do {
            // Mostrar el menú
            System.out.println("\n=== Conversor de Monedas ===");
            System.out.println("Seleccione una opción:");
            System.out.println("1. Convertir USD a EUR");
            System.out.println("2. Convertir USD a MXN");
            System.out.println("3. Convertir EUR a USD");
            System.out.println("4. Convertir MXN a USD");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            // Variables para la conversión
            double monto, resultado;

            // Procesar la opción seleccionada
            switch (opcion) {
                case 1: // USD a EUR
                    System.out.print("Ingrese el monto en USD: ");
                    monto = scanner.nextDouble();
                    resultado = monto * tasaUSDToEUR;
                    System.out.printf("Resultado: %.2f USD = %.2f EUR%n", monto, resultado);
                    break;
                case 2: // USD a MXN
                    System.out.print("Ingrese el monto en USD: ");
                    monto = scanner.nextDouble();
                    resultado = monto * tasaUSDToMXN;
                    System.out.printf("Resultado: %.2f USD = %.2f MXN%n", monto, resultado);
                    break;
                case 3: // EUR a USD
                    System.out.print("Ingrese el monto en EUR: ");
                    monto = scanner.nextDouble();
                    resultado = monto * tasaEURToUSD;
                    System.out.printf("Resultado: %.2f EUR = %.2f USD%n", monto, resultado);
                    break;
                case 4: // MXN a USD
                    System.out.print("Ingrese el monto en MXN: ");
                    monto = scanner.nextDouble();
                    resultado = monto * tasaMXNToUSD;
                    System.out.printf("Resultado: %.2f MXN = %.2f USD%n", monto, resultado);
                    break;
                case 5: // Salir
                    System.out.println("Gracias por usar el conversor de monedas. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
