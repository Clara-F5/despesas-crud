package br.com.codandosimples;

import br.com.codandosimples.dao.DespesaDAO;
import br.com.codandosimples.model.Categoria;
import br.com.codandosimples.model.Despesa;

import java.time.LocalDate;

public class InserindoDespesas {
    public static void main(String[] args) {

        DespesaDAO dao = new DespesaDAO();

        Despesa despesa = new Despesa();
        despesa.setDescricao("Compras no Mercado");
        despesa.setCategoria(Categoria.ALIMENTACAO);
        despesa.setValor(87.5);
        despesa.setData(LocalDate.of(2023, 8, 10));

        dao.save(despesa);
    }
}
