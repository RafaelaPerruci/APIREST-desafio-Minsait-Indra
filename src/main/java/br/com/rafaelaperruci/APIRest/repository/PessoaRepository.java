package br.com.rafaelaperruci.APIRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository; 
import br.com.rafaelaperruci.APIRest.model.Pessoa;



@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long>{
    

}
