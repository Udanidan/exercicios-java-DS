import java.util.Scanner;

public class ex44 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("tamanho do degrau: ");
        int degrau = scan.nextInt();

        System.out.println("altura desejada: ");
        int altura = scan.nextInt();

        int quantdegraus = altura / degrau;

        if(altura % degrau == 0){
            System.out.println("quantidade de edegraus para alcançar a altura desejada" + quantdegraus);
        }
        else{
            System.out.println("quantidade de edegraus para alcançar a altura desejada" + (quantdegraus+1));
        }
        
        scan.close();
    }
}