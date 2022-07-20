package modelclass;
import java.util.ArrayList;

public class Consulta {
    private Dentista dentista;
    private Paciente paciente;
    private ArrayList<Procedimento> procedimento;

    public Consulta(Dentista dentista, Paciente paciente){
        this.dentista = dentista;
        this.paciente = paciente;
        this.procedimento = new ArrayList<Procedimento>();
    }

    public String toString() {
        return getDescricao();
    }

    public boolean addProcedimento(Procedimento procedimento) {
        this.dentista.calculaSalario(procedimento.getPreco());
        if(this.procedimento.add(procedimento)) {
            return true;
        }else{
            return false;
        }
    }

    public boolean removeProcedimento(Procedimento procedimento) {
        if(this.procedimento.remove(procedimento)){
            return true;
        }else{
            return false;
        }
    }

    public boolean verificaProcedimento(Procedimento procedimento) {
        if(this.procedimento.indexOf(procedimento) < 0) {
            return false;
        }
        return true;
    }

    public Paciente getPaciente() {
        return new Paciente(this.paciente);
    }

    public Dentista getDentista() {
        return this.dentista.getObjectDentista();
    }

    public double valorConsulta() {
        double total=0;
        for(int i=0; i<this.procedimento.size();i++) {
            total = total + this.procedimento.get(i).getPreco();
        }
        return total;
    }

    public String getDescricao() {
        String consultas = new String();
        for(int i=0;i<this.procedimento.size();i++) {
            consultas = this.procedimento.get(i).getNome() + ", " + consultas;
        }
        return consultas + "para o paciente: " + this.paciente.getNome() +
                " realizada pelo Dr(a): " + this.dentista.getNome();
    }

}
