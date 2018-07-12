package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "funcionario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Funcionario.findAll", query = "SELECT f FROM Funcionario f"),
    @NamedQuery(name = "Funcionario.findByIdFuncionario", query = "SELECT f FROM Funcionario f WHERE f.idFuncionario = :idFuncionario"),
    @NamedQuery(name = "Funcionario.findByNomeFuncionario", query = "SELECT f FROM Funcionario f WHERE f.nomeFuncionario = :nomeFuncionario"),
    @NamedQuery(name = "Funcionario.findByLogadouroFuncionario", query = "SELECT f FROM Funcionario f WHERE f.logadouroFuncionario = :logadouroFuncionario"),
    @NamedQuery(name = "Funcionario.findByNumLogadouro", query = "SELECT f FROM Funcionario f WHERE f.numLogadouro = :numLogadouro"),
    @NamedQuery(name = "Funcionario.findByBairroFuncionario", query = "SELECT f FROM Funcionario f WHERE f.bairroFuncionario = :bairroFuncionario"),
    @NamedQuery(name = "Funcionario.findByCidadeFuncionario", query = "SELECT f FROM Funcionario f WHERE f.cidadeFuncionario = :cidadeFuncionario"),
    @NamedQuery(name = "Funcionario.findByEstadoFuncionario", query = "SELECT f FROM Funcionario f WHERE f.estadoFuncionario = :estadoFuncionario"),
    @NamedQuery(name = "Funcionario.findByCepFuncionario", query = "SELECT f FROM Funcionario f WHERE f.cepFuncionario = :cepFuncionario"),
    @NamedQuery(name = "Funcionario.findByTelefoneFuncionario", query = "SELECT f FROM Funcionario f WHERE f.telefoneFuncionario = :telefoneFuncionario"),
    @NamedQuery(name = "Funcionario.findByCelularFuncionario", query = "SELECT f FROM Funcionario f WHERE f.celularFuncionario = :celularFuncionario"),
    @NamedQuery(name = "Funcionario.findByCpfFuncionario", query = "SELECT f FROM Funcionario f WHERE f.cpfFuncionario = :cpfFuncionario"),
    @NamedQuery(name = "Funcionario.findByRgFuncionario", query = "SELECT f FROM Funcionario f WHERE f.rgFuncionario = :rgFuncionario"),
    @NamedQuery(name = "Funcionario.findByLoginFuncionario", query = "SELECT f FROM Funcionario f WHERE f.loginFuncionario = :loginFuncionario"),
    @NamedQuery(name = "Funcionario.findBySenhaFuncionario", query = "SELECT f FROM Funcionario f WHERE f.senhaFuncionario = :senhaFuncionario")})
public class Funcionario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_funcionario")
    private Integer idFuncionario;
    @Column(name = "nome_funcionario")
    private String nomeFuncionario;
    @Column(name = "logadouro_funcionario")
    private String logadouroFuncionario;
    @Column(name = "num_logadouro")
    private Integer numLogadouro;
    @Column(name = "bairro_funcionario")
    private String bairroFuncionario;
    @Column(name = "cidade_funcionario")
    private String cidadeFuncionario;
    @Column(name = "estado_funcionario")
    private String estadoFuncionario;
    @Column(name = "cep_funcionario")
    private String cepFuncionario;
    @Column(name = "telefone_funcionario")
    private String telefoneFuncionario;
    @Column(name = "celular_funcionario")
    private String celularFuncionario;
    @Column(name = "cpf_funcionario")
    private String cpfFuncionario;
    @Column(name = "rg_funcionario")
    private String rgFuncionario;
    @Column(name = "login_funcionario")
    private String loginFuncionario;
    @Column(name = "senha_funcionario")
    private String senhaFuncionario;

    public Funcionario() {
    }

    public Funcionario(Integer idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public Integer getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Integer idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getLogadouroFuncionario() {
        return logadouroFuncionario;
    }

    public void setLogadouroFuncionario(String logadouroFuncionario) {
        this.logadouroFuncionario = logadouroFuncionario;
    }

    public Integer getNumLogadouro() {
        return numLogadouro;
    }

    public void setNumLogadouro(Integer numLogadouro) {
        this.numLogadouro = numLogadouro;
    }

    public String getBairroFuncionario() {
        return bairroFuncionario;
    }

    public void setBairroFuncionario(String bairroFuncionario) {
        this.bairroFuncionario = bairroFuncionario;
    }

    public String getCidadeFuncionario() {
        return cidadeFuncionario;
    }

    public void setCidadeFuncionario(String cidadeFuncionario) {
        this.cidadeFuncionario = cidadeFuncionario;
    }

    public String getEstadoFuncionario() {
        return estadoFuncionario;
    }

    public void setEstadoFuncionario(String estadoFuncionario) {
        this.estadoFuncionario = estadoFuncionario;
    }

    public String getCepFuncionario() {
        return cepFuncionario;
    }

    public void setCepFuncionario(String cepFuncionario) {
        this.cepFuncionario = cepFuncionario;
    }

    public String getTelefoneFuncionario() {
        return telefoneFuncionario;
    }

    public void setTelefoneFuncionario(String telefoneFuncionario) {
        this.telefoneFuncionario = telefoneFuncionario;
    }

    public String getCelularFuncionario() {
        return celularFuncionario;
    }

    public void setCelularFuncionario(String celularFuncionario) {
        this.celularFuncionario = celularFuncionario;
    }

    public String getCpfFuncionario() {
        return cpfFuncionario;
    }

    public void setCpfFuncionario(String cpfFuncionario) {
        this.cpfFuncionario = cpfFuncionario;
    }

    public String getRgFuncionario() {
        return rgFuncionario;
    }

    public void setRgFuncionario(String rgFuncionario) {
        this.rgFuncionario = rgFuncionario;
    }

    public String getLoginFuncionario() {
        return loginFuncionario;
    }

    public void setLoginFuncionario(String loginFuncionario) {
        this.loginFuncionario = loginFuncionario;
    }

    public String getSenhaFuncionario() {
        return senhaFuncionario;
    }

    public void setSenhaFuncionario(String senhaFuncionario) {
        this.senhaFuncionario = senhaFuncionario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFuncionario != null ? idFuncionario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Funcionario)) {
            return false;
        }
        Funcionario other = (Funcionario) object;
        if ((this.idFuncionario == null && other.idFuncionario != null) || (this.idFuncionario != null && !this.idFuncionario.equals(other.idFuncionario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Funcionario[ idFuncionario=" + idFuncionario + " ]";
    }
    
}
