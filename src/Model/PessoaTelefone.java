package Model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pessoa_telefone")
public class PessoaTelefone implements Serializable{
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    @SwingColumn(description = "Código")
    private int id;
    
    @Column(name = "NOME", nullable = false, length = 100)
    @SwingColumn(description = "Nome")
    private String nome;
    
    @Column(name = "nro_telefone", nullable = false)
    private String nroTelefone;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @SwingColumn(description = "Pessoa")
    @JoinColumn(name = "ID_PESSOA", nullable = false,referencedColumnName = "id")
    private Pessoa pessoa;

    public PessoaTelefone(){
        super();
    }
    
    public PessoaTelefone(int id, String nroTelefone, Pessoa pessoa) {
        this.id = id;
        this.nroTelefone = nroTelefone;
        this.pessoa = pessoa;
    }

    public PessoaTelefone(int id, String nome, String nroTelefone, Pessoa pessoa) {
        this.id = id;
        this.nroTelefone = nroTelefone;
        this.pessoa = pessoa;
        setNome(nome);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }
    
    public String getNroTelefone() {
        return nroTelefone;
    }

    public void setNroTelefone(String nroTelefone) {
        this.nroTelefone = nroTelefone;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PessoaTelefone other = (PessoaTelefone) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
}
