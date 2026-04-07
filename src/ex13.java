import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double k = scan.nextDouble();

        double m = k/1.61;

        System.out.println("convertido para milhas: " + m);
        
        scan.close();
    }
}