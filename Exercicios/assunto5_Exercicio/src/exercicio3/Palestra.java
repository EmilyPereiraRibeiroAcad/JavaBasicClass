package exercicio3;

import java.util.Scanner;

public class Palestra {

	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		final int N = 200;
		String alunos[] = new String[N];
		int resp;
		int n = 0;
		do {
			System.out.print("Qual o nome do aluno? ");
			alunos[n] = le.nextLine();
			n++;
			System.out.print("Deseja cadastrar mais 1 aluno? (1-sim):");
			resp = le.nextInt();
			le.nextLine();
		} while (n < N && resp == 1);
		do {
			System.out.print("Informe aluno procurado: ");
			String nomeProc = le.nextLine();
			boolean achou = false;
			for(int i=0; i<n && achou==false; i++) {
				if (alunos[i].equalsIgnoreCase(nomeProc))
					achou = true;
			}
			if (achou)
				System.out.println("Aluno esteve na palestra");
			else
				System.out.println("Aluno nao compareceu a palestra");
			System.out.print("Deseja procurar mais 1 aluno? (1-sim):");
			resp = le.nextInt();
			le.nextLine();
		} while (resp == 1);
	}
	

}
