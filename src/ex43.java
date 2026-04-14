import java.util.Scanner;

public class ex43 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double valorVenda = scan.nextDouble();

        double avista = valorVenda - (valorVenda * 0.1);
        double parcelado = valorVenda;

        System.out.println("comissão à vista: " + (avista * 0*05));
        System.out.println("comissão parcelado em 3x sem juros: " + (parcelado*0.05));

        scan.close();
    }
}