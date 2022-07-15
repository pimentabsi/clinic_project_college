package modelclass;

public class Procedimento {
    String nome;
    double preco;
    private String codigo;
    private static int contador=1;


    public Procedimento(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
        this.codigo = "PO" + contador++;
    }

    public String toString() {
        return getDescricao();
    }

    public String getNome(){
        return this.nome;
    }

    public double getPreco(){
        return this.preco;
    }

    public String getCodigo(){
        return this.codigo;
    }

    public String getDescricao() {
        return this.nome + " - Custo: " + this.preco;
    }

}
