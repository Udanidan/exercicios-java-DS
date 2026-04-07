import java.util.Scanner;
import java.lang.Math;

public class ex34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double r = scan.nextDouble();
        double a = Math.PI * (r*r);

        System.out.println("area do circulo: " + a);
        
        scan.close();
    }
}