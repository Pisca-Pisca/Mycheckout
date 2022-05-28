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

    @Column(name = "preco1")
    private Double preco1;

    @Column(name = "preco2")
    private Double preco2;

    @Column(name = "preco3")
    private Double preco3;

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

    public Produto(int id, String nome, String descricao, Double preco1, Double preco2, Double preco3, boolean disponivel, byte[] foto, Categoria categoria_codigo, subcategoria subcategoria_codigo) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco1 = preco1;
        this.preco2 = preco2;
        this.preco3 = preco3;
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
    
    public Double getPreco1() {
        return preco1;
    }

    public void setPreco1(Double preco1) {
        this.preco1 = preco1;
    }

    public Double getPreco2() {
        return preco2;
    }

    public void setPreco2(Double preco2) {
        this.preco2 = preco2;
    }

    public Double getPreco3() {
        return preco3;
    }

    public void setPreco3(Double preco3) {
        this.preco3 = preco3;
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
