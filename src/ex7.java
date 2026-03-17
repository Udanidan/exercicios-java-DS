import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double c = 5.0 * (scan.nextDouble() - 32) / 9.0;

        System.out.println("convertido para celsios: " + c);
        scan.close();
    }
}