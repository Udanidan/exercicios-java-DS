import java.util.Scanner;
import java.lang.Math;

public class ex35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();
        double b = scan.nextDouble();

        double h = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.err.println("hipotenusa: " + h);
        
        scan.close();
    }
}