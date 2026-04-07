import java.util.Scanner;

public class ex39 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double valor = 780000.00;

        System.out.println("do valor total de: " + valor);
        System.out.println("O 1º ganhou: " + valor*0.46);
        System.out.println("O 2º ganhou: " + valor*0.32);
        System.out.println("O restante ganhou: " + valor*0.22);
        
        scan.close();
    }
}