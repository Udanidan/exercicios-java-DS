import java.util.Scanner;

public class ex27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double h = scan.nextDouble();
        double m = h * 10000;

        System.out.println("convertido para metros: " + m);
        
        scan.close();
    }
}