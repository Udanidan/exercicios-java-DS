import java.util.Scanner;

public class ex31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        System.out.println("antecessor: " + (num-1));
        System.out.println("sucessor: " + (num+1));
        
        scan.close();
    }
}