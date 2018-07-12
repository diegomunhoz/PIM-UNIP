package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "movimento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Movimento.findAll", query = "SELECT m FROM Movimento m"),
    @NamedQuery(name = "Movimento.findByIdMovimento", query = "SELECT m FROM Movimento m WHERE m.idMovimento = :idMovimento"),
    @NamedQuery(name = "Movimento.findByHoraMovimento", query = "SELECT m FROM Movimento m WHERE m.horaMovimento = :horaMovimento"),
    @NamedQuery(name = "Movimento.findByDataMovimento", query = "SELECT m FROM Movimento m WHERE m.dataMovimento = :dataMovimento"),
    @NamedQuery(name = "Movimento.findByValorMovimento", query = "SELECT m FROM Movimento m WHERE m.valorMovimento = :valorMovimento"),
    @NamedQuery(name = "Movimento.findByDescricaoServico", query = "SELECT m FROM Movimento m WHERE m.descricaoServico = :descricaoServico")})
public class Movimento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_movimento")
    private Integer idMovimento;
    @Basic(optional = false)
    @Column(name = "hora_movimento")
    @Temporal(TemporalType.TIME)
    private Date horaMovimento;
    @Column(name = "data_movimento")
    @Temporal(TemporalType.DATE)
    private Date dataMovimento;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valor_movimento")
    private Double valorMovimento;
    @Column(name = "descricao_servico")
    private String descricaoServico;
    @JoinColumn(name = "conta_id_conta", referencedColumnName = "id_conta")
    @ManyToOne(optional = false)
    private Conta contaIdConta;

    public Movimento() {
    }

    public Movimento(Integer idMovimento) {
        this.idMovimento = idMovimento;
    }

    public Movimento(Integer idMovimento, Date horaMovimento) {
        this.idMovimento = idMovimento;
        this.horaMovimento = horaMovimento;
    }

    public Integer getIdMovimento() {
        return idMovimento;
    }

    public void setIdMovimento(Integer idMovimento) {
        this.idMovimento = idMovimento;
    }

    public Date getHoraMovimento() {
        return horaMovimento;
    }

    public void setHoraMovimento(Date horaMovimento) {
        this.horaMovimento = horaMovimento;
    }

    public Date getDataMovimento() {
        return dataMovimento;
    }

    public void setDataMovimento(Date dataMovimento) {
        this.dataMovimento = dataMovimento;
    }

    public Double getValorMovimento() {
        return valorMovimento;
    }

    public void setValorMovimento(Double valorMovimento) {
        this.valorMovimento = valorMovimento;
    }

    public String getDescricaoServico() {
        return descricaoServico;
    }

    public void setDescricaoServico(String descricaoServico) {
        this.descricaoServico = descricaoServico;
    }

    public Conta getContaIdConta() {
        return contaIdConta;
    }

    public void setContaIdConta(Conta contaIdConta) {
        this.contaIdConta = contaIdConta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMovimento != null ? idMovimento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movimento)) {
            return false;
        }
        Movimento other = (Movimento) object;
        if ((this.idMovimento == null && other.idMovimento != null) || (this.idMovimento != null && !this.idMovimento.equals(other.idMovimento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Movimento[ idMovimento=" + idMovimento + " ]";
    }
    
}
