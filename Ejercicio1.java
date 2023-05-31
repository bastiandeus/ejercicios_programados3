import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();
        System.out.println("Ingrese otro numero: ");
        int num2 = sc.nextInt();
        if (num == num2) {
            System.out.println("Los numeros son iguales");
        } else {
            System.out.println("Los numeros no son iguales");
        }
    }
}