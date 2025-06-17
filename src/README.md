# 📊 CRUD Java com MySQL - Gestão de Produtos

> Trabalho A3 desenvolvido para a disciplina **Programação de soluções computacionais**  

## 👥 Integrantes

g → Backend/Database

[Nome 2] → CRUD Operations

[Nome 3] → UI/Menu System

## 📖 Sobre o Projeto
Sistema CRUD (Create, Read, Update, Delete) em Java integrado ao MySQL para gestão de produtos. Desenvolvido como parte da Avaliação A3, aplicando conceitos de:
- Programação Orientada a Objetos (POO)
- Conexão JDBC com bancos de dados relacionais
- Operações básicas de persistência de dados

## ⚙️ Funcionalidades
| Operação | Descrição |
|----------|-----------|
| ✅ **Adicionar Produto** | Cadastra novos produtos no banco de dados |
| ✅ **Listar Produtos** | Exibe todos os produtos cadastrados |
| 🔍 **Buscar por ID** | Localiza produto pelo identificador único |
| ✏️ **Atualizar Produto** | Modifica dados de produtos existentes |
| ❌ **Deletar Produto** | Remove produtos do sistema |

## 🛠️ Tecnologias Utilizadas
- **Java** - Linguagem principal
- **JDBC** - Conexão Java/MySQL
- **MySQL** - Banco de dados relacional


## 📂 Estrutura do Projeto
```plaintext
📦 A3 
┣ 📂 src
┃ ┣ 📂 dao        → ProdutoDAO.java (operações CRUD)
┃ ┣ 📂 model      → Produto.java (entidade do sistema)
┃ ┣ 📂 util       → ConexaoDB.java (gerenciador de conexões)
┃ ┗ 📂 main       → Main.java (menu interativo)