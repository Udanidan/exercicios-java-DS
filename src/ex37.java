import java.util.Scanner;

public class ex37 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double valor = scan.nextDouble();

        System.out.println("Valor com desconto: " + (valor + (valor*0.12)));
        
        scan.close();
    }
}