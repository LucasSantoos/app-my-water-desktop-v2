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
@Table(name = "estados")
public class Estado implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    @SwingColumn(description = "Código")
    private int id;

    @Column(name = "NOME", nullable = false, length = 100)
    @SwingColumn(description = "Nome")
    private String nome;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @SwingColumn(description = "Pais")
    @JoinColumn(name = "ID_PAIS", nullable = false,referencedColumnName = "id")
    private Pais pais;

    public Estado(){
    }
    
    public Estado(int id, String nome, Pais pais) {
        this.id = id;
        setNome(nome);
        setPais(pais);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }
    
    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Pais getPais() {
        return this.pais;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + this.id;
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
        final Estado other = (Estado) obj;
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
