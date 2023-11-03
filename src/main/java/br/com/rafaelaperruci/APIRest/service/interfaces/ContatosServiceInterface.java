package br.com.rafaelaperruci.APIRest.service.interfaces;

import java.util.List;
import java.util.Optional;

import br.com.rafaelaperruci.APIRest.model.Contatos;

public interface ContatosServiceInterface { 
    Contatos save(Contatos contatos); 
    Optional<Contatos> getById(long id); 
    List<Contatos> getAll(); 
    Contatos update (Contatos contatos);
    void delete(Long id);
}
