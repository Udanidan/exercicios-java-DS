import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double p = scan.nextDouble();
        double c = p * 2.54;

        System.out.println("convertido para centimetro: " + c);
        
        scan.close();
    }
}