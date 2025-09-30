package filas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaComControles {
    public static void main(String[] args) {
        List<String> listaProdutos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("\n=== CONTROLE DE ESTOQUE ===");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Remover produto");
            System.out.println("3 - Buscar produto");
            System.out.println("4 - Listar todos");
            System.out.println("5 - Estatísticas");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer
            
            switch (opcao) {
                case 1:
                    System.out.print("Nome do produto: ");
                    String novoProduto = scanner.nextLine();
                    
                    // Verificar se já existe
                    if (listaProdutos.contains(novoProduto)) {
                        System.out.println("Produto já existe na lista!");
                    } else {
                        listaProdutos.add(novoProduto);
                        System.out.println("Produto adicionado com sucesso!");
                    }
                    break;
                    
                case 2:
                    if (listaProdutos.isEmpty()) {
                        System.out.println("Lista vazia! Nada para remover.");
                    } else {
                        System.out.print("Produto a remover: ");
                        String produtoRemover = scanner.nextLine();
                        
                        if (listaProdutos.remove(produtoRemover)) {
                            System.out.println("Produto removido!");
                        } else {
                            System.out.println("Produto não encontrado!");
                        }
                    }
                    break;
                    
                case 3:
                    System.out.print("Buscar produto: ");
                    String busca = scanner.nextLine();
                    boolean encontrado = false;
                    int index = 0;
                    
                    // Buscar com while
                    while (index < listaProdutos.size()) {
                        if (listaProdutos.get(index).toLowerCase().contains(busca.toLowerCase())) {
                            System.out.println("Encontrado: " + listaProdutos.get(index) + " (posição " + index + ")");
                            encontrado = true;
                        }
                        index++;
                    }
                    
                    if (!encontrado) {
                        System.out.println("Nenhum produto encontrado!");
                    }
                    break;
                    
                case 4:
                    if (listaProdutos.isEmpty()) {
                        System.out.println("Lista vazia!");
                    } else {
                        System.out.println("Produtos em estoque (" + listaProdutos.size() + "):");
                        int contador = 0;
                        while (contador < listaProdutos.size()) {
                            System.out.println((contador + 1) + ". " + listaProdutos.get(contador));
                            contador++;
                        }
                    }
                    break;
                    
                case 5:
                    System.out.println("=== ESTATÍSTICAS ===");
                    System.out.println("Total de produtos: " + listaProdutos.size());
                    
                    if (!listaProdutos.isEmpty()) {
                        // Encontrar produto com nome mais longo
                        String maisLongo = listaProdutos.get(0);
                        int j = 1;
                        while (j < listaProdutos.size()) {
                            if (listaProdutos.get(j).length() > maisLongo.length()) {
                                maisLongo = listaProdutos.get(j);
                            }
                            j++;
                        }
                        System.out.println("Produto com nome mais longo: " + maisLongo);
                        
                        // Verificar categorias
                        int eletronicos = 0;
                        int livros = 0;
                        int outros = 0;
                        
                        for (String produto : listaProdutos) {
                            if (produto.toLowerCase().contains("phone") || 
                                produto.toLowerCase().contains("tablet") ||
                                produto.toLowerCase().contains("laptop")) {
                                eletronicos++;
                            } else if (produto.toLowerCase().contains("livro") ||
                                      produto.toLowerCase().contains("book")) {
                                livros++;
                            } else {
                                outros++;
                            }
                        }
                        
                        System.out.println("Eletrônicos: " + eletronicos);
                        System.out.println("Livros: " + livros);
                        System.out.println("Outros: " + outros);
                    }
                    break;
                    
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                    
                default:
                    System.out.println("Opção inválida!");
            }
            
        } while (opcao != 0);
        
        scanner.close();
    }
}