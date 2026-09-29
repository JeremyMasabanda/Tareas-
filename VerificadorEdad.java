import java.util.Scanner;

public class VerificadorEdad {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int idade = 0; // Estado Inicial
            
            while (idade < 18) { // Condición
                System.out.println("Ingresa tu edad:");
                idade = sc.nextInt(); // Modificador
            }
            
            System.out.println("Acceso permitido.");
        } // Estado Inicial
    }
}