import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double j = scan.nextDouble();
        double m = 0.91 * j;

        System.out.println("coonvertido para metros: " + m);
        
        scan.close();
    }
}