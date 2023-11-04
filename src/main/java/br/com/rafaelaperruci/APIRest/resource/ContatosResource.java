/* 
package br.com.rafaelaperruci.APIRest.resource;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rafaelaperruci.APIRest.model.Contatos;
import br.com.rafaelaperruci.APIRest.model.Pessoa;
import br.com.rafaelaperruci.APIRest.service.interfaces.ContatosService;
import br.com.rafaelaperruci.APIRest.service.interfaces.PessoaService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController 
@RequestMapping("/")
public class ContatosResource { 
    private ContatosService contatosService; 
    private PessoaService pessoaService; 

    @Autowired
    public ContatosResource(ContatosService contatosService){
        this.contatosService = contatosService;
    } 
    @PostMapping("/api/pessoas/{id}/contatos")
    public ResponseEntity<Contatos> save(@PathVariable Long id, @RequestBody Contatos novoContato) {
        Optional<Pessoa> pessoaOptional = pessoaService.getById(id);

        if (pessoaOptional.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        Pessoa pessoa = pessoaOptional.get(); 

        novoContato.setPessoa(pessoa); 
        Contatos contatoSalvo = contatosService.save(novoContato);

        return ResponseEntity.status(HttpStatus.CREATED).body(contatoSalvo);
    }
    
    
    @GetMapping("api/contatos/{id}")
    public ResponseEntity<Optional<Contatos>> getById(@PathVariable Long id) {
        Optional<Contatos> contato = contatosService.getById(id);
        if (contato == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(contato);
    }
    
    @PutMapping("api/contatos/{id}")
    public ResponseEntity<Contatos> update(@RequestBody Contatos contatos){
        Contatos newContato = contatosService.update(contatos);
        if (newContato == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(newContato);

    }

    @DeleteMapping("api/contatos/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        contatosService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
*/