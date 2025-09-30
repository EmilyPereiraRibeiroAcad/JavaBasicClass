import java.util.Stack;

public class PilhaComControles {
    public static void main(String[] args) {
        Stack<String> pilhaTarefas = new Stack<>();
        String[] tarefas = {"Escrever relatório", "Revisar código", "Testar sistema", "Enviar email"};
        
        // Empilhar tarefas usando while
        int i = 0;
        while (i < tarefas.length) {
            pilhaTarefas.push(tarefas[i]);
            System.out.println("Tarefa adicionada: " + tarefas[i]);
            i++;
        }
        
        System.out.println("\n=== PROCESSANDO TAREFAS ===");
        
        // Processar tarefas até a pilha ficar vazia
        while (!pilhaTarefas.isEmpty()) {
            String tarefaAtual = pilhaTarefas.peek();
            System.out.println("Processando: " + tarefaAtual);
            
            // Simular diferentes tipos de processamento
            if (tarefaAtual.contains("relatório")) {
                System.out.println("   → Esta tarefa requer mais tempo!");
            } else if (tarefaAtual.contains("código")) {
                System.out.println("   → Revisando qualidade do código...");
            } else {
                System.out.println("   → Executando tarefa padrão");
            }
            
            // Remover tarefa concluída
            String tarefaConcluida = pilhaTarefas.pop();
            System.out.println("   ✓ Concluída: " + tarefaConcluida);
            
            // Mostrar situação atual
            if (!pilhaTarefas.isEmpty()) {
                System.out.println("   Próxima tarefa: " + pilhaTarefas.peek());
            } else {
                System.out.println("   ★ Todas as tarefas foram concluídas!");
            }
            System.out.println();
        }
        
        // Verificação final
        if (pilhaTarefas.isEmpty()) {
            System.out.println("Pilha verificada: realmente está vazia!");
        }
    }
}