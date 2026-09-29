import java.util.Scanner;

public class ControlCalificaciones {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = 0;
            double suma = 0;
            double notaAlta = 0;
            double notaBaja = 10;
            int aprobados = 0;
            int reprobados = 0;
            
            // Validacion con WHILE - numero de estudiantes > 0
            System.out.print("Ingrese numero de estudiantes: ");
            n = sc.nextInt();
            while (n <= 0) {
                System.out.print("Error, debe ser mayor que cero. Ingrese de nuevo: ");
                n = sc.nextInt();
            }
            
            double[] notas = new double[n];
            
            // Procesamiento con FOR
            for (int i = 0; i < n; i++) {
                System.out.print("Calificacion del estudiante " + (i+1) + " (0-10): ");
                double nota = sc.nextDouble();
                
                // Validacion con WHILE - nota entre 0 y 10
                while (nota < 0 || nota > 10) {
                    System.out.print("Error, nota entre 0 y 10. Ingrese de nuevo: ");
                    nota = sc.nextDouble();
                }
                
                notas[i] = nota;
                suma += nota;
                
                if (nota >= 7) {
                    aprobados++;
                } else {
                    reprobados++;
                }
                
                if (nota > notaAlta) {
                    notaAlta = nota;
                }
                if (nota < notaBaja) {
                    notaBaja = nota;
                }
            }
            
            double promedio = suma / n;
            
            System.out.println("\n--- RESULTADOS ---");
            System.out.println("Numero de estudiantes: " + n);
            System.out.println("Suma de calificaciones: " + suma);
            System.out.println("Promedio general: " + promedio);
            System.out.println("Cantidad de aprobados: " + aprobados);
            System.out.println("Cantidad de reprobados: " + reprobados);
            System.out.println("Nota mas alta: " + notaAlta);
            System.out.println("Nota mas baja: " + notaBaja);
        }
    }
}