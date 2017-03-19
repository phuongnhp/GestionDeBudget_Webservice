/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import dao.IUtilisateurDao;
import entite.Utilisateur;
import java.util.List;

/**
 *
 * @author phuong
 */
public class UtilisateurMetier implements IUtilisateurMetier{

    IUtilisateurDao dao;

    public void setDao (IUtilisateurDao dao) {
        this.dao = dao;
    }

    @Override
    public List lister() {        
        List<Utilisateur> list = dao.findAll();
        list.forEach(u -> System.out.println(u.getUsername() + " " + u.getMotdepasse() + " " + u.getEnabled()));
        return list;
    }

    @Override
    public Utilisateur seConnecter(String username, String motdepasse) {
        Utilisateur u = dao.findById(username);
        if(u==null)
            return null;
        if(u.getMotdepasse().matches(motdepasse))
            return u;
        return null;
    }

    @Override
    public Utilisateur seInscrire(String username, String motdepasse) {
        Utilisateur u =new Utilisateur();
        u.setUsername(username);
        u.setMotdepasse(motdepasse);
        u.setEnabled(1);
        if(dao.insert(u)==1)
            return dao.findById(username);
        return null;
    }
    
}
