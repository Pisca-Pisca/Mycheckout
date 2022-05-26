package Entity;

import Enum.Permissoes;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@NamedQueries({
    @NamedQuery( name = "Usuario.findAll", query= "SELECT u FROM Usuario u"), 
    @NamedQuery( name = "Usuario.findById", query= "SELECT u FROM Usuario u WHERE u.id = :codigo")        
})

@Entity
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "senha")
    private String senha;
    
    @Column(name = "permissao")
    private String permisao;
    
    public Usuario() {
    }

    public Usuario(int id, String senha, String permisao) {
        this.id = id;
        this.senha = senha;
        this.permisao = permisao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPermisao() {
        return permisao;
    }

    public void setPermisao(String permisao) {
        this.permisao = permisao;
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
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Usuario[ id=" + id + " ]";
    }
    
}
