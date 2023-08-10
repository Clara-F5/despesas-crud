package br.com.codandosimples;

import br.com.codandosimples.dao.DespesaDAO;
import br.com.codandosimples.model.Categoria;
import br.com.codandosimples.model.Despesa;

import java.time.LocalDate;
import java.util.Optional;

public class AtualizandoDespesas {
    public static void main(String[] args) {

        DespesaDAO dao = new DespesaDAO();
        Optional<Despesa> despesaOptional = dao.findById(1L);

        Despesa despesa = despesaOptional.get();
        System.out.println(despesa.getId());
        System.out.println(despesa.getDescricao());
        System.out.println(despesa.getCategoria());
        System.out.println(despesa.getData());
        System.out.println(despesa.getValor());

//        despesa.setDescricao("Pagamento de casa");
//        despesa.setCategoria(Categoria.OUTROS);
//        despesa.setValor(1200.0);
//        despesa.setData(LocalDate.of(2023, 9, 8 ));
//
//        dao.update(despesa);


    }
}
