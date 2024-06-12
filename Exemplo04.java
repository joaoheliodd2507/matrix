import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int c[][] = new int[3][3];
        // Entrada dedados

        for (int l = 0; l < 3; l++) {
            for (int C = 0; C <3; C++) {
            a[l][C] = (int) Math.round(Math.random() * 100);
            b[l][C] = (int) Math.round(Math.random() * 100);
            c[l][C] = a[l][C] * b[l][C];
            
            
        }

    }
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.println("Matriz A");
            System.out.println("["+a[i][j]+"]");
        }
        System.out.println("\n------------------------------");
    }
    System.out.println("Matriz B");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.println("["+b[i][j]+"]");
         }
         System.out.println("\n------------------------------");
}
    }
}
