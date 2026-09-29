import java.util.Scanner;

public class compraproducto {
    public static void main(String[] args) {
        // Solicitar datos
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitar datos
            System.out.print("Ingrese el nombre de la estudiante: ");
            String nombre = scanner.nextLine();
            
            System.out.print("Ingrese el nombre del producto: ");
            String producto = scanner.nextLine();
            
            System.out.print("Ingrese la cantidad de productos: ");
            int cantidad = scanner.nextInt();
            
            System.out.print("Ingrese el precio unitario: ");
            double precio = scanner.nextDouble();
            
            // Calcular subtotal
            double subtotal = cantidad * precio;
            
            // Aplicar descuento del 10%
            double descuento = subtotal * 0.10;
            
            // Calcular total
            double total = subtotal - descuento;
            
            // Solicitar dinero entregado
            System.out.print("Ingrese el dinero entregado: ");
            double dinero = scanner.nextDouble();
            
            // Mostrar resultados
            System.out.println("\n--- FACTURA DE COMPRA ---");
            System.out.println("Estudiante: " + nombre);
            System.out.println("Producto: " + producto);
            System.out.println("Subtotal: $" + subtotal);
            System.out.println("Descuento: $" + descuento);
            System.out.println("Total a pagar: $" + total);
            
            // Comprobar si el dinero cubre el pago
            if (dinero >= total) {
                double cambio = dinero - total;
                System.out.println("Pago realizado correctamente.");
                System.out.println("Cambio: $" + cambio);
            } else {
                double faltante = total - dinero;
                System.out.println("El dinero no es suficiente.");
                System.out.println("Faltan: $" + faltante);
            }
        }
    }
}
