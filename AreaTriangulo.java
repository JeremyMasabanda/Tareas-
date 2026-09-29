// ANÁLISIS: Calcular el área de un triángulo
// Entrada: base y altura
// Proceso: area = (base * altura) / 2
// Salida: área del triángulo
import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la base: ");
        double base = sc.nextDouble();

        System.out.print("Ingresa la altura: ");
        double altura = sc.nextDouble();

        // Proceso: aplicamos la fórmula del área
        double area = (base * altura) / 2;

        System.out.println("Area = " + area);
        sc.close();
    }
}