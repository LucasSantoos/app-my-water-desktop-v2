package Model;

import Enums.TipoPessoa;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "pessoa")
public class Pessoa implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    @SwingColumn(description = "Código")
    private int id;

    @Column(name = "NOME", nullable = false, length = 100)
    @SwingColumn(description = "Nome")
    private String nome;
       
    @Column(name = "cpf", nullable = false)
    private String cpf;

    @Column(name = "dt_nasc", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dtNasc;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_pessoa", length = 12, nullable = false)
    @SwingColumn(description = "Tipo pessoa")
    private TipoPessoa tipoPessoa;

    public Pessoa() {
        super();
    }
    
    public Pessoa(int id, String cpf, Date dtNasc, TipoPessoa tipoPessoa) {
        this.id = id;
        this.cpf = cpf;
        this.dtNasc = dtNasc;
        this.tipoPessoa = tipoPessoa;
    }

    public Pessoa(int id, String cpf, Date dtNasc,  String nome, TipoPessoa tipoPessoa) {
        setNome(nome);
        this.id = id;
        this.cpf = cpf;
        this.dtNasc = dtNasc;
        this.tipoPessoa = tipoPessoa;
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
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(Date dtNasc) {
        this.dtNasc = dtNasc;
    }

    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.id;
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
        final Pessoa other = (Pessoa) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }   
    
    @Override
    public String toString() {
        return this.nome;
    }
}
