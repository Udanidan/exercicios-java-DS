import java.util.Scanner;

public class ex25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();
        double m = a * 4048.58;

        System.out.println("convertido para metros: " + m);
        
        scan.close();
    }
}