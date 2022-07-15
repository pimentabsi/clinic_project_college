package modeltest;

import java.time.LocalDate;

import modelclass.*;

public class Principal {

    public static void main(String[] args) {
        Dentista d1 = new Dentista("Rafael da Silva",
                "rfsilva@email.com",
                "1111");
        Dentista d2 = new Dentista("Lucas da Silva",
                "lcsilva@email.com",
                "1112");
        Paciente p1 = new Paciente("Jose da Silva",
                "jssilva@email.com",
                LocalDate.of(2001, 04, 14));
        Paciente p2 = new Paciente("Antonio da Silva",
                "antoniosilva@email.com",
                LocalDate.of(2001, 04, 13));
        Procedimento x1 = new Procedimento("Tratamento de Canal", 499);
        Procedimento x2 = new Procedimento("Tratamento de Carie", 799);
        Consulta c1 = new Consulta(d1,p1,x1);
        Consulta c2 = new Consulta(d2,p2,x2);
        Agenda a1 = new Agenda();
        a1.addConsulta(c1);
        a1.addConsulta(c2);

        System.out.println("Teste da Parte 1");

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(x1);
        System.out.println(x2);

        System.out.println("\n Teste da Parte 2");
        System.out.println("O valor da consulta foi de: " + c1.valorConsulta());
        System.out.println("O faturamento foi de: " + a1.calculaFaturamento());
        System.out.println("A quantidade de consultas foi de: " + a1.qtdConsultas());
        System.out.println("Dentista código: " + d1.getCodigo());
        System.out.println("Paciente código: " + p1.getCodigo());
        System.out.println("Procedimento código: " + x1.getCodigo());

        System.out.println("\n Teste da Parte 3");
        if(a1.verificaConsulta(c2)){
            System.out.println("Consulta Encontrada");
        }else{
            System.out.println("Consulta Não Encontrada");
        }
        a1.removeConsulta(c2);
        if(a1.verificaConsulta(c2)){
            System.out.println("Consulta Encontrada");
        }else{
            System.out.println("Consulta Não Encontrada");
        }
    }
}
