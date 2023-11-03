package br.com.rafaelaperruci.APIRest.service.interfaces;

import br.com.rafaelaperruci.APIRest.model.Pessoa;
import br.com.rafaelaperruci.APIRest.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService implements PessoaServiceInterface{

    private PessoaRepository pessoaRepository;

    @Autowired
    public PessoaService(PessoaRepository pessoaRepository){
        this.pessoaRepository = pessoaRepository;
    }

    @Override
    public Pessoa savePessoa(Pessoa pessoa) {
        return null;
    }

    @Override
    public Optional<Pessoa> getById(long id) {
        return Optional.empty();
    }

    @Override
    public List<Pessoa> getAll() {
        return null;
    }

    @Override
    public Pessoa update(Pessoa pessoa) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
