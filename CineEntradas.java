import java.util.Scanner;

public class CineEntradas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        int opcion;
        int contadorEntradas = 0;

        // Requisito: do-while para comprar varias
        do {
            System.out.println("\n--- CINE - FORMATOS ---");
            System.out.println("1. 2D ($5)");
            System.out.println("2. 3D ($7.50)");
            System.out.println("3. IMAX ($10)");
            System.out.println("4. Finalizar compra");
            System.out.print("Elija formato: ");
            opcion = sc.nextInt();

            // Si finaliza, salimos antes de pedir edad
            if (opcion == 4) {
                break;
            }

            double precioBase = 0;
            boolean opcionValida = true;

            // Requisito: switch
            switch (opcion) {
                case 1:
                    precioBase = 5.0;
                    break;
                case 2:
                    precioBase = 7.50;
                    break;
                case 3:
                    precioBase = 10.0;
                    break;
                default:
                    System.out.println("Opcion de menu invalida. Intente de nuevo.");
                    opcionValida = false;
                    break;
            }

            if (!opcionValida) {
                continue; // vuelve al menú
            }

            // Validar edad entre 0 y 120
            int edad;
            do {
                System.out.print("Ingrese edad del cliente (0-120): ");
                edad = sc.nextInt();
                if (edad < 0 || edad > 120) {
                    System.out.println("Edad no valida.");
                }
            } while (edad < 0 || edad > 120);

            double precioFinal = precioBase;

            // Requisito: if-else para descuentos
            if (edad < 12) {
                precioFinal = precioBase * 0.70; // 30% descuento
                System.out.println("Descuento nino 30% aplicado.");
            } else if (edad >= 65) {
                precioFinal = precioBase * 0.75; // 25% descuento
                System.out.println("Descuento adulto mayor 25% aplicado.");
            }

            total += precioFinal;
            contadorEntradas++;
            System.out.printf("Entrada %d: $%.2f - Total acumulado: $%.2f%n", contadorEntradas, precioFinal, total);

        } while (opcion != 4);

        System.out.println("\n--- FACTURA FINAL ---");
        System.out.println("Total entradas: " + contadorEntradas);
        System.out.printf("Total a pagar: $%.2f%n", total);

        sc.close();
    }
}