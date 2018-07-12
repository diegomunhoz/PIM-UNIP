package model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "conta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Conta.findAll", query = "SELECT c FROM Conta c"),
    @NamedQuery(name = "Conta.findByIdConta", query = "SELECT c FROM Conta c WHERE c.idConta = :idConta"),
    @NamedQuery(name = "Conta.findByDataAberturaConta", query = "SELECT c FROM Conta c WHERE c.dataAberturaConta = :dataAberturaConta"),
    @NamedQuery(name = "Conta.findBySaldoTotalConta", query = "SELECT c FROM Conta c WHERE c.saldoTotalConta = :saldoTotalConta"),
    @NamedQuery(name = "Conta.findBySenha", query = "SELECT c FROM Conta c WHERE c.senha = :senha")})
public class Conta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_conta")
    private Integer idConta;
    @Column(name = "data_abertura_conta")
    private String dataAberturaConta;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "saldo_total_conta")
    private Double saldoTotalConta;
    @Column(name = "senha")
    private Integer senha;
    @JoinColumn(name = "cliente_id_cliente", referencedColumnName = "id_cliente")
    @ManyToOne(optional = false)
    private Cliente clienteIdCliente;
    @JoinColumn(name = "agencia_id_agencia", referencedColumnName = "id_agencia")
    @ManyToOne(optional = false)
    private Agencia agenciaIdAgencia;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contaIdConta")
    private Collection<Movimento> movimentoCollection;

    public Conta() {
    }

    public Conta(Integer idConta) {
        this.idConta = idConta;
    }

    public Integer getIdConta() {
        return idConta;
    }

    public void setIdConta(Integer idConta) {
        this.idConta = idConta;
    }

    public String getDataAberturaConta() {
        return dataAberturaConta;
    }

    public void setDataAberturaConta(String dataAberturaConta) {
        this.dataAberturaConta = dataAberturaConta;
    }

    public Double getSaldoTotalConta() {
        return saldoTotalConta;
    }

    public void setSaldoTotalConta(Double saldoTotalConta) {
        this.saldoTotalConta = saldoTotalConta;
    }

    public Integer getSenha() {
        return senha;
    }

    public void setSenha(Integer senha) {
        this.senha = senha;
    }

    public Cliente getClienteIdCliente() {
        return clienteIdCliente;
    }

    public void setClienteIdCliente(Cliente clienteIdCliente) {
        this.clienteIdCliente = clienteIdCliente;
    }

    public Agencia getAgenciaIdAgencia() {
        return agenciaIdAgencia;
    }

    public void setAgenciaIdAgencia(Agencia agenciaIdAgencia) {
        this.agenciaIdAgencia = agenciaIdAgencia;
    }

    @XmlTransient
    public Collection<Movimento> getMovimentoCollection() {
        return movimentoCollection;
    }

    public void setMovimentoCollection(Collection<Movimento> movimentoCollection) {
        this.movimentoCollection = movimentoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idConta != null ? idConta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Conta)) {
            return false;
        }
        Conta other = (Conta) object;
        if ((this.idConta == null && other.idConta != null) || (this.idConta != null && !this.idConta.equals(other.idConta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Conta[ idConta=" + idConta + " ]";
    }
    
}
