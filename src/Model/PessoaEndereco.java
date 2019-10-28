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
@Table(name = "pessoa_endereco")
public class PessoaEndereco implements Serializable{
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    @SwingColumn(description = "Código")
    private int id;
    
    @Column(name = "NOME", nullable = false, length = 100)
    @SwingColumn(description = "Nome")
    private String nome;
    
    @Column(name = "numero")
    private String numero;
    
    @Column(name = "bairro")
    private String bairro;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @SwingColumn(description = "Pessoa")
    @JoinColumn(name = "ID_PESSOA", nullable = false,referencedColumnName = "id")
    private Pessoa pessoa;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @SwingColumn(description = "Cidade")
    @JoinColumn(name = "ID_CIDADE", nullable = false,referencedColumnName = "id")
    private Cidade cidade;

    public PessoaEndereco() {
        super();
    }
    
    public PessoaEndereco(int id, String numero, String bairro, Pessoa pessoa, Cidade cidade) {
        this.id = id;
        this.numero = numero;
        this.bairro = bairro;
        setPessoa(pessoa);
        setCidade(cidade);
    }

    public PessoaEndereco(int id, String numero, String bairro, Pessoa pessoa, Cidade cidade, String nome) {
        setNome(nome);
        this.id = id;
        this.numero = numero;
        this.bairro = bairro;
        this.pessoa = pessoa;
        this.cidade = cidade;
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
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.id;
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
        final PessoaEndereco other = (PessoaEndereco) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }    
}
