
for i in range(7,53):
    try:
        with open("src/ex"+str(i)+".java", "w", encoding="utf-8") as arquivos:
            arquivos.write("""import java.util.Scanner;

public class ex""" + str(i) + """ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        scan.close();
    }
}""")
        
    except FileExistsError:
        print("arquivo já existe")