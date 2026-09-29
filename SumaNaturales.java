public class SumaNaturales {
    public static void main(String[] args) {
        int n = 6;
        
        // Fórmula directa: n*(n+1)/2
        int resultado = n * (n + 1) / 2;
        System.out.println("Suma 1 a " + n + " = " + resultado); // 21

        // Verificación con ciclo (traza)
        int sumaVerificacion = 0;
        for (int i = 1; i <= n; i++) {
            sumaVerificacion += i;
        }
        System.out.println("Verificacion: " + sumaVerificacion); // 21
    }
}