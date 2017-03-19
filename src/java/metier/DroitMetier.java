/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import dao.IDroitDao;
import java.util.List;

/**
 *
 * @author phuong
 */
public class DroitMetier implements IDroitMetier{
    IDroitDao dao;
    
    public void setDao (IDroitDao dao) {
        this.dao = dao;
    }

    @Override
    public List listerDroit() {
        return dao.findAll();
    }
}
