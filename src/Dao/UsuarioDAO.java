package Dao;

import Entity.Usuario;

public class UsuarioDAO extends GenericDAO<Usuario>{
    
    public Usuario verificaUsuário(String senha){
        Usuario usuario = super.getEntityManager()
                .createQuery("SELECT u FROM Usuario u WHERE u.senha = :senha", Usuario.class)
                .setParameter("senha", senha)
                .getSingleResult();
        
        return usuario;
                
    }
    
}
