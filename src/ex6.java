import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double f = (scan.nextDouble() * (9.0/5.0)) + 32;

        System.out.println("convertido para fahrenheit: " + f);
        scan.close();
    }
}