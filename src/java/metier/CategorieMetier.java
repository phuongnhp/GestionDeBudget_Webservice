/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import dao.ICategorieDao;
import entite.Categorie;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author phuong
 */
public class CategorieMetier implements ICategorieMetier{
    ICategorieDao dao;

    public void setDao (ICategorieDao dao) {
        this.dao = dao;
    }

    @Override
    public List lister(int type) {        
        List<Categorie> list = dao.findAll();
        if(list.isEmpty())
            return list;
        List<Categorie> l = new ArrayList<>();
        for(Categorie cat : list){
            if(cat.getCatType()==type)
                l.add(cat);
        }
        list.forEach(u -> System.out.println(u.getCatNom()+ " " + u.getCatType()));
        return l;
    }
    
}
