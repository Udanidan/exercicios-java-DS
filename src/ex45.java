import java.util.Scanner;

public class ex45 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma letra maiuscula:");
        char maiuscula = scan.next().charAt(0);

        char minuscula = (char) (maiuscula + 32);

        System.out.println("letra minuscula: " + minuscula);
        
        scan.close();
    }
}