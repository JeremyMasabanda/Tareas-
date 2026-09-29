import java.util.Scanner;

public class Jean {
    private String codigo;
    private String color;
    private String talla;
    private boolean fueTenido;
    private int cantidadTenidos;
    private double precio;
    private int cantidadBotones;
    private double humedad;
    private String estadoTela;

    public Jean(String codigo, String color, String talla, boolean fueTenido, int cantidadTenidos, 
                double precio, int cantidadBotones, double humedad, String estadoTela) {
        this.codigo = codigo;
        this.color = color;
        this.talla = talla;
        this.fueTenido = fueTenido;
        this.cantidadTenidos = cantidadTenidos;
        this.precio = precio;
        this.cantidadBotones = cantidadBotones;
        this.humedad = humedad;
        this.estadoTela = estadoTela;
    }

    public void Lavar() {
        if (this.cantidadTenidos > 0) {
            this.cantidadTenidos--;
            System.out.println("El jean ha sido lavado. Cantidad de teñidos restante: " + this.cantidadTenidos);
        } else {
            System.out.println("El jean ya no tiene tintura excedente.");
        }
    }

    public void Secar() {
        if (this.humedad > 0) {
            this.humedad -= 20.0;
            if (this.humedad < 0) {
                this.humedad = 0;
            }
            System.out.println("El jean se ha secado. Humedad actual: " + this.humedad + "%");
        } else {
            System.out.println("El jean ya está completamente seco.");
        }
    }

    public void MostrarDatos() {
        System.out.println("\n----------------------------");
        System.out.println("Código: " + this.codigo);
        System.out.println("Color: " + this.color);
        System.out.println("Talla: " + this.talla);
        System.out.println("Fue teñido: " + (this.fueTenido ? "Sí" : "No"));
        System.out.println("Cantidad de teñidos: " + this.cantidadTenidos);
        System.out.println("Precio: $" + this.precio);
        System.out.println("Cantidad de botones: " + this.cantidadBotones);
        System.out.println("Humedad: " + this.humedad + "%");
        System.out.println("Estado de la tela: " + this.estadoTela);
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Jean miJean = new Jean("J-2026", "Azul Marino", "32", true, 3, 45.99, 4, 80.0, "Nuevo");

        int opcion = 0;
        do {
            System.out.println("\n=== GESTIÓN DE JEAN ===");
            System.out.println("1. Mostrar Datos");
            System.out.println("2. Lavar");
            System.out.println("3. Secar");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
            } else {
                System.out.println("Opción inválida. Ingrese un número de 1 a 4.");
                sc.next();
                continue;
            }

            switch (opcion) {
                case 1:
                    miJean.MostrarDatos();
                    break;
                case 2:
                    miJean.Lavar();
                    break;
                case 3:
                    miJean.Secar();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción fuera de rango.");
            }
        } while (opcion != 4);

        sc.close();
    }
}
