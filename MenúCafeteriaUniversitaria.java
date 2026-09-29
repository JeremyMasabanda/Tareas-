import java.util.Scanner;

public class MenúCafeteriaUniversitaria {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            int opcion, cantidad;
            double precio, subtotal, descuento, total;
            String producto;

            // Mostrar menú
            System.out.println("--- MENU DE PRODUCTOS ---");
            System.out.println("1. Papipollo - $5.00");
            System.out.println("2. Monster - $8.00");
            System.out.println("3. Capuccino - $12.00");

            // Seleccionar producto
            System.out.print("Seleccione un producto: ");
            opcion = scanner.nextInt();

            // Asignar producto y precio
            switch (opcion) {
                case 1:
                    producto = "Papipollo";
                    precio = 5.00;
                    break;

                case 2:
                    producto = "Monster";
                    precio = 8.00;
                    break;

                case 3:
                    producto = "Capuccino";
                    precio = 12.00;
                    break;

                default:
                    System.out.println("Opcion no valida.");
                    return;
            }

            // Ingresar cantidad
            System.out.print("Ingrese la cantidad: ");
            cantidad = scanner.nextInt();

            // Calcular subtotal
            subtotal = cantidad * precio;

            // Aplicar descuento si la compra es de $10 o más
            if (subtotal >= 10) {
                descuento = subtotal * 0.10;
            } else {
                descuento = 0;
            }

            // Calcular total
            total = subtotal - descuento;

            // Mostrar resultados
            System.out.println("\n--- FACTURA DE COMPRA ---");
            System.out.println("Producto: " + producto);
            System.out.println("Precio unitario: $" + precio);
            System.out.println("Cantidad: " + cantidad);
            System.out.println("Subtotal: $" + subtotal);
            System.out.println("Descuento: $" + descuento);
            System.out.println("Total a pagar: $" + total);
        }
    }
}