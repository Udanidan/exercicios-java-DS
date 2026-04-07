import java.util.Scanner;

public class ex30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("valor em real:");
        double real = scan.nextDouble();

        System.out.println("cotação dolar: ");
        double cota = scan.nextDouble();

        System.out.println("convertido para dolar: " + real * cota);
        
        scan.close();
    }
}