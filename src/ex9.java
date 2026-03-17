import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double k = scan.nextDouble() + 273.15;
        System.out.println(" convertido para kelvin" + k);
        scan.close();
    }
}