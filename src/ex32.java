import java.util.Scanner;

public class ex32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        int soma = ((num * 3) + 1) + ((num * 2) - 1);

        System.out.println("soma do sucessor do triplo com o antecessor do dobro: " + soma);
        
        scan.close();
    }
}