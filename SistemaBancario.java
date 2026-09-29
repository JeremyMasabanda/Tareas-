import java.util.Scanner;

// Clase sin 'public' para que pueda estar en el mismo archivo
class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    public String getNumeroCuenta() {
        return this.numeroCuenta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
            System.out.println("Monto acreditado correctamente. Nuevo saldo: $" + this.saldo);
        } else {
            System.out.println("El monto a depositar debe ser mayor a cero.");
        }
    }

    public boolean retirar(double monto) {
        if (monto > 0 && monto <= this.saldo) {
            this.saldo -= monto;
            return true;
        } else {
            return false;
        }
    }

    public void verAtributos() {
        System.out.println("----------------------------");
        System.out.println("Numero de Cuenta: " + this.numeroCuenta);
        System.out.println("Saldo Disponible: $" + this.saldo);
        System.out.println("----------------------------");
    }
}

// Nombre de la clase publica que coincide con el nombre del archivo SistemaBancario.java
public class SistemaBancario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese DNI del cliente: ");
        String dni = sc.next();

        // Creacion del arreglo de 3 cuentas
        CuentaBancaria[] cuentas = new CuentaBancaria[3];
        cuentas[0] = new CuentaBancaria("CTA-001", 1000.0);
        cuentas[1] = new CuentaBancaria("CTA-002", 500.0);
        cuentas[2] = new CuentaBancaria("CTA-003", 200.0);

        System.out.println("Cliente con DNI " + dni + " registrado con exito.");

        int opcion = 0;
        do {
            System.out.println("\n========== MENU BANCO ==========");
            System.out.println("1. Ver atributos de la cuenta");
            System.out.println("2. Enviar dinero (Retirar)");
            System.out.println("3. Recibir dinero (Depositar)");
            System.out.println("4. Transferir entre cuentas");
            System.out.println("5. Salir del sistema");
            System.out.print("Seleccione una opcion: ");

            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
            } else {
                System.out.println("Error: Ingrese un numero valido.");
                sc.next(); // Limpiar la entrada incorrecta
                continue;
            }

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Seleccione el indice de la cuenta (0, 1 o 2): ");
                int idx = sc.nextInt();

                if (idx < 0 || idx > 2) {
                    System.out.println("Error: Indice de cuenta fuera de rango (0 a 2).");
                    continue;
                }

                CuentaBancaria cuentaActual = cuentas[idx];

                switch (opcion) {
                    case 1:
                        cuentaActual.verAtributos();
                        break;

                    case 2:
                        System.out.print("Ingrese el monto a enviar: $");
                        double montoEnviar = sc.nextDouble();
                        if (cuentaActual.retirar(montoEnviar)) {
                            System.out.println("Envio realizado con exito. Saldo restante: $" + cuentaActual.getSaldo());
                        } else {
                            System.out.println("Error: Saldo insuficiente o monto no valido.");
                        }
                        break;

                    case 3:
                        System.out.print("Ingrese el monto a recibir: $");
                        double montoRecibir = sc.nextDouble();
                        cuentaActual.depositar(montoRecibir);
                        break;

                    case 4:
                        System.out.print("Seleccione el indice de la cuenta destino (0, 1 o 2): ");
                        int dest = sc.nextInt();

                        if (dest >= 0 && dest <= 2 && dest != idx) {
                            System.out.print("Ingrese el monto a transferir: $");
                            double montoTransferir = sc.nextDouble();

                            if (cuentaActual.retirar(montoTransferir)) {
                                cuentas[dest].depositar(montoTransferir);
                                System.out.println("Transferencia completada con exito hacia la cuenta " + cuentas[dest].getNumeroCuenta());
                            } else {
                                System.out.println("Error: Saldo insuficiente para realizar la transferencia.");
                            }
                        } else {
                            System.out.println("Error: Cuenta destino invalida o igual a la origen.");
                        }
                        break;
                }
            } else if (opcion != 5) {
                System.out.println("Opcion invalida. Ingrese un valor entre 1 y 5.");
            }

        } while (opcion != 5);

        System.out.println("\nGracias por usar el sistema bancario.");
        sc.close();
    }
}