package dao; // Define o pacote onde a classe está localizada

import model.produtos; // Importa o modelo `produtos` para manipulação de objetos
import util.conexaoDB; // Importa a classe `conexaoDB` para conexão com MySQL

import java.sql.*; // Importa todas as classes relacionadas ao SQL (Connection, PreparedStatement, ResultSet)
import java.util.ArrayList; // Importa a classe `ArrayList` para armazenar listas de produtos
import java.util.List; // Importa a interface `List` para trabalhar com listas

/**
 * Classe `ProdutoDAO` responsável pelo CRUD no banco de dados.
 */
public class ProdutoDAO {

    // 🔹 Criar um novo produto
    public void salvar(produtos produto) throws SQLException {
        String sql = "INSERT INTO produtos (nome, quantidade) VALUES (?, ?)"; // SQL de inserção
        try (Connection conn = conexaoDB.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, produto.getNome()); // Define o nome do produto
            stmt.setInt(2, produto.getQuantidade()); // Define a quantidade do produto
            stmt.executeUpdate(); // Executa a inserção no banco

            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                produto.setId(rs.getInt(1)); // Obtém o ID gerado automaticamente
            }
        }
    }

    // 🔹 Listar todos os produtos
    public List<produtos> listar() throws SQLException {
        List<produtos> lista = new ArrayList<>();
        String sql = "SELECT id, nome, quantidade FROM produtos";

        try (Connection conn = conexaoDB.conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                lista.add(new produtos(rs.getInt("id"), rs.getString("nome"), rs.getInt("quantidade")));
            }
        }
        return lista;
    }

    // 🔹 Buscar produto por ID
    public produtos buscarPorId(int id) throws SQLException {
        String sql = "SELECT id, nome, quantidade FROM produtos WHERE id = ?";

        try (Connection conn = conexaoDB.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new produtos(rs.getInt("id"), rs.getString("nome"), rs.getInt("quantidade"));
            }
        }
        return null;
    }

    // 🔹 Atualizar um produto
    public void atualizar(produtos produto) throws SQLException {
        String sql = "UPDATE produtos SET nome = ?, quantidade = ? WHERE id = ?";

        try (Connection conn = conexaoDB.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, produto.getNome());
            stmt.setInt(2, produto.getQuantidade());
            stmt.setInt(3, produto.getId());
            stmt.executeUpdate();
        }
    }

    // 🔹 Deletar um produto
    public void deletar(int id) throws SQLException {
        String sql = "DELETE FROM produtos WHERE id = ?";

        try (Connection conn = conexaoDB.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}
