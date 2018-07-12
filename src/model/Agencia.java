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
@Table(name = "agencia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Agencia.findAll", query = "SELECT a FROM Agencia a"),
    @NamedQuery(name = "Agencia.findByIdAgencia", query = "SELECT a FROM Agencia a WHERE a.idAgencia = :idAgencia"),
    @NamedQuery(name = "Agencia.findByRazaoSocialAgencia", query = "SELECT a FROM Agencia a WHERE a.razaoSocialAgencia = :razaoSocialAgencia"),
    @NamedQuery(name = "Agencia.findByNomeFantasiaAgencia", query = "SELECT a FROM Agencia a WHERE a.nomeFantasiaAgencia = :nomeFantasiaAgencia"),
    @NamedQuery(name = "Agencia.findByLogadouroAgencia", query = "SELECT a FROM Agencia a WHERE a.logadouroAgencia = :logadouroAgencia"),
    @NamedQuery(name = "Agencia.findByNumLogadouroAgencia", query = "SELECT a FROM Agencia a WHERE a.numLogadouroAgencia = :numLogadouroAgencia"),
    @NamedQuery(name = "Agencia.findByBairroAgencia", query = "SELECT a FROM Agencia a WHERE a.bairroAgencia = :bairroAgencia"),
    @NamedQuery(name = "Agencia.findByCidadeAgencia", query = "SELECT a FROM Agencia a WHERE a.cidadeAgencia = :cidadeAgencia"),
    @NamedQuery(name = "Agencia.findByEstadoAgencia", query = "SELECT a FROM Agencia a WHERE a.estadoAgencia = :estadoAgencia"),
    @NamedQuery(name = "Agencia.findByCepAgencia", query = "SELECT a FROM Agencia a WHERE a.cepAgencia = :cepAgencia"),
    @NamedQuery(name = "Agencia.findByCnpjAgencia", query = "SELECT a FROM Agencia a WHERE a.cnpjAgencia = :cnpjAgencia"),
    @NamedQuery(name = "Agencia.findByInscricaoEstadualAgencia", query = "SELECT a FROM Agencia a WHERE a.inscricaoEstadualAgencia = :inscricaoEstadualAgencia"),
    @NamedQuery(name = "Agencia.findByTelefoneAgencia", query = "SELECT a FROM Agencia a WHERE a.telefoneAgencia = :telefoneAgencia")})
public class Agencia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_agencia")
    private Integer idAgencia;
    @Column(name = "razao_social_agencia")
    private String razaoSocialAgencia;
    @Column(name = "nome_fantasia_agencia")
    private String nomeFantasiaAgencia;
    @Column(name = "logadouro_agencia")
    private String logadouroAgencia;
    @Column(name = "num_logadouro_agencia")
    private String numLogadouroAgencia;
    @Column(name = "bairro_agencia")
    private String bairroAgencia;
    @Column(name = "cidade_agencia")
    private String cidadeAgencia;
    @Column(name = "estado_agencia")
    private String estadoAgencia;
    @Column(name = "cep_agencia")
    private String cepAgencia;
    @Column(name = "cnpj_agencia")
    private String cnpjAgencia;
    @Column(name = "inscricao_estadual_agencia")
    private String inscricaoEstadualAgencia;
    @Column(name = "telefone_agencia")
    private String telefoneAgencia;
    @JoinColumn(name = "banco_id_banco", referencedColumnName = "id_banco")
    @ManyToOne(optional = false)
    private Banco bancoIdBanco;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "agenciaIdAgencia")
    private Collection<Conta> contaCollection;

    public Agencia() {
    }

    public Agencia(Integer idAgencia) {
        this.idAgencia = idAgencia;
    }

    public Integer getIdAgencia() {
        return idAgencia;
    }

    public void setIdAgencia(Integer idAgencia) {
        this.idAgencia = idAgencia;
    }

    public String getRazaoSocialAgencia() {
        return razaoSocialAgencia;
    }

    public void setRazaoSocialAgencia(String razaoSocialAgencia) {
        this.razaoSocialAgencia = razaoSocialAgencia;
    }

    public String getNomeFantasiaAgencia() {
        return nomeFantasiaAgencia;
    }

    public void setNomeFantasiaAgencia(String nomeFantasiaAgencia) {
        this.nomeFantasiaAgencia = nomeFantasiaAgencia;
    }

    public String getLogadouroAgencia() {
        return logadouroAgencia;
    }

    public void setLogadouroAgencia(String logadouroAgencia) {
        this.logadouroAgencia = logadouroAgencia;
    }

    public String getNumLogadouroAgencia() {
        return numLogadouroAgencia;
    }

    public void setNumLogadouroAgencia(String numLogadouroAgencia) {
        this.numLogadouroAgencia = numLogadouroAgencia;
    }

    public String getBairroAgencia() {
        return bairroAgencia;
    }

    public void setBairroAgencia(String bairroAgencia) {
        this.bairroAgencia = bairroAgencia;
    }

    public String getCidadeAgencia() {
        return cidadeAgencia;
    }

    public void setCidadeAgencia(String cidadeAgencia) {
        this.cidadeAgencia = cidadeAgencia;
    }

    public String getEstadoAgencia() {
        return estadoAgencia;
    }

    public void setEstadoAgencia(String estadoAgencia) {
        this.estadoAgencia = estadoAgencia;
    }

    public String getCepAgencia() {
        return cepAgencia;
    }

    public void setCepAgencia(String cepAgencia) {
        this.cepAgencia = cepAgencia;
    }

    public String getCnpjAgencia() {
        return cnpjAgencia;
    }

    public void setCnpjAgencia(String cnpjAgencia) {
        this.cnpjAgencia = cnpjAgencia;
    }

    public String getInscricaoEstadualAgencia() {
        return inscricaoEstadualAgencia;
    }

    public void setInscricaoEstadualAgencia(String inscricaoEstadualAgencia) {
        this.inscricaoEstadualAgencia = inscricaoEstadualAgencia;
    }

    public String getTelefoneAgencia() {
        return telefoneAgencia;
    }

    public void setTelefoneAgencia(String telefoneAgencia) {
        this.telefoneAgencia = telefoneAgencia;
    }

    public Banco getBancoIdBanco() {
        return bancoIdBanco;
    }

    public void setBancoIdBanco(Banco bancoIdBanco) {
        this.bancoIdBanco = bancoIdBanco;
    }

    @XmlTransient
    public Collection<Conta> getContaCollection() {
        return contaCollection;
    }

    public void setContaCollection(Collection<Conta> contaCollection) {
        this.contaCollection = contaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAgencia != null ? idAgencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Agencia)) {
            return false;
        }
        Agencia other = (Agencia) object;
        if ((this.idAgencia == null && other.idAgencia != null) || (this.idAgencia != null && !this.idAgencia.equals(other.idAgencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Agencia[ idAgencia=" + idAgencia + " ]";
    }
    
}
