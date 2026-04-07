import java.util.Scanner;

public class ex33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double lado = scan.nextDouble();
        double q = lado * lado;

        System.out.println("Area do quadrado: " + q);
        
        scan.close();
    }
}