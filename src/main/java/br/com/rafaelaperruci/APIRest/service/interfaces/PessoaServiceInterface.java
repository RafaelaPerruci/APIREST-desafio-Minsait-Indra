package br.com.rafaelaperruci.APIRest.service.interfaces;

import java.util.List;
import java.util.Optional;

import br.com.rafaelaperruci.APIRest.model.Pessoa;

public interface PessoaServiceInterface {
    Pessoa savePessoa(Pessoa pessoa);
    Optional<Pessoa> getById(long id);
    List<Pessoa> getAll();
    Pessoa update(Pessoa pessoa);
    void delete(Long id);
}
