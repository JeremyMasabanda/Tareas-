import java.util.Scanner;

public class Estacionamiento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        double recaudacionTotal = 0;
        int totalVehiculos = 0;

        // Estructura requerida: do-while para el menu
        do {
            System.out.println("\n=== ESTACIONAMIENTO UNIVERSITARIO ===");
            System.out.println("1. Calcular tarifa");
            System.out.println("2. Ver tarifas");
            System.out.println("3. Mostrar recaudacion");
            System.out.println("4. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nTipo de vehiculo:");
                    System.out.println("1. Motocicleta ($0,50/h)");
                    System.out.println("2. Automovil ($1/h)");
                    System.out.println("3. Camioneta ($1,50/h)");
                    System.out.print("Seleccione: ");
                    int tipo = sc.nextInt();

                    // Estructura requerida: switch
                    double tarifaHora = 0;
                    String nombreVehiculo = "";
                    switch (tipo) {
                        case 1: tarifaHora = 0.50; nombreVehiculo = "Motocicleta"; break;
                        case 2: tarifaHora = 1.00; nombreVehiculo = "Automovil"; break;
                        case 3: tarifaHora = 1.50; nombreVehiculo = "Camioneta"; break;
                        default: System.out.println("Tipo invalido"); continue;
                    }

                    System.out.print("Horas (1 a 24): ");
                    int horas = sc.nextInt();

                    // Validacion 1 a 24 horas
                    if (horas < 1 || horas > 24) {
                        System.out.println("Error: 25 horas invalidas. Solo se permite 1 a 24.");
                        break;
                    }

                    System.out.print("Es estudiante (1), docente (2) o ninguno (0)?: ");
                    int rol = sc.nextInt();

                    System.out.print("Boleto perdido? (1=Si / 0=No): ");
                    int perdido = sc.nextInt();

                    double subtotal = tarifaHora * horas;
                    double descuento = 0;

                    // Estructura requerida: if-else para descuentos
                    if (rol == 1) {
                        descuento = subtotal * 0.20; // 20% estudiante
                    } else if (rol == 2) {
                        descuento = subtotal * 0.10; // 10% docente
                    }

                    double total = subtotal - descuento;

                    if (perdido == 1) {
                        total += 5; // recargo $5
                    }

                    System.out.println("--- FACTURA ---");
                    System.out.println("Vehiculo: " + nombreVehiculo);
                    System.out.println("Horas: " + horas + " x $" + tarifaHora + " = $" + subtotal);
                    System.out.println("Descuento: $" + descuento);
                    if (perdido == 1) System.out.println("Recargo boleto perdido: $5");
                    System.out.println("TOTAL A PAGAR: $" + total);

                    recaudacionTotal += total;
                    totalVehiculos++;
                    break;

                case 2:
                    System.out.println("\nTARIFAS: Moto $0.50 | Auto $1.00 | Camioneta $1.50");
                    System.out.println("Descuento: Estudiante 20%, Docente 10%, Boleto perdido +$5");
                    break;

                case 3:
                    System.out.println("\nVehiculos atendidos: " + totalVehiculos);
                    System.out.println("Recaudacion total: $" + recaudacionTotal);
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }
        } while (opcion != 4);

        sc.close();
    }
}