import java.util.Scanner;

public class ex46 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero de 3 digitos:");
        String numero = scan.nextLine();

        String invertido = new StringBuilder(numero).reverse().toString();

        System.out.println("Numero invertido: " + invertido);
        
        scan.close();
    }
}