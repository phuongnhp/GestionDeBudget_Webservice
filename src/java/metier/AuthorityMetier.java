/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import dao.IAuthorityDao;
import entite.Authority;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author phuong
 */
public class AuthorityMetier implements IAuthorityMetier {

    IAuthorityDao dao;

    public void setDao(IAuthorityDao dao) {
        this.dao = dao;
    }

    @Override
    public List lister(String username) {
        List<Authority> list = dao.findAll();
        if (list == null) {
            return null;
        } else {
            List<Authority> result = new ArrayList<>();
            for(Authority aut : list)
                if(aut.getUsername().matches(username))
                    result.add(aut);
            return result;
        }
    }
}
