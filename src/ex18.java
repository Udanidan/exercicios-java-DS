import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double m = scan.nextDouble();
        double l = 1000 * m;

        System.out.println("Convertido para litros: " + l);
        
        scan.close();
    }
}