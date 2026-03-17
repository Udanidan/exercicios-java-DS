import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero: ");

        System.out.println("quinta parte: " + scan.nextDouble() / 5);
        scan.close();
    }
}