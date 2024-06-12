
import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int dig[][] = new int[4][4];
        // Entrada dedados

        for (int i = 0; i < 4; i++) {
            dig[i][i] = (int) Math.round(Math.random() * 100);
            System.out.print("[" + dig[i][i]+"]");
        }

        
            System.out.println("\n------------------------------");

            ler.close();


    }
}
