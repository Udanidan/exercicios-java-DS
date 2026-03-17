import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int nums = scan.nextInt();
        System.out.println("Digite mais um numero: ");
        nums += scan.nextInt();
        System.out.println("Digite o ultimo numero: ");
        nums += scan.nextInt();
        System.out.println("Soma: " + nums);
        scan.close();
    }
}
