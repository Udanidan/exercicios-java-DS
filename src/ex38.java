import java.util.Scanner;

public class ex38 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double sal = scan.nextDouble();

        double novosal = sal + (sal*0.25);

        System.out.println("Salario com aumento de 25%: " + novosal);
        
        scan.close();
    }
}