import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criamos um Scanner para ler o que voce digita no teclado
        Scanner scanner = new Scanner(System.in);
        
        // Criamos uma lista (ArrayList) dinamica para guardar os produtos cadastrados
        ArrayList<Produto> estoque = new ArrayList<>();
        
        int opcao = 0;

        // Loop do Menu Principal
        do {
            System.out.println("\n--- SISTEMA DE ESTOQUE (NICOLLAS) ---");
            System.out.println("1. Cadastrar Novo Produto");
            System.out.println("2. Listar Produtos no Estoque");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opcao: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do teclado

            switch (opcao) {
                case 1:
                    System.out.println("\n--- CADASTRO DE PRODUTO ---");
                    System.out.print("Digite o codigo (ID): ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer

                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();

                    System.out.print("Digite a quantidade em estoque: ");
                    int quantidade = scanner.nextInt();

                    System.out.print("Digite o preco: R$ ");
                    double preco = scanner.nextDouble();

                    // Criando o objeto Produto com as informações digitadas
                    Produto novoProduto = new Produto(codigo, nome, quantidade, preco);
                    
                    // Adicionando o produto na nossa lista de estoque
                    estoque.add(novoProduto);
                    System.out.println("[OK] Produto cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n--- PRODUTOS EM ESTOQUE ---");
                    if (estoque.isEmpty()) {
                        System.out.println("O estoque esta vazio.");
                    } else {
                        // Percorre a lista e exibe cada produto
                        for (Produto p : estoque) {
                            p.exibirInformacoes();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Encerrando o sistema... Ate logo!");
                    break;

                default:
                    System.out.println("Opcao invalida! Tente novamente.");
                    break;
            }

        } while (opcao != 3);

        scanner.close(); // Fecha o leitor do teclado
    }
}