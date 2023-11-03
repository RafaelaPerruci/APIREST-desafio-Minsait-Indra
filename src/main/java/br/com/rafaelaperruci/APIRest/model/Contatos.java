package br.com.rafaelaperruci.APIRest.model;

import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table (name = "contato")

public class Contatos {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;
    
    @Column (nullable = false)
    private int tipoContato;
    @Column (nullable = false)
    private String contato;
    
    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "pessoa_id", referencedColumnName = "id")
    private Pessoa pessoa;

    public Contatos(long id, int tipoContato, String contato, Pessoa pessoa) {
        this.id = id;
        this.tipoContato = tipoContato;
        this.contato = contato;
        this.pessoa = pessoa;
    }

    public Contatos(){
        
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getTipoContato() {
        return tipoContato;
    }

    public void setTipoContato(int tipoContato) {
        this.tipoContato = tipoContato;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contatos contatos)) return false;
        return getId() == contatos.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

}
