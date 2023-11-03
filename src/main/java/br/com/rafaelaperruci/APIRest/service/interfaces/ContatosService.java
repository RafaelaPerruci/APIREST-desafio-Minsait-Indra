package br.com.rafaelaperruci.APIRest.service.interfaces;

import br.com.rafaelaperruci.APIRest.model.Contatos;
import br.com.rafaelaperruci.APIRest.repository.ContatosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContatosService implements ContatosServiceInterface{

    private ContatosRepository contatosRepository;

    @Autowired
    public ContatosService(ContatosRepository contatosRepository){
        this.contatosRepository = contatosRepository;
    }

    @Override
    public Contatos save(Contatos contatos) {
        return null;
    }

    @Override
    public Optional<Contatos> getById(long id) {
        return Optional.empty();
    }

    @Override
    public List<Contatos> getAll() {
        return null;
    }

    @Override
    public Contatos update(Contatos contatos) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
