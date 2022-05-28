/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import javax.persistence.*;

/**
 *
 * @author Moreno
 */
public class ManagerFactory {

    private static EntityManagerFactory emf;

    public static EntityManager getEntityManager() {
        if (emf == null) {
            try{
            emf = Persistence.createEntityManagerFactory("MycheckoutPU");
            }
            catch(Exception e){
                 e.printStackTrace();
            }
        }
        return emf.createEntityManager();
    }
}
