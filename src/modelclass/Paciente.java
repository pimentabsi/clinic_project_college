package modelclass;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Paciente {
    private String nome;
    private String email;
    private LocalDate dataDeNascimento;
    private static DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Paciente(String nome, String email, LocalDate dataDeNascimento){
        this.nome = nome;
        this.email = email;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String toString() {
        return getDescricao();
    }

    public String getDescricao() {
        return "Sr(a) " + this.nome + " -Data de Nascimento: " + dataDeNascimento.format(formatador) +  " -Email: " + this.email;
    }

}