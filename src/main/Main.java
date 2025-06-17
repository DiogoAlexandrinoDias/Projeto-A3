package main; // Define o pacote onde a classe está localizada

import dao.ProdutoDAO; // Importa a classe que contém as operações CRUD
import model.produtos; // Importa a classe `produtos` que representa um produto
import java.sql.SQLException; // Importa a exceção SQL para tratamento de erros de banco
import java.util.List; // Importa a interface `List` para manipular listas
import java.util.Scanner; // Importa `Scanner` para entrada de dados do usuário via teclado

/**
 * Classe `Main` responsável por fornecer um menu interativo para gerenciamento de produtos.
 */
public class Main {
    public static void main(String[] args) {
        ProdutoDAO dao = new ProdutoDAO(); // Instancia a classe DAO para acesso ao banco
        Scanner scanner = new Scanner(System.in); // Instancia `Scanner` para capturar entrada do usuário
        int opcao; // Variável para armazenar a opção escolhida pelo usuário

        // 🔹 Exibição do menu e execução de comandos até que o usuário escolha sair
        do {
            System.out.println("\n===== MENU CRUD =====");
            System.out.println("1 - Adicionar Produto");
            System.out.println("2 - Listar Produtos");
            System.out.println("3 - Buscar Produto por ID");
            System.out.println("4 - Atualizar Produto");
            System.out.println("5 - Deletar Produto");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt(); // Captura a opção escolhida
            scanner.nextLine(); // Limpa o buffer do teclado

            // 🔹 Executa ações com base na opção escolhida pelo usuário
            switch (opcao) {
                case 1:
                    adicionarProduto(dao, scanner); // Chama método para adicionar produto
                    break;
                case 2:
                    listarProdutos(dao); // Chama método para listar produtos
                    break;
                case 3:
                    buscarProdutoPorId(dao, scanner); // Chama método para buscar produto por ID
                    break;
                case 4:
                    atualizarProduto(dao, scanner); // Chama método para atualizar produto
                    break;
                case 5:
                    deletarProduto(dao, scanner); // Chama método para deletar produto
                    break;
                case 0:
                    System.out.println("Saindo do programa..."); // Mensagem de saída
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente."); // Mensagem de erro
            }
        } while (opcao != 0); // Mantém o menu rodando até que a opção seja `0`

        scanner.close(); // Fecha o Scanner para evitar consumo desnecessário de memória
    }

    // 🔹 Método para adicionar um novo produto ao banco
    private static void adicionarProduto(ProdutoDAO dao, Scanner scanner) {
        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine(); // Captura o nome do produto
        System.out.print("Digite a quantidade: ");
        int quantidade = scanner.nextInt(); // Captura a quantidade do produto

        produtos novoProduto = new produtos(nome, quantidade); // Cria um objeto `produtos` com os valores fornecidos
        try {
            dao.salvar(novoProduto); // Chama o método para salvar o produto no banco
            System.out.println("Produto adicionado com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao adicionar produto: " + e.getMessage()); // Exibe erro caso ocorra falha na inserção
        }
    }

    // 🔹 Método para listar todos os produtos do banco
    private static void listarProdutos(ProdutoDAO dao) {
        try {
            List<produtos> lista = dao.listar(); // Obtém a lista de produtos do banco
            System.out.println("\n===== Lista de Produtos =====");
            lista.forEach(System.out::println); // Itera sobre a lista e exibe cada produto
        } catch (SQLException e) {
            System.out.println("Erro ao listar produtos: " + e.getMessage()); // Exibe erro caso ocorra falha na busca
        }
    }

    // 🔹 Método para buscar um produto pelo seu ID
    private static void buscarProdutoPorId(ProdutoDAO dao, Scanner scanner) {
        System.out.print("Digite o ID do produto: ");
        int id = scanner.nextInt(); // Captura o ID informado pelo usuário

        try {
            produtos produto = dao.buscarPorId(id); // Busca o produto no banco pelo ID fornecido
            if (produto != null) {
                System.out.println("Produto encontrado: " + produto); // Exibe o produto encontrado
            } else {
                System.out.println("Produto não encontrado!"); // Mensagem caso o produto não exista no banco
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar produto: " + e.getMessage()); // Exibe erro caso ocorra falha na consulta
        }
    }

    // 🔹 Método para atualizar um produto no banco
    private static void atualizarProduto(ProdutoDAO dao, Scanner scanner) {
        System.out.print("Digite o ID do produto que deseja atualizar: ");
        int id = scanner.nextInt(); // Captura o ID do produto a ser atualizado
        scanner.nextLine(); // Limpa o buffer do teclado

        try {
            produtos produto = dao.buscarPorId(id); // Obtém os dados atuais do produto
            if (produto != null) {
                System.out.print("Digite o novo nome do produto: ");
                String nome = scanner.nextLine(); // Captura o novo nome do produto
                System.out.print("Digite a nova quantidade: ");
                int quantidade = scanner.nextInt(); // Captura a nova quantidade

                // Atualiza os atributos do objeto `produtos`
                produto.setNome(nome);
                produto.setQuantidade(quantidade);

                dao.atualizar(produto); // Chama o método para atualizar o produto no banco
                System.out.println("Produto atualizado com sucesso!");
            } else {
                System.out.println("Produto não encontrado!"); // Mensagem caso o ID seja inválido
            }
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar produto: " + e.getMessage()); // Exibe erro caso ocorra falha na atualização
        }
    }

    // 🔹 Método para deletar um produto do banco
    private static void deletarProduto(ProdutoDAO dao, Scanner scanner) {
        System.out.print("Digite o ID do produto que deseja deletar: ");
        int id = scanner.nextInt(); // Captura o ID do produto a ser removido

        try {
            dao.deletar(id); // Chama o método para deletar o produto do banco
            System.out.println("Produto deletado com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao deletar produto: " + e.getMessage()); // Exibe erro caso ocorra falha na remoção
        }
    }
}
