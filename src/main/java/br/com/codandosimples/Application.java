package br.com.codandosimples;

import br.com.codandosimples.dao.DespesaDAO;
import br.com.codandosimples.model.Categoria;
import br.com.codandosimples.model.Despesa;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {

        DespesaDAO dao = new DespesaDAO();
        List<Despesa> despesas = dao.findByCategoria(Categoria.MORADIA);
        System.out.println("***************************");
        for(Despesa despesa : despesas){
            System.out.println("ID: "+despesa.getId());
            System.out.println("Descrição: "+ despesa.getDescricao());
            System.out.println("Valor: R$"+despesa.getValor());
            System.out.println("Categoria: "+ despesa.getCategoria());
            System.out.println("***************************");
        }


//        DespesaDAO dao = new DespesaDAO();
//        Optional<Despesa> despesaOptional = dao.findById(1L);
//        despesaOptional.ifPresent(despesa -> {
//            System.out.println("ID: "+despesa.getId());
//            System.out.println("Descrição: "+ despesa.getDescricao());
//            System.out.println("Valor: R$"+despesa.getValor());
//            System.out.println("***************************");
//        });


//        List<Despesa> despesas = dao.findAll();
//        System.out.println("***************************");
//        for(Despesa despesa : despesas){
//            System.out.println("ID: "+despesa.getId());
//            System.out.println("Descrição: "+ despesa.getDescricao());
//            System.out.println("Valor: R$"+despesa.getValor());
//            System.out.println("***************************");
//        }
    }
}
