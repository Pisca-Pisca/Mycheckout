package Entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@NamedQueries({
    @NamedQuery( name = "Chamados_fila.findAll", query= "SELECT sub FROM Chamados_fila sub"), 
    @NamedQuery( name = "Chamados_fila.findById", query= "SELECT sub FROM Chamados_fila sub WHERE sub.id = :codigo")        
})

@Entity
public class Chamados_fila implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "numeroMesa")
    private int numeroMesa;
    
    @Column(name = "atendida")
    private boolean atendida;

    public Chamados_fila() {
    }

    public Chamados_fila(int id, boolean atendida, int mesa) {
        this.id = id;
        this.atendida = atendida;
        this.numeroMesa = mesa;
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

    public boolean isAtendida() {
        return atendida;
    }

    public void setAtendida(boolean atendida) {
        this.atendida = atendida;
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
        if (!(object instanceof Chamados_fila)) {
            return false;
        }
        Chamados_fila other = (Chamados_fila) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Chamados_fila[ id=" + id + " ]";
    }
    
}
