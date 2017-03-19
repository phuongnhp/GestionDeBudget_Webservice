/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entite.Utilisateur;
import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author phuong
 */
public class UtilisateurDao extends HibernateDaoSupport implements IUtilisateurDao {

    // Liste tous les individus
    @Override
    public List<Utilisateur> findAll() {
        return getHibernateTemplate().find("from entite.Utilisateur");
    }

    @Override
    public Utilisateur findById(String username) {
        return getHibernateTemplate().get(Utilisateur.class, username);
    }

    @Override
    public int insert(Utilisateur newUtilisateur) {
        try {
            getHibernateTemplate().persist(newUtilisateur);
            return 1;
        } catch (DataAccessException ex) {
            return 0;
        }
    }

    @Override
    public int update(String username, Utilisateur newUtilisateur) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(String username) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
