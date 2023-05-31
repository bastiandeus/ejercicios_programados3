import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        int H = 23;
        int M = 59;
        int S = 59;
        if (H >= 0 && H <= 23 && M >= 0 && M <= 59 && S >= 0 && S <= 59) {
            System.out.println("La Hora es " + H + ":" + M + ":" + S);
        } else {
            System.out.println("La Hora no es valida");
        }
    }
    
}
