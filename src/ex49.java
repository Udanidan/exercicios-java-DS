import java.util.Scanner;

public class ex49 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("quando foi o inicio do experimento (hh:mm:ss):");
        String[] inicio = scan.nextLine().split(":");
        int horaI = Integer.parseInt(inicio[0]);
        int minutoI = Integer.parseInt(inicio[1]);
        int segundoI = Integer.parseInt(inicio[2]);

        System.out.println("quantos segundos o experimento levou em segundos:");
        int original = scan.nextInt();
        
        int horasSoma = original / 3600;
        int minutosSoma = (original % 3600) / 60;
        int segundosSoma = original % 60;

        System.out.println("horario final: " + (horaI + horasSoma) + ":" + (minutoI + minutosSoma) + ":" + (segundoI+segundosSoma));
        
        scan.close();
    }
}