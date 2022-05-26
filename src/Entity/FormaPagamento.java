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

@NamedQueries({
    @NamedQuery( name = "FormaPagamento.findAll", query= "SELECT sub FROM FormaPagamento sub"), 
    @NamedQuery( name = "FormaPagamento.findById", query= "SELECT sub FROM FormaPagamento sub WHERE sub.id = :codigo")        
})

@Entity
public class FormaPagamento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "tipoPagamento")
    private String tipoPagamento;
    
    @OneToMany(mappedBy = "formaPagamento", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Subconta> subconta;

    public FormaPagamento() {
    }

    public FormaPagamento(int id, String tipoPagamento) {
        this.id = id;
        this.tipoPagamento = tipoPagamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
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
        if (!(object instanceof FormaPagamento)) {
            return false;
        }
        FormaPagamento other = (FormaPagamento) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.FormaPagamento[ id=" + id + " ]";
    }
    
}
