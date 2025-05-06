package exemplos;

import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {
		/*
		 * Scanner le = new Scanner(System.in); System.out.print("Informe um nome: ");
		 * String nome = le.nextLine(); System.out.println("Nome informado: "+ nome);
		 * System.out.println("Quantidade de caracteres do nome: "+ nome.length());
		 * String profissao = " Enfermeira"; String completa = nome.concat(profissao);
		 * System.out.println(completa); String completa2= nome + " "+profissao;
		 * System.out.println(completa2); le.close();
		 */
		Scanner le = new Scanner(System.in);
		final int N = 10;
		String nomes[] = new String[N];
		char resp;
		int n = 0;
		do {
			System.out.print("Qual o nome do convidado? ");
			nomes[n] = le.nextLine();
			n++;
			System.out.print("Deseja cadastrar mais 1 convidado? (S-sim):");
			resp = le.nextLine().charAt(0);
		} while (n < N && resp == 'S' || resp == 's');
		System.out.println("Lista de convidados");
		for (int i = 0; i < n; i++)
			System.out.println(nomes[i]);
		le.close();

	}

}
