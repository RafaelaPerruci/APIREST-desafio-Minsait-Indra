package br.com.rafaelaperruci.APIRest.resource;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rafaelaperruci.APIRest.model.Pessoa;
import br.com.rafaelaperruci.APIRest.service.interfaces.ContatosService; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController 
@RequestMapping("/api/contatos")
public class ContatosResource { 
    private ContatosService contatosService; 

    @Autowired
    public ContatosResource(ContatosService contatosService){
        this.contatosService = contatosService;
    } 

}