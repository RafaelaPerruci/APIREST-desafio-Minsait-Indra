package br.com.rafaelaperruci.APIRest.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository; 
import br.com.rafaelaperruci.APIRest.model.Pessoa;
import java.util.List;


@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long>{
    
    Pessoa savePessoa(Pessoa pessoa);
    Optional<Pessoa> getById(long id);
    List<Pessoa> getAll();
    Pessoa update(Pessoa pessoa);
    void delete(Long id);

}
