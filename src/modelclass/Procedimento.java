package modelclass;

public class Procedimento {
    String nome;
    double preco;


    public Procedimento(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String toString() {
        return getDescricao();
    }

    public String getDescricao() {
        return this.nome + " - Custo: " + this.preco;
    }

}
