package aplicacao;

import java.util.Scanner;

public class ConversaoTemperatura {

	public static void main(String[] args) {
		
		double F, C;

		Scanner le = new Scanner(System.in);
		System.out.println("Informe a temperatura em Farenheit: ");
		F = le.nextDouble();
		
		C = (double) 5/9 * (F - 32);
		System.out.println("Em centigrados:" + C);
		System.out.printf("Em centigrados: %.1fC", C);
		
		le.close();
		}
}
