package br.com.rafaelaperruci.APIRest.service.interfaces;

import br.com.rafaelaperruci.APIRest.model.Contatos;
import br.com.rafaelaperruci.APIRest.model.Pessoa;
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
        return contatosRepository.save(contatos);
    }

    @Override
    public Optional<Contatos> getById(long id) {
        return contatosRepository.findById(id);
    }

    @Override
    public List<Contatos> getAll() {
        return contatosRepository.findAll(); 
        
    }
   
    @Override
    public Contatos update(Contatos contatos) {
        Optional<Contatos> upContatos = contatosRepository.findById(contatos.getId());

        if(upContatos.isPresent()){
            Contatos newContato = upContatos.get();
            newContato.setContato(contatos.getContato());
            newContato.setTipoContato(contatos.getTipoContato());
            newContato.setPessoa(contatos.getPessoa());
            return contatosRepository.save(newContato);
        }
        return contatos;
    }

    @Override
    public void delete(Long id) {
        contatosRepository.deleteById(id);

    }
}
