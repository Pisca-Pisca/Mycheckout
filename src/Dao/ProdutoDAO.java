package Dao;

import Entity.Produto;
import java.util.List;

public class ProdutoDAO extends GenericDAO<Produto> {

    public List<Produto> selecionarPorCatESub(int idCat, int idSUb) {
        List<Produto> ListProd = super.getEntityManager()
                .createQuery("SELECT p FROM Produto p WHERE p.categoria_codigo.id = :idCat AND p.subcategoria_codigo.id = :idSub", Produto.class)
                .setParameter("idCat", idCat)
                .setParameter("idSub", idSUb)
                .getResultList();

        return ListProd;
    }

    public List<Produto> selecionarPorCat(int idCat) {
        List<Produto> ListProd = super.getEntityManager()
                .createQuery("SELECT p FROM Produto p WHERE p.categoria_codigo.id = :idCat ", Produto.class)
                .setParameter("idCat", idCat)
                .getResultList();

        return ListProd;
    }
    
    public Produto selecionarProdPorNome(String nome){
        Produto produto = super.getEntityManager()
                .createQuery("SELECT p FROM Produto p WHERE p.nome = :nome ", Produto.class)
                .setParameter("nome", nome)
                .getSingleResult();
        
        return produto;
    }
}
