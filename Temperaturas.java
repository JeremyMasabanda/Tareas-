import java.util.Scanner;

public class Temperaturas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cantidad = 0;
        double suma = 0;
        double mayor = 0;
        double menor = 0;
        boolean primero = true;

        int frio = 0;
        int templado = 0;
        int calido = 0;
        int muyCalido = 0;

        System.out.println("=== Registro de Temperaturas ===");
        System.out.println("Ingrese temperaturas entre -50 y 60. Ingrese 999 para terminar.");

        System.out.print("Temperatura: ");
        double temp = sc.nextDouble();

        while (temp != 999) {

            if (temp < -50 || temp > 60) {

                System.out.println("Dato invalido! Solo se acepta entre -50 y 60.");

            } else {

                if (temp < 10) {

                    System.out.println(temp + " -> Frio");
                    frio++;

                } else if (temp >= 10 && temp <= 24) {

                    System.out.println(temp + " -> Templado");
                    templado++;

                } else if (temp >= 25 && temp <= 34) {

                    System.out.println(temp + " -> Calido");
                    calido++;

                } else {

                    System.out.println(temp + " -> Muy calido");
                    muyCalido++;
                }

                suma += temp;
                cantidad++;

                if (primero) {

                    mayor = temp;
                    menor = temp;
                    primero = false;

                } else {

                    if (temp > mayor) {
                        mayor = temp;
                    }

                    if (temp < menor) {
                        menor = temp;
                    }
                }
            }

            System.out.print("Temperatura: ");
            temp = sc.nextDouble();
        }

        System.out.println("\n--- RESULTADO FINAL ---");

        if (cantidad > 0) {

            double promedio = suma / cantidad;

            System.out.println("Cantidad de datos: " + cantidad);
            System.out.println("Mayor: " + mayor);
            System.out.println("Menor: " + menor);
            System.out.println("Promedio: " + promedio);

            System.out.println("Cantidad por categoria:");
            System.out.println("Frio: " + frio);
            System.out.println("Templado: " + templado);
            System.out.println("Calido: " + calido);
            System.out.println("Muy calido: " + muyCalido);

        } else {

            System.out.println("No se ingresaron datos validos.");
        }

        sc.close();
    }
}