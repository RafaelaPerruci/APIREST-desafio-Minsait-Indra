package br.com.rafaelaperruci.APIRest.resource;

import br.com.rafaelaperruci.APIRest.model.Pessoa;
import br.com.rafaelaperruci.APIRest.model.PessoaMalaDireta;
import br.com.rafaelaperruci.APIRest.service.interfaces.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pessoa")
public class PessoaResource {
    private PessoaService pessoaService;

    @Autowired
    public PessoaResource(PessoaService pessoaService){
        this.pessoaService = pessoaService;
    }

    @GetMapping
    public ResponseEntity<List<Pessoa>> getAllPessoa() {
        List<Pessoa> pessoas = pessoaService.getAll();
        if (pessoas == null)
            return ResponseEntity.notFound().build();
        return  ResponseEntity.ok(pessoas);
    } 

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Pessoa>> getById(@PathVariable Long id){
        Optional<Pessoa> pessoa = pessoaService.getById(id);
        if (pessoa == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(pessoa);
    }

    @GetMapping("/maladireta/{id}")
    public ResponseEntity<PessoaMalaDireta> getPessoaMalaDireta(@PathVariable Long id) {
        Optional<Pessoa> pessoaOptional = pessoaService.getById(id);

        if (pessoaOptional.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        Pessoa pessoa = pessoaOptional.get();
        String malaDireta = pessoa.getEndereco() + " - CEP: " + pessoa.getCep() + " - " + pessoa.getCidade() + "/" + pessoa.getUf();

        PessoaMalaDireta pessoaMalaDireta = new PessoaMalaDireta(pessoa.getId(), pessoa.getNome(), malaDireta);

        return ResponseEntity.ok(pessoaMalaDireta);
    }


    @PostMapping
    public ResponseEntity<Pessoa> save(@RequestBody Pessoa pessoa){
        Pessoa newPessoa = pessoaService.savePessoa(pessoa);
        if (newPessoa == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(newPessoa);
        
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pessoa> update(@RequestBody Pessoa pessoa){
        Pessoa newPessoa = pessoaService.update(pessoa);
        if (newPessoa == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(newPessoa);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        pessoaService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
