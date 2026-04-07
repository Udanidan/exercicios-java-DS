import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double c = scan.nextDouble();
        double p = c/2.54;

        System.out.println("convertido para polegadas: " + p);
        
        scan.close();
    }
}