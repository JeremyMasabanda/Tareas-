import java.util.Scanner;

public class EntradaSalida {
    public static void main(String[] args) {
        // Creamos un objeto Scanner que lee desde el teclado
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un numero: ");
        int numero = sc.nextInt(); // Equivale a cin >> en C++

        System.out.println("Ingresaste: " + numero);
        sc.close(); // Buena práctica: cerrar el Scanner al te
    }
}