package br.com.rafaelaperruci.APIRest.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rafaelaperruci.APIRest.model.Contatos;
import java.util.List;
 


public interface ContatosRepository extends JpaRepository<Contatos, Long>{
    Contatos save(Contatos contatos); 
    Optional<Contatos> getById(long id); 
    List<Contatos> getAll(); 
    Contatos update (Contatos contatos);
    void delete(Long id);
}
