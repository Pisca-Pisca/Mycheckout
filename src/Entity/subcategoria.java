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
    @NamedQuery( name = "subcategoria.findAll", query= "SELECT sub FROM subcategoria sub"), 
    @NamedQuery( name = "subcategoria.findById", query= "SELECT sub FROM subcategoria sub WHERE sub.id = :codigo")        
})

@Entity
public class subcategoria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "nome")
    private String nome;
    
    @ManyToOne
    @JoinColumn(name =  "categoria_id")
    private Categoria categoria_codigo;

    public subcategoria() {
    }

    public subcategoria(int id, String nome, Categoria categoria_codigo) {
        this.id = id;
        this.nome = nome;
        this.categoria_codigo = categoria_codigo;
    }
    
    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Categoria getCategoria_codigo() {
        return categoria_codigo;
    }

    public void setCategoria_codigo(Categoria categoria_codigo) {
        this.categoria_codigo = categoria_codigo;
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
        if (!(object instanceof subcategoria)) {
            return false;
        }
        subcategoria other = (subcategoria) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.subcategoria[ id=" + id + " ]";
    }
    
}
