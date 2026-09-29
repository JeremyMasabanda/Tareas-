// PSEUDOCÓDIGO PREVIO:
// INICIO
//   Leer numero
//   SI numero > 0 ENTONCES
//     Escribir "Positivo"
//   SINO
//     Escribir "No positivo"
//   FIN SI
// FIN
import java.util.Scanner;

public class NumeroPositivo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingresa un numero: ");
            int numero = sc.nextInt();

            // El pseudocódigo se traduce directamente a código
            if (numero > 0) {
                System.out.println("Positivo");
            } else {
                System.out.println("No positivo");
            }
        }
    }
}