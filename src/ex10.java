import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double m = scan.nextInt()/3.6;
        System.out.println("convertido para metros: " + m);

        scan.close();
    }
}