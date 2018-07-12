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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "banco")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Banco.findAll", query = "SELECT b FROM Banco b"),
    @NamedQuery(name = "Banco.findByIdBanco", query = "SELECT b FROM Banco b WHERE b.idBanco = :idBanco"),
    @NamedQuery(name = "Banco.findByRazaoSocialBanco", query = "SELECT b FROM Banco b WHERE b.razaoSocialBanco = :razaoSocialBanco"),
    @NamedQuery(name = "Banco.findByNomeFantasiaBanco", query = "SELECT b FROM Banco b WHERE b.nomeFantasiaBanco = :nomeFantasiaBanco"),
    @NamedQuery(name = "Banco.findByLogadouroBanco", query = "SELECT b FROM Banco b WHERE b.logadouroBanco = :logadouroBanco"),
    @NamedQuery(name = "Banco.findByNumLogadouroBanco", query = "SELECT b FROM Banco b WHERE b.numLogadouroBanco = :numLogadouroBanco"),
    @NamedQuery(name = "Banco.findByBairroBanco", query = "SELECT b FROM Banco b WHERE b.bairroBanco = :bairroBanco"),
    @NamedQuery(name = "Banco.findByCidadeBanco", query = "SELECT b FROM Banco b WHERE b.cidadeBanco = :cidadeBanco"),
    @NamedQuery(name = "Banco.findByEstadoBanco", query = "SELECT b FROM Banco b WHERE b.estadoBanco = :estadoBanco"),
    @NamedQuery(name = "Banco.findByCepBanco", query = "SELECT b FROM Banco b WHERE b.cepBanco = :cepBanco"),
    @NamedQuery(name = "Banco.findByCpnjBanco", query = "SELECT b FROM Banco b WHERE b.cpnjBanco = :cpnjBanco"),
    @NamedQuery(name = "Banco.findByInscricaoEstadualBanco", query = "SELECT b FROM Banco b WHERE b.inscricaoEstadualBanco = :inscricaoEstadualBanco"),
    @NamedQuery(name = "Banco.findByTelefoneBanco", query = "SELECT b FROM Banco b WHERE b.telefoneBanco = :telefoneBanco")})
public class Banco implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_banco")
    private Integer idBanco;
    @Column(name = "razao_social_banco")
    private String razaoSocialBanco;
    @Column(name = "nome_fantasia_banco")
    private String nomeFantasiaBanco;
    @Column(name = "logadouro_banco")
    private String logadouroBanco;
    @Column(name = "num_logadouro_banco")
    private String numLogadouroBanco;
    @Column(name = "bairro_banco")
    private String bairroBanco;
    @Column(name = "cidade_banco")
    private String cidadeBanco;
    @Column(name = "estado_banco")
    private String estadoBanco;
    @Column(name = "cep_banco")
    private String cepBanco;
    @Column(name = "cpnj_banco")
    private String cpnjBanco;
    @Column(name = "inscricao_estadual_banco")
    private String inscricaoEstadualBanco;
    @Column(name = "telefone_banco")
    private String telefoneBanco;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bancoIdBanco")
    private Collection<Agencia> agenciaCollection;

    public Banco() {
    }

    public Banco(Integer idBanco) {
        this.idBanco = idBanco;
    }

    public Integer getIdBanco() {
        return idBanco;
    }

    public void setIdBanco(Integer idBanco) {
        this.idBanco = idBanco;
    }

    public String getRazaoSocialBanco() {
        return razaoSocialBanco;
    }

    public void setRazaoSocialBanco(String razaoSocialBanco) {
        this.razaoSocialBanco = razaoSocialBanco;
    }

    public String getNomeFantasiaBanco() {
        return nomeFantasiaBanco;
    }

    public void setNomeFantasiaBanco(String nomeFantasiaBanco) {
        this.nomeFantasiaBanco = nomeFantasiaBanco;
    }

    public String getLogadouroBanco() {
        return logadouroBanco;
    }

    public void setLogadouroBanco(String logadouroBanco) {
        this.logadouroBanco = logadouroBanco;
    }

    public String getNumLogadouroBanco() {
        return numLogadouroBanco;
    }

    public void setNumLogadouroBanco(String numLogadouroBanco) {
        this.numLogadouroBanco = numLogadouroBanco;
    }

    public String getBairroBanco() {
        return bairroBanco;
    }

    public void setBairroBanco(String bairroBanco) {
        this.bairroBanco = bairroBanco;
    }

    public String getCidadeBanco() {
        return cidadeBanco;
    }

    public void setCidadeBanco(String cidadeBanco) {
        this.cidadeBanco = cidadeBanco;
    }

    public String getEstadoBanco() {
        return estadoBanco;
    }

    public void setEstadoBanco(String estadoBanco) {
        this.estadoBanco = estadoBanco;
    }

    public String getCepBanco() {
        return cepBanco;
    }

    public void setCepBanco(String cepBanco) {
        this.cepBanco = cepBanco;
    }

    public String getCpnjBanco() {
        return cpnjBanco;
    }

    public void setCpnjBanco(String cpnjBanco) {
        this.cpnjBanco = cpnjBanco;
    }

    public String getInscricaoEstadualBanco() {
        return inscricaoEstadualBanco;
    }

    public void setInscricaoEstadualBanco(String inscricaoEstadualBanco) {
        this.inscricaoEstadualBanco = inscricaoEstadualBanco;
    }

    public String getTelefoneBanco() {
        return telefoneBanco;
    }

    public void setTelefoneBanco(String telefoneBanco) {
        this.telefoneBanco = telefoneBanco;
    }

    @XmlTransient
    public Collection<Agencia> getAgenciaCollection() {
        return agenciaCollection;
    }

    public void setAgenciaCollection(Collection<Agencia> agenciaCollection) {
        this.agenciaCollection = agenciaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBanco != null ? idBanco.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Banco)) {
            return false;
        }
        Banco other = (Banco) object;
        if ((this.idBanco == null && other.idBanco != null) || (this.idBanco != null && !this.idBanco.equals(other.idBanco))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Banco[ idBanco=" + idBanco + " ]";
    }
    
}
