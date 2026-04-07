import java.util.Scanner;
import java.lang.Math;

public class ex15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double r = scan.nextDouble();

        double g = r * 180 / Math.PI;

        System.out.println("convertido para graus: " + g);
        
        scan.close();
    }
}