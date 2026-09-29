import java.util.Scanner;

public class CalculoPromedio {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            double salario;
            double sumaSalarios = 0;
            int cantidadEmpleados = 0;
            
            System.out.print("Ingrese el salario del empleado (0 o valor negativo para terminar): ");
            salario = teclado.nextDouble();
            
            // Condición ajustada: se ejecuta únicamente con salarios mayores a 0
            while (salario > 0) {
                sumaSalarios += salario;
                cantidadEmpleados++;
                
                // Solicita el siguiente salario
                System.out.print(
                        "Ingrese el salario del siguiente empleado "
                                + "(0 o valor negativo para terminar): ");
                
                // Actualiza la variable de control
                salario = teclado.nextDouble();
            }
            
            // Evita una división entre cero
            if (cantidadEmpleados > 0) {
                
                double promedio = sumaSalarios / cantidadEmpleados;
                
                System.out.println("\n--- RESULTADOS ---");
                System.out.println(
                        "Empleados registrados: "
                                + cantidadEmpleados);
                
                System.out.printf(
                        "Suma de salarios: $%.2f%n",
                        sumaSalarios);
                
                System.out.printf(
                        "Promedio de salarios: $%.2f%n",
                        promedio);
                
            } else {
                System.out.println("\nNo se ingresaron salarios válidos.");
            }
        }
    }
}