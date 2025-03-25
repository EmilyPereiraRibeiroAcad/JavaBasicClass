package aplicacao;

import java.util.Scanner;

public class saldos {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);

        final int N = 5;
        int idades[] = new int[N];
        int soma = 0;
        double media;

        
        for (int i = 0; i < N; i++) {
            System.out.print("Idade? ");
            idades[i] = le.nextInt();
            soma += idades[i]; 
        }

        
        media = (double) soma / N; 
        System.out.println("A média de idades: " + media);

        System.out.println("\nIdades acima da média:");
        for (int i = 0; i < N; i++) { 
            if (idades[i] > media) {
                System.out.println("Idade: " + idades[i]); 
            }
        }

        le.close();
    }
}
