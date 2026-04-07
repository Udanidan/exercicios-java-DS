import java.util.Scanner;

public class ex40 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double hora = 30;
        double mes = hora * 30;
        double sal = mes - (mes*0.08);
        
        System.out.println("O salario no mes com desconto de 8% é: " + sal);
        
        scan.close();
    }
}