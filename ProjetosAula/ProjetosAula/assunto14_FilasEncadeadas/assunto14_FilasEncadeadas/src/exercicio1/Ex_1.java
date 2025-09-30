package exercicio1;

import java.util.Scanner;
import filas.FilaInt;

public class Ex_1 {

	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		FilaInt fila = new FilaInt();
		fila.init();
		System.out.print("Informe o valor positivo para inserir (negativo para encerrar):");
		int valor = le.nextInt();
		while (valor>=0) {
			fila.enqueue(valor);
			System.out.println("Informe valor positivo para inserir (negativo para encerrar) ");
			valor = le.nextInt();
			
		}
		while(!fila.isEmpty()) 
			System.out.println("Valor retirado: "+ fila.dequeue());
		le.close();
	}

}
