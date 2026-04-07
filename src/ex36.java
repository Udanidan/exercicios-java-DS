import java.util.Scanner;
import java.lang.Math;

public class ex36 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double h = scan.nextDouble();
        double r = scan.nextDouble();
        
        double v = Math.PI * Math.pow(r, 2) * h;

        System.out.println("volume do cilindro: " + v);

        scan.close();
    }
}