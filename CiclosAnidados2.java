public class CiclosAnidados2 {
    public static void main(String[] args) {
        // Ciclo exterior: controla las filas (se repite 3 veces)
        for (int fila = 1; fila <= 3; fila++) {
            // Ciclo interior: controla las columnas (se repite 4 veces por cada fila)
            for (int col = 1; col <= 4; col++) {
                System.out.print("* ");
            }
            // Salto de línea al terminar cada fila
            System.out.println();
        }
    }
}