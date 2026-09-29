public class CicloFor {
    public static void main(String[] args) {
        int suma = 0; // Acumulador

        for (int i = 1; i <= 4; i++) { // Contador i
            suma = suma + i;
        }

        System.out.println("Total: " + suma);
    }
}