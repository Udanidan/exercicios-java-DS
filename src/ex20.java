import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double k = scan.nextDouble();
        double l = k / 0.45;

        System.out.println("Convertido para libras: " + l);
        
        scan.close();
    }
}