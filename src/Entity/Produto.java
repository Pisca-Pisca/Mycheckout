package Entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@NamedQueries({
    @NamedQuery(name = "Produto.findAll", query = "SELECT p FROM Produto p")
    , 
    @NamedQuery(name = "Produto.findById", query = "SELECT p FROM Produto p WHERE p.id = :codigo")
})

@Entity
public class Produto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id = 0;

    @Column(name = "nome")
    private String nome;
    
    @Column(name = "descricao")
    private String descricao;

    @Column(name = "preco")
    private Double preco;
    
    @Column(name =  "tempoEspera")
    private String tempoEspera;

    @Column(name = "disponivel")
    private boolean disponivel;

    @Column(name = "foto")
    private byte[] foto;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria_codigo;

    @ManyToOne
    @JoinColumn(name = "subcategoria_id")
    private subcategoria subcategoria_codigo;

    @ManyToMany
    @JoinTable(
        name = "pedido",
        joinColumns = @JoinColumn(name = "produto_id"),
        inverseJoinColumns = @JoinColumn(name = "minhaConta_id")
    )
    private List<MinhaConta> minhaConta;

    public Produto() {
    }

    public Produto(String nome, String descricao, Double preco, String tempoEspera, boolean disponivel, byte[] foto, Categoria categoria_codigo, subcategoria subcategoria_codigo) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.tempoEspera = tempoEspera;
        this.disponivel = disponivel;
        this.foto = foto;
        this.categoria_codigo = categoria_codigo;
        this.subcategoria_codigo = subcategoria_codigo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco1) {
        this.preco = preco1;
    }

    public String getTempoEspera() {
        return tempoEspera;
    }

    public void setTempoEspera(String tempoEspera) {
        this.tempoEspera = tempoEspera;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public Categoria getCategoria_codigo() {
        return categoria_codigo;
    }

    public void setCategoria_codigo(Categoria categoria_codigo) {
        this.categoria_codigo = categoria_codigo;
    }

    public subcategoria getSubcategoria_codigo() {
        return subcategoria_codigo;
    }

    public void setSubcategoria_codigo(subcategoria subcategoria_codigo) {
        this.subcategoria_codigo = subcategoria_codigo;
    }

    public List<MinhaConta> getMinhaConta() {
        return minhaConta;
    }

    public void setMinhaConta(List<MinhaConta> MinhaConta) {
        this.minhaConta = MinhaConta;
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
        if (!(object instanceof Produto)) {
            return false;
        }
        Produto other = (Produto) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Produto[ id=" + id + " ]";
    }

}
