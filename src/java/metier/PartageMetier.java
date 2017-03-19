/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import dao.IPartageDao;
import entite.Partage;
import java.util.List;

/**
 *
 * @author phuong
 */
public class PartageMetier implements IPartageMetier{
    IPartageDao dao;
    
    public void setDao (IPartageDao dao) {
        this.dao = dao;
    }

    @Override
    public List lister(String username) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Partage creer(Partage partage) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
