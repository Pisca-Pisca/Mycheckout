package Dao;

import Entity.MinhaConta;
import Entity.Produto;
import java.util.List;

public class MinhaContaDAO extends GenericDAO<MinhaConta>{
    public List<Produto> selecionarPorCatESub() {
        List<Produto> ListProd = super.getEntityManager()
                .createQuery("SELECT p FROM MinhaConta p WHERE p.produtoList = :idCat AND p.subcategoria_codigo.id = :idSub", Produto.class)
                .getResultList();

        return ListProd;
    }
}
