import java.util.Scanner;

public class CineCampus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. CONSTANTES
        final double PRECIO_2D = 8.0;
        final double PRECIO_3D = 10.0;
        final double PRECIO_IMAX = 12.5;
        final double DESC_ESTUDIANTE = 0.20;
        final double DESC_TERCERA_EDAD = 0.30;

        // 2. CONTADORES Y ACUMULADORES
        int contadorTransacciones = 0;
        int totalEntradasVendidas = 0;
        double totalRecaudado = 0.0;
        
        int opcion;
        // 3. MENU CON DO-WHILE
        do {
            System.out.println("\n===== CINECAMPUS UTA =====");
            System.out.println("1. Comprar entradas");
            System.out.println("2. Ver reporte");
            System.out.println("3. Salir");
            System.out.print("Elija: ");
            opcion = sc.nextInt();

            // 4. OPCIONES CON SWITCH
            switch (opcion) {
                case 1:
                    System.out.print("Formato (1=2D, 2=3D, 3=IMAX): ");
                    int formato = sc.nextInt();
                    // 5. VALIDACION CON WHILE
                    while (formato < 1 || formato > 3) {
                        System.out.print("Invalido. Ingrese 1, 2 o 3: ");
                        formato = sc.nextInt();
                    }
                    
                    double precioBase = (formato==1)? PRECIO_2D : (formato==2)? PRECIO_3D : PRECIO_IMAX;
                    
                    System.out.print("Cantidad entradas: ");
                    int cantidad = sc.nextInt();
                    while (cantidad <= 0) {
                        System.out.print("Cantidad debe ser >0: ");
                        cantidad = sc.nextInt();
                    }
                    
                    System.out.print("Edad: ");
                    int edad = sc.nextInt();
                    System.out.print("Es estudiante? 1=Si 0=No: ");
                    int est = sc.nextInt();

                    double desc = 0;
                    // 6. DESCUENTOS CON IF-ELSE
                    if (edad >= 65) {
                        desc = DESC_TERCERA_EDAD;
                    } else if (est == 1) {
                        desc = DESC_ESTUDIANTE;
                    }

                    double subtotal = precioBase * cantidad;
                    double total = subtotal * (1 - desc);
                    
                    // 7. GENERACION CON FOR
                    System.out.println("--- Tickets Generados ---");
                    for (int i = 1; i <= cantidad; i++) {
                        System.out.println("Entrada #" + i + " - Formato " + formato);
                    }
                    System.out.println("Total a pagar: $" + total);

                    contadorTransacciones++;
                    totalEntradasVendidas += cantidad;
                    totalRecaudado += total;
                    break;
                case 2:
                    System.out.println("Transacciones: " + contadorTransacciones + " | Entradas: " + totalEntradasVendidas + " | Recaudado: $" + totalRecaudado);
                    break;
            }
        } while (opcion != 3);
        sc.close();
    }
}