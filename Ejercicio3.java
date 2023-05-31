import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int cont = 0;
        while (num >= 0) {
            System.out.println("Ingrese un número: ");
            num = sc.nextInt();
            if (num >= 0) {
                if (num % 3 == 0 && num % 5 == 0) {
                    System.out.println(num + " es múltiplo de 3 y 5.");
                    cont++;
                } else {
                    System.out.println(num + " no es múltiplo de 3 y 5.");
                }
            }
        }
        System.out.println("Se ingresaron " + cont + " números múltiplos de 3 y 5.");
        sc.close();
    }
}
