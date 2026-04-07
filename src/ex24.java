import java.util.Scanner;

public class ex24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double m = scan.nextDouble();
        double a = m * 0.000247;

        System.out.println("convertido para acres: " + a);
        
        scan.close();
    }
}