package br.com.codandosimples;

import br.com.codandosimples.dao.DespesaDAO;

public class DeletandoDespesas {
    public static void main(String[] args) {

    DespesaDAO dao = new DespesaDAO();
    dao.delete(25L);

        System.out.println("Id deletado");

    }
}
