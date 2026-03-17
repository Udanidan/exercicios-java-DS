import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double c = scan.nextDouble() - 273.15;
        System.out.println("convertido para celsius: " + c);
        scan.close();
    }
}