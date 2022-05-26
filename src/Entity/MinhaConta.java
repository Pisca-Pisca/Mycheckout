package Entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@NamedQueries({
    @NamedQuery( name = "MinhaConta.findAll", query= "SELECT sub FROM  MinhaConta sub"), 
    @NamedQuery( name = "MinhaConta.findById", query= "SELECT sub FROM MinhaConta sub WHERE sub.id = :codigo")        
})

@Entity
public class MinhaConta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "preco")
    private double preco;
    
    @Column(name = "total")
    private double total;
    
    @ManyToOne
    @JoinColumn(name = "mesa_id")
    private Mesa numeroMesa;

    @OneToMany(mappedBy = "conta", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Subconta> subconta;
    
    @ManyToMany(mappedBy = "minhaConta")
    private List<Produto> produtoList;

    public MinhaConta() {
    }

    public MinhaConta(int id, double preco, double total, Mesa numeroMesa) {
        this.id = id;
        this.preco = preco;
        this.total = total;
        this.numeroMesa = numeroMesa;
    }
        
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public List<Subconta> getSubconta() {
        return subconta;
    }

    public void setSubconta(List<Subconta> subconta) {
        this.subconta = subconta;
    }
        
    public List<Produto> getProdutoList() {
        return produtoList;
    }

    public void setProdutoList(List<Produto> produtoList) {
        this.produtoList = produtoList;
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
        if (!(object instanceof MinhaConta)) {
            return false;
        }
        MinhaConta other = (MinhaConta) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.MinhaConta[ id=" + id + " ]";
    }
    
}
