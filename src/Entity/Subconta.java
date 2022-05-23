package Entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@NamedQueries({
    @NamedQuery( name = "Subconta.findAll", query= "SELECT sub FROM  Subconta sub"), 
    @NamedQuery( name = "Subconta.findById", query= "SELECT sub FROM Subconta sub WHERE sub.id = :codigo")        
})

@Entity
public class Subconta implements Serializable {

    private static final Long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @Column(name = "nomeCliente")
    private String nomeCliente;
    
    @Column(name = "preco")
    private double preco;
    
    @Column(name = "total")
    private double total;
    
    @ManyToOne
    @JoinColumn(name = "mesa_id")
    private Mesa numeroMesa;
    
    @ManyToOne
    @JoinColumn(name = "MinhaConta_id")
    private MinhaConta conta;
    
    @ManyToOne
    @JoinColumn(name = "FormaPagamento_id")
    private FormaPagamento formaPagamento;

    public Subconta() {
    }

    public Subconta(int id, String nomeCliente, double preco, double total, Mesa numeroMesa, MinhaConta conta, FormaPagamento formaPagamento) {
        this.id = id;
        this.nomeCliente = nomeCliente;
        this.preco = preco;
        this.total = total;
        this.numeroMesa = numeroMesa;
        this.conta = conta;
        this.formaPagamento = formaPagamento;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nomeCliente;
    }

    public void setNome(String nome) {
        this.nomeCliente = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Mesa getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(Mesa numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public MinhaConta getConta() {
        return conta;
    }

    public void setConta(MinhaConta conta) {
        this.conta = conta;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Subconta)) {
            return false;
        }
        Subconta other = (Subconta) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Subconta[ id=" + id + " ]";
    }
    
}
