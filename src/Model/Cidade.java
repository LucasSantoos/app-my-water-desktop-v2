
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
@Table(name = "CIDADES")
public class Cidade implements Serializable{
     
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    @SwingColumn(description = "Código")
    private int id;

    @Column(name = "NOME", nullable = false, length = 100)
    @SwingColumn(description = "Nome")
    private String nome;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @SwingColumn(description = "Estado")
    @JoinColumn(name = "ID_ESTADO", nullable = false,referencedColumnName = "id")
    private Estado estado;

    public Cidade() {
    }
    
    public Cidade(int id, String nome, Estado estado) {
        setNome(nome);
        setId(id);
        setEstado(estado);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }
    
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Estado getEstado() {
        return this.estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.id;
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
        final Cidade other = (Cidade) obj;
        return true;
    }
    
    @Override
    public String toString() {
        return this.nome;
    }
}
