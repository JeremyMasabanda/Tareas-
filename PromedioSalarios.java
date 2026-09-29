import java.util.Scanner;

public class PromedioSalarios {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double salario;
            double sumaSalarios = 0; // Acumulador
            int contadorEmpleados = 0; // Contador
            
            System.out.println("Ingresa el salario del empleado (ingresa un número negativo para terminar):");
            salario = sc.nextDouble(); // Lectura del centinela inicial
            
            // Ciclo controlado por evento / Centinela (salario < 0 es la condición de salida)
            while (salario >= 0) {
                sumaSalarios += salario;
                contadorEmpleados++;
                
                System.out.println("Ingresa el salario del siguiente empleado (negativo para terminar):");
                salario = sc.nextDouble(); // Modificador del centinela
            }
            
            // Cálculo del promedio validando que se hayan ingresado datos
            if (contadorEmpleados > 0) {
                double promedio = sumaSalarios / contadorEmpleados;
                System.out.println("\n--- Resultados ---");
                System.out.println("Total de empleados procesados: " + contadorEmpleados);
                System.out.printf("Promedio de salarios: $%.2f%n", promedio);
            } else {
                System.out.println("No se ingresaron salarios válidos.");
            }
        }
    }
}