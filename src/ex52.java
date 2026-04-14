import java.util.Scanner;

public class ex52 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quanto foi apostado pelos 3 amigos no total:");
        double valorApostado = scan.nextDouble();

        System.out.println("Quanto cada um recebe:" + (valorApostado/3));
        
        scan.close();
    }
}