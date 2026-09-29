public class ConversionTemperatura {
    public static void main(String[] args) {
        double fahrenheit = 98.0;

        // Orden correcto: primero paréntesis, luego
        // En Java double/double da resultado decimal
        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.printf("%.1fF = %.4fC%n", fahrenheit, celsius);

        // Conversión inversa para verificar: F = C *
        double fahrenheitRecalc = celsius * 9 / 5 + 32;
        System.out.printf("Verificacion: %.1fF%n", fahrenheitRecalc);
    }
}