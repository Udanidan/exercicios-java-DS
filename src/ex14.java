import java.util.Scanner;
import java.lang.Math;

public class ex14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double g = scan.nextDouble();

        double r = g * Math.PI / 180;

        System.out.println("converido em radiano: " + r);
        
        scan.close();
    }
}