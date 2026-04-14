import java.util.Scanner;
import java.lang.Math;

public class ex51 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("qual o eixo X:");
        int x = scan.nextInt();

        System.out.println("Qual o eixo Y:");
        int y = scan.nextInt();

        double d = Math.sqrt((Math.pow(x, 2)) + (Math.pow(y, 2)));

        System.out.println("distancia:" + d);
        
        scan.close();
    }
}