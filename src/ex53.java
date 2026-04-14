import java.util.Scanner;

public class ex53 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("comprimento:");
        int c = scan.nextInt();

        System.out.println("largura:");
        int l = scan.nextInt();

        System.out.println("preço por metro:");
        double p = scan.nextDouble();

        double custo = 2 * (c+l) * p;

        System.out.println("Custo total:" + custo);
        
        scan.close();
    }
}