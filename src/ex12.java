import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double m = scan.nextDouble();

        double k = 1.61 * m;

        System.out.println("convertido de milhas para Km: " + k);

        scan.close();
    }
}