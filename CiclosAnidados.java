public class CiclosAnidados {
    public static void main(String[] args) {

        for (int horas = 0; horas < 24; horas++) { // Externo
            for (int minutos = 0; minutos < 60; minutos++) { // Interno
                // Bloque ejecutado 1,440 veces en total
                System.out.println("Hora: " + horas + " - Minuto: " + minutos);
            }
        }

    }
}