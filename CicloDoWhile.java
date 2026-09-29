import java.util.Scanner;

public class CicloDoWhile {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            char seguir; // Centinela
            
            do {
                System.out.println("Calculando...");
                System.out.println("¿Desea realizar nuevos cálculos [S/N]?");
                seguir = sc.next().charAt(0); // Modificador
            } while (seguir == 'S' || seguir == 's'); // Condición
        } // Centinela
    }
}