public class DivisionEntera {
    public static void main(String[] args) {
        int a = 7;
        int b = 2;

        // División entera: pierde decimales aunque lo guardes
        double resultado1 = a / b;
        System.out.println(resultado1); // 3.0 (no 3.5)

        // División correcta: castear al menos un operando a c
        double resultado2 = (double) a / b;
        System.out.println(resultado2); // 3.5
    }
}