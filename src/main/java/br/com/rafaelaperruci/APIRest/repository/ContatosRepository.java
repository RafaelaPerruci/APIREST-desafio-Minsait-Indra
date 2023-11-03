package br.com.rafaelaperruci.APIRest.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rafaelaperruci.APIRest.model.Contatos;

public interface ContatosRepository extends JpaRepository<Contatos, Long>{
    
}
