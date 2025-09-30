import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FilaComControles {
    public static void main(String[] args) {
        Queue<String> filaAtendimento = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        
        while (opcao != 4) {
            System.out.println("\n=== SISTEMA DE ATENDIMENTO ===");
            System.out.println("1 - Adicionar cliente");
            System.out.println("2 - Atender próximo cliente");
            System.out.println("3 - Ver fila");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer
            
            switch (opcao) {
                case 1:
                    System.out.print("Nome do cliente: ");
                    String cliente = scanner.nextLine();
                    filaAtendimento.offer(cliente);
                    System.out.println(cliente + " adicionado à fila!");
                    break;
                    
                case 2:
                    if (filaAtendimento.isEmpty()) {
                        System.out.println("Fila vazia! Nenhum cliente para atender.");
                    } else {
                        String clienteAtendido = filaAtendimento.poll();
                        System.out.println("Atendendo: " + clienteAtendido);
                        
                        // Verificar se ainda há clientes
                        if (!filaAtendimento.isEmpty()) {
                            System.out.println("Próximo: " + filaAtendimento.peek());
                        } else {
                            System.out.println("Último cliente atendido!");
                        }
                    }
                    break;
                    
                case 3:
                    if (filaAtendimento.isEmpty()) {
                        System.out.println("Fila está vazia!");
                    } else {
                        System.out.println("Clientes na fila: " + filaAtendimento.size());
                        int posicao = 1;
                        for (String c : filaAtendimento) {
                            System.out.println(posicao + "º - " + c);
                            posicao++;
                        }
                    }
                    break;
                    
                case 4:
                    System.out.println("Encerrando sistema...");
                    break;
                    
                default:
                    System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }
}