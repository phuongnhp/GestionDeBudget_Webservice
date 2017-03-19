/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entite.Categorie;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author phuong
 */
public class CategorieDao extends HibernateDaoSupport implements ICategorieDao {

    @Override
    public List findAll() {
        return getHibernateTemplate().find("from entite.Categorie");
    }

    @Override
    public Categorie findById(int id) {
        List<Categorie> list = getHibernateTemplate().find("from entite.Categorie where id = " + id);
        if(list.isEmpty())
           return null;
        return list.get(0);
    }

    @Override
    public int insert(Categorie categorie) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(int id, Categorie newCategorie) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
