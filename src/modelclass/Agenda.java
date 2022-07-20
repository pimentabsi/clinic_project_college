package modelclass;
import java.util.ArrayList;

public class Agenda {
    private ArrayList<Consulta> consulta;

    public Agenda(){
        this.consulta = new ArrayList<Consulta>();
    }

    public String toString() {
        return getDescricao();
    }

    public boolean addConsulta(Consulta consulta) {
        if(this.consulta.add(consulta)){
            return true;
        }else{
            return false;
        }
    }

    public boolean removeConsulta(Consulta consulta) {
        if(this.consulta.remove(consulta)){
            return true;
        }else{
            return false;
        }
    }

    public boolean verificaConsulta(Consulta consulta) {
        if(this.consulta.indexOf(consulta) < 0) {
            return false;
        }
        return true;
    }

    public double faturamento() {
        double totalSalario=0;
        double total=0;
        String nome = new String();
        for(int i=0;i<this.consulta.size();i++) {
            if(this.consulta.get(i).getDentista().getNome()!=nome) {
                totalSalario = this.consulta.get(i).getDentista().getSalario() + totalSalario;
                nome = this.consulta.get(i).getDentista().getNome();
            }
            total = total + this.consulta.get(i).valorConsulta();
        }
        return total - totalSalario;
    }
    public int qtdConsultas() {
        return this.consulta.size();
    }

    public ArrayList<Consulta> getAgenda(){
        return new ArrayList<Consulta>(this.consulta);
    }

    public String getDescricao() {
        String d1 = new String();
        for(int i=0; i<this.consulta.size();i++) {
            d1 = this.consulta.get(i) + "\n" + d1;
        }
        return "Lista de Consultas da Clinica: \n" + d1;
    }

}
