public class CalculoIVA {
    public static void main(String[] args) {
        double precioBase   = 200.0;
        double porcentajeIVA = 0.15; // 15% de IVA en

        double iva   = precioBase * porcentajeIVA; //
        double total = precioBase + iva;           //

        // printf permite formatear decimales
        // %% imprime el símbolo % literal
        System.out.printf("Precio base: $%.2f%n", precioBase);
        System.out.printf("IVA (15%%):   $%.2f%n", iva);
        System.out.printf("Total:        $%.2f%n", total);
    }
}