package modelclass;

public class Dentista {
    private String nome;
    private String email;
    private String cro;
    private String codigo;
    private static int contador=1;

    public Dentista(String nome, String email, String cro){
        this.nome = nome;
        this.email = email;
        this.cro = cro;
        this.codigo = "DE" + contador++;
    }

    public String toString() {
        return getDescricao();
    }

    public String getNome(){
        return this.nome;
    }

    public String getEmail(){
        return this.email;
    }

    public String getCro(){
        return this.cro;
    }

    public String getCodigo(){
        return this.codigo;
    }

    public String getDescricao() {
        return "Dr(a) " + this.nome + " - CRO: " + this.cro + " -Email: " + this.email;
    }
}