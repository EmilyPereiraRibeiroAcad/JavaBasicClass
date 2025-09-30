package exercicio1;

import java.util.Scanner;

import filas.FilaInt;

public class ex_2 {
	public static void main(String[] args) {
		Scanner le = new Scanner (System.in);
		FilaInt fila = new FilaInt();
		fila.init();
		int opcao;
		do {
			System.out.println("1 - submete processo para execucao");
			System.out.println("2 - executa um processo");
			System.out.println("3 - shhutdown");
			
			opcao = le.nextInt();
			
			switch (opcao) {
			case 1 :
				System.out.println("Submete o processo - informe PID");
				int pid = le.nextInt();
				fila.enqueue(pid);
				break;
				
			case 2:
				if(fila.isEmpty()) {
				System.out.println("executa");
				}else {
					pid = fila.dequeue();
					System.out.println("O processo "+pid+" está em execucao");
					System.out.println("processo foi concluido? (1-sim): ");
					
					int resp = le.nextInt();
					if(resp==1)
						System.out.println("Processo "+pid+" foi concluido" );
					else {
						fila.enqueue(pid);
						System.out.println("Processo "+pid+" voltou para o fim da fila");
					}
				}
				break;
				
			case 3: 
			System.out.println("Shutdown");
			break;
			
			default:
				System.out.println("Opcao invalida");
			}
			
		}while(opcao!=3);
		
		le.close();
		
	}
}
