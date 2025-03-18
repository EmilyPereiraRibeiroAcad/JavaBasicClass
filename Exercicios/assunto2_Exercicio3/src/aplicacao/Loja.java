package aplicacao;

import java.util.Scanner;

public class Loja {

	public static void main(String[] args) {

		Scanner le = new Scanner(System.in);
		double valorCompra;
		int parcelas;

		System.out.print("Valor da compra: R$ ");
		valorCompra = le.nextDouble();

		System.out.print("Informe o número de parcelas: ");
		parcelas = le.nextInt();

		if (parcelas < 1) {
			System.out.println("Número de parcelas inválido! Deve ser no mínimo 1.");
			le.close();
			return;
		}

		double precoFinal;

		if (parcelas == 1) {
			precoFinal = valorCompra * 0.9;
		} else if (parcelas <= 3) {
			precoFinal = valorCompra;
		} else if (parcelas == 4) {
			precoFinal = valorCompra * 1.05;
		} else if (parcelas == 5) {
			precoFinal = valorCompra * 1.06;
		} else {
			precoFinal = valorCompra * 1.08;
		}

		System.out.printf("O preço final da compra é: R$ %.2f%n", precoFinal);

		le.close();
	}
}
