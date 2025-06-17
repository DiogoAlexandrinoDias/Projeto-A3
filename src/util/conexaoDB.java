package util; // Define o pacote onde a classe está localizada

import java.sql.Connection; // Importa a classe `Connection` para gerenciar a conexão
import java.sql.DriverManager; // Importa `DriverManager` para abrir a conexão com MySQL
import java.sql.SQLException; // Importa `SQLException` para tratar erros de conexão

/**
 * Classe `conexaoDB` que gerencia a conexão com o banco MySQL.
 */
public class conexaoDB {
    private static final String URL = "jdbc:mysql://localhost:3306/estoque"; // URL do banco
    private static final String USER = "root"; // Usuário do banco de dados
    private static final String PASSWORD = "vuscyh-5mYnwo-jifvug"; // Senha do banco de dados

    /**
     * Método para estabelecer conexão com o banco de dados.
     * @return Conexão ativa com MySQL.
     * @throws SQLException Caso ocorra erro ao conectar.
     */
    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
