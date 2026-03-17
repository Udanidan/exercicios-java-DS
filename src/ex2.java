import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero real: ");
        System.out.println("Numero digitado: " + scan.nextDouble());
        scan.close();
    }
}
