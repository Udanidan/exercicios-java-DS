import java.util.Scanner;

public class ex26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double m = scan.nextDouble();
        double h = m * 0.0001;

        System.out.println("convertido para hectares: " + h);
        
        scan.close();
    }
}