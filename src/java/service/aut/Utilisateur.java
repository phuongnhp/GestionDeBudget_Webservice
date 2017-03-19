/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.aut;

import entite.Authority;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import metier.AuthorityMetier;
import metier.UtilisateurMetier;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 *
 * @author phuong
 */
@WebService(serviceName = "Utilisateur")
public class Utilisateur {

    /**
     * This is a sample web service operation
     *
     * @param txt
     * @return
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     *
     * @return
     */
    @WebMethod(operationName = "listerUtilisateurs")
    public List<entite.Utilisateur> listerUtilisateurs() {
        //TODO write your implementation code here:
        ListableBeanFactory bf;
        bf = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        UtilisateurMetier metier = (UtilisateurMetier) bf.getBean("utilisateurMetier");
        return metier.lister();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "seConnecter")
    public entite.Utilisateur seConnecter(@WebParam(name = "username") String username, @WebParam(name = "mdp") String mdp) {
        ListableBeanFactory bf;
        bf = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        UtilisateurMetier metier = (UtilisateurMetier) bf.getBean("utilisateurMetier");
        return metier.seConnecter(username, mdp);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "listerRoles")
    public List listerRoles(@WebParam(name = "username") String username) {
        ListableBeanFactory bf;
        bf = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        AuthorityMetier metier = (AuthorityMetier) bf.getBean("authorityMetier");
        List<Authority> list = metier.lister(username);
        if (list == null) {
            return null;
        }
        List<String> roles = new ArrayList<>();
        for (Authority aut : list) {
            roles.add(aut.getAuthority());
        }
        return roles;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "sInscrire")
    public String sInscrire(@WebParam(name = "username") String username, @WebParam(name = "mdp") String mdp) {
        ListableBeanFactory bf;
        bf = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        UtilisateurMetier metier = (UtilisateurMetier) bf.getBean("utilisateurMetier");
        entite.Utilisateur u = metier.seInscrire(username, mdp);
        if (u == null) {
            return null;
        }
        return "OK";
    }
}
