import java.util.Scanner;

public class ex47 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero de 4 digitos:");
        char[] numeros = scan.nextLine().toCharArray();

        for (char numero : numeros) {
            System.out.println(numero);
        }
        
        scan.close();
    }
}