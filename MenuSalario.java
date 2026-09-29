import java.util.Scanner;

public class MenuSalario {

    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            int opcion;
            int contadorEmpleados = 0;
            double sumaSalarios = 0.0;
            double salarioMayor = 0.0;
            double salarioMenor = 0.0;
            
            do {
                System.out.println("\n===== SISTEMA DE SALARIOS =====");
                System.out.println("1. Registrar salarios");
                System.out.println("2. Mostrar resumen");
                System.out.println("3. Comparar un salario con el promedio");
                System.out.println("4. Reiniciar información");
                System.out.println("0. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = teclado.nextInt();
                
                switch (opcion) {
                    case 1:
                        System.out.print("\nIngrese el salario del empleado (valor negativo para terminar): ");
                        double salario = teclado.nextDouble();
                        
                        // Ciclo centinela con while
                        while (salario >= 0) {
                            // Si es el primer salario registrado, inicializa el mayor y menor
                            if (contadorEmpleados == 0) {
                                salarioMayor = salario;
                                salarioMenor = salario;
                            } else {
                                if (salario > salarioMayor) {
                                    salarioMayor = salario;
                                }
                                if (salario < salarioMenor) {
                                    salarioMenor = salario;
                                }
                            }
                            
                            // Acumulador y contador
                            sumaSalarios += salario;
                            contadorEmpleados++;
                            
                            System.out.print("Ingrese el salario del siguiente empleado (valor negativo para terminar): ");
                            salario = teclado.nextDouble();
                        }
                        System.out.println("Registro finalizado.");
                        break;
                        
                    case 2:
                        System.out.println("\n--- RESUMEN DE SALARIOS ---");
                        // Evita división entre cero
                        if (contadorEmpleados > 0) {
                            double promedio = sumaSalarios / contadorEmpleados;
                            System.out.println("Empleados registrados: " + contadorEmpleados);
                            System.out.printf("Suma total de salarios: $%.2f%n", sumaSalarios);
                            System.out.printf("Salario promedio: $%.2f%n", promedio);
                            System.out.printf("Salario mayor: $%.2f%n", salarioMayor);
                            System.out.printf("Salario menor: $%.2f%n", salarioMenor);
                        } else {
                            System.out.println("No hay información registrada. Seleccione la opción 1 primero.");
                        }
                        break;
                        
                    case 3:
                        if (contadorEmpleados > 0) {
                            double promedio = sumaSalarios / contadorEmpleados;
                            System.out.print("\nIngrese un salario a comparar: ");
                            double salarioConsulta = teclado.nextDouble();
                            
                            System.out.printf("Salario ingresado: $%.2f | Salario promedio: $%.2f%n", salarioConsulta, promedio);
                            if (salarioConsulta > promedio) {
                                System.out.println("El salario ingresado está POR ENCIMA del promedio.");
                            } else if (salarioConsulta < promedio) {
                                System.out.println("El salario ingresado está POR DEBAJO del promedio.");
                            } else {
                                System.out.println("El salario ingresado es IGUAL al promedio.");
                            }
                        } else {
                            System.out.println("\nNo se puede comparar. Registre salarios primero.");
                        }
                        break;
                        
                    case 4:
                        // Reiniciar la información
                        contadorEmpleados = 0;
                        sumaSalarios = 0.0;
                        salarioMayor = 0.0;
                        salarioMenor = 0.0;
                        System.out.println("\nInformación reiniciada correctamente.");
                        break;
                        
                    case 0:
                        System.out.println("\nSaliendo del sistema...");
                        break;
                        
                    default:
                        System.out.println("\nOpción no válida. Intente de nuevo.");
                }
                
            } while (opcion != 0);
        }
    }
}