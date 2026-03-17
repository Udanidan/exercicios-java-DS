import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        System.out.println("Numero digitado: " + scan.nextInt());
        scan.close();
    }
}
