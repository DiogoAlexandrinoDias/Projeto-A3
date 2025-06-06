package model;

public class produto {
    private int id ;
    private String nome ;
    private int quantidade ;

    public produto (String nome, int quantidade){
        this.nome = nome;
        this.quantidade = quantidade;
    }
    public produto (int id,String nome, int quantidade ){
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public int getId() {return id;}
    public String getNome() {return nome;}
    public int getQuantidade() {return quantidade;}

    public void setNome(String nome) {this.nome = nome;}
    public void setQuantidade(int quantidade) {this.quantidade = quantidade;}

    @Override
    public String toString() {
        return "produto" + "id=" + id + ", nome='" + nome + '\'' + ", quantidade=" + quantidade + ";
    }
}
