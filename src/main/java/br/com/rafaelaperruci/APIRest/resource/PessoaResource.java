package br.com.rafaelaperruci.APIRest.resource;

import br.com.rafaelaperruci.APIRest.model.Pessoa;
import br.com.rafaelaperruci.APIRest.service.interfaces.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
        List<Pessoa> pessoa = pessoaService.getAll();
        if (pessoa == null)
            return ResponseEntity.notFound().build();
        return  ResponseEntity.ok(pessoa);
    }
}
