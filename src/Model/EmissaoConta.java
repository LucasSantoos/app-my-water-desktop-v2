package Model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "emissao_conta")
public class EmissaoConta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    @SwingColumn(description = "Código")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_cliente", referencedColumnName = "id")
    @SwingColumn(description = "Nome cliente")
    private Pessoa cliente;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_funcionario", referencedColumnName = "id")
    @SwingColumn(description = "Nome funcionario")
    private Pessoa funcionario;

    @Column(name = "vl_relogio_mes_passado", nullable = false)
    private BigDecimal vlRelogioMesPassado;

    @Column(name = "vl_relogio_mes_atual", nullable = false)
    private BigDecimal vlRelogioMesAtual;

    @Column(name = "dt_afericao", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dtAfericao;

    @Column(name = "vl_tarifa_mes", nullable = false)
    private BigDecimal vlTarifaMes;

    @Column(name = "vl_total")
    @SwingColumn(description = "Valor")
    private BigDecimal vlTotal;

    public EmissaoConta() {
    }

    public EmissaoConta(int id, Pessoa cliente, Pessoa funcionario, BigDecimal vlRelogioMesPassado, BigDecimal vlRelogioMesAtual, Date dtAfericao, BigDecimal vlTarifaMes, BigDecimal vlTotal) {
        this.id = id;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.vlRelogioMesPassado = vlRelogioMesPassado;
        this.vlRelogioMesAtual = vlRelogioMesAtual;
        this.dtAfericao = dtAfericao;
        this.vlTarifaMes = vlTarifaMes;
        this.vlTotal = vlTotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public Pessoa getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Pessoa funcionario) {
        this.funcionario = funcionario;
    }

    public BigDecimal getVlRelogioMesPassado() {
        return vlRelogioMesPassado;
    }

    public void setVlRelogioMesPassado(BigDecimal vlRelogioMesPassado) {
        this.vlRelogioMesPassado = vlRelogioMesPassado;
    }

    public BigDecimal getVlRelogioMesAtual() {
        return vlRelogioMesAtual;
    }

    public void setVlRelogioMesAtual(BigDecimal vlRelogioMesAtual) {
        this.vlRelogioMesAtual = vlRelogioMesAtual;
    }

    public Date getDtAfericao() {
        return dtAfericao;
    }

    public void setDtAfericao(Date dtAfericao) {
        this.dtAfericao = dtAfericao;
    }

    public BigDecimal getVlTarifaMes() {
        return vlTarifaMes;
    }

    public void setVlTarifaMes(BigDecimal vlTarifaMes) {
        this.vlTarifaMes = vlTarifaMes;
    }

    public BigDecimal getVlTotal() {
        return vlTotal;
    }

    public void setVlTotal(BigDecimal vlTotal) {
        this.vlTotal = vlTotal;
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final EmissaoConta other = (EmissaoConta) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.vlTotal.toString();
    }
}
