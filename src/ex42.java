import java.util.Scanner;

public class ex42 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o salario:");
        double salarioBase = scan.nextDouble();

        double salarioFinal = salarioBase + salarioBase * 0.05;

        salarioFinal = salarioFinal - (salarioFinal * 0.07);

        System.out.println("salario aplicando primeiramente 5% gratificação e logo após removendo 7% de imposto: " + salarioFinal);
        
        scan.close();
    }
}