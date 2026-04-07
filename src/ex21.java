import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double l = scan.nextDouble();
        double k = l * 0.45;

        System.out.println("convertudi ara quilogramas: " + k);
        
        scan.close();
    }
}