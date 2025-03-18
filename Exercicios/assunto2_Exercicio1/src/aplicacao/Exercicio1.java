package aplicacao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * ALGORITMO 
		 * DECLARE Numérico real preco, desconto10;
		 * 
		 * preço = 20.5; desconto10 = preco * 0.9; ESCREVA desconto10 FIM
		 * 
		 */
		double preco, desconto10;
		Scanner le = new Scanner(System.in);
		System.out.println("Informe valor de preco R$");
		preco = le.nextDouble();
		
		
		desconto10 = preco*0.9;
		System.out.println("Com o preco R$"+ preco + " o valor com 10% desconto R$"+ desconto10);
		System.out.printf("%s%.2f%s%.2f\n","Com o preco R$",preco," o valor com 10% desconto R$",desconto10);
		
		
		int qlq = le.nextInt();	 
		le.close();
	}

}
