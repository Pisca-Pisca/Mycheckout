/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entity.subcategoria;
import java.util.List;

/**
 *
 * @author nicol
 */
public class SubcategoriaDAO extends GenericDAO<subcategoria> {

    public List<subcategoria> selecionarPorCat(int idCat) {
        List<subcategoria> ListCat = super.getEntityManager()
                .createQuery("SELECT sub FROM subcategoria sub WHERE sub.categoria_codigo.id = :idCat ", subcategoria.class)
                .setParameter("idCat", idCat)
                .getResultList();

        return ListCat;
    }
}
