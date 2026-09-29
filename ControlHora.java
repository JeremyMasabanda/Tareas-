import java.util.Scanner;

public class ControlHora {
    private int horas;
    private int minutos;
    private int segundos;

    public ControlHora(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public void ingresarHora(Scanner sc) {
        System.out.print("Ingrese horas (0-23): ");
        this.horas = sc.nextInt();
        System.out.print("Ingrese minutos (0-59): ");
        this.minutos = sc.nextInt();
        System.out.print("Ingrese segundos (0-59): ");
        this.segundos = sc.nextInt();
    }

    public void mostrarHora() {
        System.out.printf("Hora registrada: %02d:%02d:%02d%n", horas, minutos, segundos);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ControlHora reloj = new ControlHora(0, 0, 0);
        
        reloj.ingresarHora(sc);
        String opcion;

        do {
            reloj.mostrarHora();
            System.out.print("\n¿Desea cambiar la hora? (s/n): ");
            opcion = sc.next();
            if (opcion.equalsIgnoreCase("s")) {
                reloj.ingresarHora(sc);
            }
        } while (opcion.equalsIgnoreCase("s"));

        System.out.println("Programa finalizado.");
        sc.close();
    }
}