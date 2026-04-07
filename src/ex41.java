import java.util.Scanner;

public class ex41 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("valor da hora:");
        double valor = scan.nextDouble();

        System.out.println("quantidade de horas:");
        double quant = scan.nextDouble();

        double sal = valor * quant;

        System.out.println("Total com 10% de aumento: " + sal + (sal*0.1));
        
        scan.close();
    }
}