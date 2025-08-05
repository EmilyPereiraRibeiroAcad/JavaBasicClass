package exercicio3;

import java.util.Scanner;

class Cliente {
    String nome;
    String cpf;
    String endereco;
    String numeroConta;
    int anoAbertura;
    double saldo;
}

public class Banco {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        final int MAX_CLIENTES = 2000;
        Cliente[] clientes = new Cliente[MAX_CLIENTES];
        int totalClientes = 0;

        System.out.print("Quantos clientes deseja cadastrar? ");
        totalClientes = le.nextInt();
        le.nextLine();

        for (int i = 0; i < totalClientes; i++) {
            clientes[i] = new Cliente();
            System.out.println("Cliente " + (i + 1));
            System.out.print("Nome do cliente: ");
            clientes[i].nome = le.nextLine();
            System.out.print("CPF: ");
            clientes[i].cpf = le.nextLine();
            System.out.print("Endereco: ");
            clientes[i].endereco = le.nextLine();
            System.out.print("Numero da conta: ");
            clientes[i].numeroConta = le.nextLine();
            System.out.print("Ano de abertura: ");
            clientes[i].anoAbertura = le.nextInt();
            System.out.print("Saldo: ");
            clientes[i].saldo = le.nextDouble();
            le.nextLine(); 
            System.out.println();
        }

        int anoAtual = 2025;
        int maisDe10Anos = 0;
        for (int i = 0; i < totalClientes; i++) {
            if (anoAtual - clientes[i].anoAbertura > 10) {
                maisDe10Anos++;
            }
        }
        System.out.println("Clientes com conta aberta há mais de 10 anos: " + maisDe10Anos);

        int negativos = 0;
        System.out.println("Contas com saldo negativo:");
        for (int i = 0; i < totalClientes; i++) {
            if (clientes[i].saldo < 0) {
                negativos++;
                System.out.println("- Conta: " + clientes[i].numeroConta + " | Nome: " + clientes[i].nome);
            }
        }
        System.out.println("Total de contas com saldo negativo: " + negativos);

        System.out.print("\nDigite o CPF para buscar o cliente: ");
        String cpfBusca = le.nextLine();
        boolean encontrado = false;
        for (int i = 0; i < totalClientes; i++) {
            if (clientes[i].cpf.equals(cpfBusca)) {
                System.out.println("Cliente encontrado:");
                System.out.println("Nome: " + clientes[i].nome);
                System.out.println("CPF: " + clientes[i].cpf);
                System.out.println("Endereco: " + clientes[i].endereco);
                System.out.println("Numero da conta: " + clientes[i].numeroConta);
                System.out.println("Ano de abertura: " + clientes[i].anoAbertura);
                System.out.println("Saldo: R$" + clientes[i].saldo);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Cliente com CPF " + cpfBusca + " não encontrado.");
        }

        le.close();
    }
}
