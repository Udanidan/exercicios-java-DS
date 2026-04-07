import java.util.Scanner;

public class ex23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double m = scan.nextDouble();
        double j = m/0.91;

        System.out.println("convertido para jardas: " + j);
        
        scan.close();
    }
}