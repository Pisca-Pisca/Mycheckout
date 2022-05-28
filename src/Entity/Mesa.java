package Entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@NamedQueries({
    @NamedQuery( name = "Mesa.findAll", query= "SELECT sub FROM  Mesa sub"), 
    @NamedQuery( name = "Mesa.findById", query= "SELECT sub FROM Mesa sub WHERE sub.id = :codigo")        
})

@Entity
public class Mesa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "numeroMesa")
    private int numeroMesa;
    
    @Column(name = "ativa")
    private boolean ativa;
    
    @Column(name = "estaPago")
    private boolean estaPago;
    
    @Column(name = "valorTotal")
    private double valorTotal;
    
    @OneToMany(mappedBy = "numeroMesa", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MinhaConta> conta;
    
    @OneToMany(mappedBy = "numeroMesa", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Subconta> subconta;

    public Mesa() {
    }

    public Mesa(int id, int numeroMesa, boolean ativa, boolean estaPago, double valorTotal) {
        this.id = id;
        this.numeroMesa = numeroMesa;
        this.ativa = ativa;
        this.estaPago = estaPago;
        this.valorTotal = valorTotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public boolean isEstaPago() {
        return estaPago;
    }

    public void setEstaPago(boolean estaPago) {
        this.estaPago = estaPago;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<MinhaConta> getConta() {
        return conta;
    }

    public void setConta(List<MinhaConta> conta) {
        this.conta = conta;
    }

    public List<Subconta> getSubconta() {
        return subconta;
    }

    public void setSubconta(List<Subconta> subconta) {
        this.subconta = subconta;
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
        if (!(object instanceof Mesa)) {
            return false;
        }
        Mesa other = (Mesa) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Mesa[ id=" + id + " ]";
    }
    
}
