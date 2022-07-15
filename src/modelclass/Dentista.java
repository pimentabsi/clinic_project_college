package modelclass;

public class Dentista {
    private String nome;
    private String email;
    private String cro;

    public Dentista(String nome, String email, String cro){
        this.nome = nome;
        this.email = email;
        this.cro = cro;
    }

    public String toString() {
        return getDescricao();
    }

    public String getDescricao() {
        return "Dr(a) " + this.nome + " - CRO: " + this.cro + " -Email: " + this.email;
    }

}