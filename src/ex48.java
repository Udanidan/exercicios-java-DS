import java.util.Scanner;

public class ex48 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("digite uma quantidade de segundos:");
        int original = scan.nextInt();

        int horas = original / 3600;
        int minutos = (original % 3600) / 60;
        int segundos = original % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);
        
        scan.close();
    }
}