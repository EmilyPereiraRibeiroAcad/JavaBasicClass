package exercicio1;

import java.util.Scanner;

public class Banco {

	/*
	 * Elabore a classe Cliente
	 */

	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		//Instacie o objeto cliente da classe Cliente
		System.out.print("Nome do cliente: ");
		//leia do teclado o nome do cliente
		System.out.print("CPF: ");
		//leia do teclado o CPF do cliente
		System.out.print("Endereco: ");
		//leia do teclado o endereco do cliente
		System.out.print("Numero da conta: ");
		//leia do teclado o numero da conta do cliente
		System.out.print("Ano de abertura: ");
		//leia do teclado o ano da abertura da conta do cliente
		System.out.print("Saldo: ");
		//leia do teclado o saldo do cliente

		System.out.println();
		System.out.println("Apresentacao das Informacoes do Cliente ");
		System.out.println("Nome: ");
		System.out.println("CPF: ");
		System.out.println("Endereco: " );
		System.out.println("Numero da conta: " );
		System.out.println("Ano de abertura da conta: " );
		System.out.println("Saldo: R$");
		le.close();
	}

}
