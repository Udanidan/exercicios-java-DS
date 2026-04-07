import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double l = scan.nextDouble();
        double m = l/1000;

        System.out.println("convertido para metros: " + m);
        
        scan.close();
    }
}