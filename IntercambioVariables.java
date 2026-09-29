public class IntercambioVariables {
    public static void main(String[] args) {
        int A = 5, B = 10;
        int temp;
        // Guardamos A antes de perderlo
        temp = A;
        // A recibe el valor de B 
        A = B;
        // B recibe el valor original de A guardado en temp
        B = temp;
        System.out.println("A = " + A); //10
        System.out.println("B = " + B); //5

    }
    
}
