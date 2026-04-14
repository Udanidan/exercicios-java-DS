import java.util.Scanner;

public class ex50 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("qual a idade:");
        int idade = scan.nextInt();

        System.out.println("Qual o ano:");
        int ano = scan.nextInt();

        System.out.println("ano de nascimento: " + (ano-idade));

        scan.close();
    }
}