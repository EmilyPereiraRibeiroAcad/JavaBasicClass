package exercicio3;

import java.util.Scanner;

public class Banco {	
	public static class Cliente{
	String nome, cpf,endereco;
	int conta, ano;
	double saldo;
	}
	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		//Instacie o objeto cliente da classe Cliente
		Cliente cliente = new Cliente ();
		System.out.print("Nome do cliente: ");
		//leia do teclado o nome do cliente
		cliente.nome = le.nextLine();
		System.out.print("CPF: ");
		cliente.cpf = le.nextLine();
		//leia do teclado o CPF do cliente
		System.out.print("Endereco: ");
		//leia do teclado o endereco do cliente
		cliente.endereco = le.nextLine();
		System.out.print("Numero da conta: ");
		//leia do teclado o numero da conta do cliente
		cliente.conta = le.nextInt();
		System.out.print("Ano de abertura: ");
		//leia do teclado o ano da abertura da conta do cliente
		cliente.ano = le.nextInt();
		System.out.print("Saldo: ");
		cliente.saldo = le.nextDouble();
		//leia do teclado o saldo do cliente

		System.out.println();
		System.out.println("Apresentacao das Informacoes do Cliente ");
		System.out.println("Nome: "+cliente.nome);
		System.out.println("CPF: "+cliente.cpf);
		System.out.println("Endereco: "+cliente.endereco );
		System.out.println("Numero da conta: "+cliente.conta );
		System.out.println("Ano de abertura da conta: " +cliente.ano);
		System.out.println("Saldo: R$"+cliente.saldo);
		le.close();
	}

}
