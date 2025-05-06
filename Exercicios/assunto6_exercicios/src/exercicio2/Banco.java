package exercicio2;

import java.util.Scanner;


public class Banco {

		public static class Aluno{
			String nome, curso;
			int rm, ano;
		}
		
		public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		Aluno alunos[] = new Aluno[3];
		for (int i=0; i<3; i++) {
		// cria a "ficha com registro do aluno"    
		Aluno aluno = new Aluno();
		System.out.print("Nome do aluno: ");
		aluno.nome = le.nextLine();
		System.out.print("Curso: ");
		aluno.curso = le.nextLine();
		System.out.print("RM: ");
		aluno.rm = le.nextInt();
		System.out.print("Ano de ingresso: ");
		aluno.ano = le.nextInt();
		le.nextLine();
		// Armazena a "ficha" do aluno no vetor na posição i
		alunos[i] = aluno;
		}
		}
		}
		