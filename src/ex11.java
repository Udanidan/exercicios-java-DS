import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double m = scan.nextDouble();

        double k = m * 3.6;

        System.out.println("convertido para kilometro por hora: " + k);

        scan.close();
    }
}