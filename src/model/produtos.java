package model; // Define o pacote onde a classe está localizada

/**
 * Classe `produtos` representa um produto no sistema.
 * Contém atributos para armazenar ID, nome e quantidade.
 */
public class produtos {
    private int id; // Identificador único do produto
    private String nome; // Nome do produto
    private int quantidade; // Quantidade disponível do produto

    // 🔹 Construtor que recebe apenas nome e quantidade (usado na inserção)
    public produtos(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    // 🔹 Construtor que recebe id, nome e quantidade (usado na busca e atualização)
    public produtos(int id, String nome, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    // 🔹 Métodos "getter" para acessar os atributos
    public int getId() { return id; }
    public String getNome() { return nome; }
    public int getQuantidade() { return quantidade; }

    // 🔹 Métodos "setter" para modificar os atributos
    public void setId(int id) { this.id = id; }
    public void setNome(String nome) { this.nome = nome; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    /**
     * Método para representar o produto como texto (usado na impressão).
     */
    @Override
    public String toString() {
        return "|Produtoid: " + id + "| nome: " + nome + "| quantidade: " + quantidade + "|";
    }
}
