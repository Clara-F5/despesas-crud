package br.com.codandosimples.dao;

import br.com.codandosimples.model.Despesa;
import br.com.codandosimples.model.Categoria;

import java.util.List;
import java.util.Optional;

public interface IDespesaDAO {

    Despesa save (Despesa despesa);
    Despesa update(Despesa despesa);
    void delete(Long id);
    List<Despesa> findAll();
    Optional<Despesa>findById(Long id);
    List<Despesa> findByCategoria(Categoria categoria);

    List<Despesa> findByValor(double valor);

}
