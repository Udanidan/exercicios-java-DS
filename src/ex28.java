import java.util.Scanner;
import java.lang.Math;

public class ex28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();

        double soma = Math.pow(num1, 2) + Math.pow(num2, 2) + Math.pow(num3, 2);

        System.out.println("a soma dos quadrados é: " + soma);

        scan.close();
    }
}