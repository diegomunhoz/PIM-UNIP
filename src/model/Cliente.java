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
@Table(name = "cliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
    @NamedQuery(name = "Cliente.findByIdCliente", query = "SELECT c FROM Cliente c WHERE c.idCliente = :idCliente"),
    @NamedQuery(name = "Cliente.findByNomeCliente", query = "SELECT c FROM Cliente c WHERE c.nomeCliente = :nomeCliente"),
    @NamedQuery(name = "Cliente.findByLogadouroCliente", query = "SELECT c FROM Cliente c WHERE c.logadouroCliente = :logadouroCliente"),
    @NamedQuery(name = "Cliente.findByNumLogadouroCliente", query = "SELECT c FROM Cliente c WHERE c.numLogadouroCliente = :numLogadouroCliente"),
    @NamedQuery(name = "Cliente.findByBairroCliente", query = "SELECT c FROM Cliente c WHERE c.bairroCliente = :bairroCliente"),
    @NamedQuery(name = "Cliente.findByCidadeCliente", query = "SELECT c FROM Cliente c WHERE c.cidadeCliente = :cidadeCliente"),
    @NamedQuery(name = "Cliente.findByEstadoCliente", query = "SELECT c FROM Cliente c WHERE c.estadoCliente = :estadoCliente"),
    @NamedQuery(name = "Cliente.findByCepCliente", query = "SELECT c FROM Cliente c WHERE c.cepCliente = :cepCliente"),
    @NamedQuery(name = "Cliente.findByTelefoneCliente", query = "SELECT c FROM Cliente c WHERE c.telefoneCliente = :telefoneCliente"),
    @NamedQuery(name = "Cliente.findByCelularCliente", query = "SELECT c FROM Cliente c WHERE c.celularCliente = :celularCliente"),
    @NamedQuery(name = "Cliente.findByCpfCliente", query = "SELECT c FROM Cliente c WHERE c.cpfCliente = :cpfCliente"),
    @NamedQuery(name = "Cliente.findByRgCliente", query = "SELECT c FROM Cliente c WHERE c.rgCliente = :rgCliente"),
    @NamedQuery(name = "Cliente.findByDataNascimentoCliente", query = "SELECT c FROM Cliente c WHERE c.dataNascimentoCliente = :dataNascimentoCliente")})
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cliente")
    private Integer idCliente;
    @Column(name = "nome_cliente")
    private String nomeCliente;
    @Column(name = "logadouro_cliente")
    private String logadouroCliente;
    @Column(name = "num_logadouro_cliente")
    private Integer numLogadouroCliente;
    @Column(name = "bairro_cliente")
    private String bairroCliente;
    @Column(name = "cidade_cliente")
    private String cidadeCliente;
    @Column(name = "estado_cliente")
    private String estadoCliente;
    @Column(name = "cep_cliente")
    private String cepCliente;
    @Column(name = "telefone_cliente")
    private String telefoneCliente;
    @Column(name = "celular_cliente")
    private String celularCliente;
    @Column(name = "cpf_cliente")
    private String cpfCliente;
    @Column(name = "rg_cliente")
    private String rgCliente;
    @Column(name = "data_nascimento_cliente")
    private String dataNascimentoCliente;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "clienteIdCliente")
    private Collection<Conta> contaCollection;

    public Cliente() {
    }

    public Cliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getLogadouroCliente() {
        return logadouroCliente;
    }

    public void setLogadouroCliente(String logadouroCliente) {
        this.logadouroCliente = logadouroCliente;
    }

    public Integer getNumLogadouroCliente() {
        return numLogadouroCliente;
    }

    public void setNumLogadouroCliente(Integer numLogadouroCliente) {
        this.numLogadouroCliente = numLogadouroCliente;
    }

    public String getBairroCliente() {
        return bairroCliente;
    }

    public void setBairroCliente(String bairroCliente) {
        this.bairroCliente = bairroCliente;
    }

    public String getCidadeCliente() {
        return cidadeCliente;
    }

    public void setCidadeCliente(String cidadeCliente) {
        this.cidadeCliente = cidadeCliente;
    }

    public String getEstadoCliente() {
        return estadoCliente;
    }

    public void setEstadoCliente(String estadoCliente) {
        this.estadoCliente = estadoCliente;
    }

    public String getCepCliente() {
        return cepCliente;
    }

    public void setCepCliente(String cepCliente) {
        this.cepCliente = cepCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    public String getCelularCliente() {
        return celularCliente;
    }

    public void setCelularCliente(String celularCliente) {
        this.celularCliente = celularCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getRgCliente() {
        return rgCliente;
    }

    public void setRgCliente(String rgCliente) {
        this.rgCliente = rgCliente;
    }

    public String getDataNascimentoCliente() {
        return dataNascimentoCliente;
    }

    public void setDataNascimentoCliente(String dataNascimentoCliente) {
        this.dataNascimentoCliente = dataNascimentoCliente;
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
        hash += (idCliente != null ? idCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.idCliente == null && other.idCliente != null) || (this.idCliente != null && !this.idCliente.equals(other.idCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Cliente[ idCliente=" + idCliente + " ]";
    }
    
}
