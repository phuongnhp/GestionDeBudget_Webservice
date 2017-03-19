/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.budget;

import entite.Categorie;
import entite.Droit;
import entite.OperationDetail;
import entite.Partage;
import java.util.Date;
import java.util.List;
import metier.CategorieMetier;
import metier.DroitMetier;
import metier.OperationDetailMetier;
import metier.PartageMetier;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 *
 * @author phuong
 */
public class BudgetService implements IBudgetService{

    @Override
    public List<OperationDetail> listerOpts(String username, String actor, int type) {
        ListableBeanFactory bf;
        bf = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        OperationDetailMetier metier=(OperationDetailMetier)bf.getBean("operationDetailMetier");
        return metier.lister(username, null, null, type);
    }

    @Override
    public OperationDetail creerOpt(String label, int cat, double montant, double montantpv, Date date, String commentaire, String username, int type, String actor) {
        ListableBeanFactory bf;
        bf = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        OperationDetailMetier metier=(OperationDetailMetier)bf.getBean("operationDetailMetier");
        OperationDetail opt = new OperationDetail(label, cat, montant, montantpv, date, commentaire, username, type);
        return metier.creer(opt, username, actor);
    }

    @Override
    public OperationDetail modifierOpt(int id, String label, int cat, double montant, double montantpv, Date date, String commentaire, String username, int type, String actor) {
        ListableBeanFactory bf;
        bf = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        OperationDetailMetier metier=(OperationDetailMetier)bf.getBean("operationDetailMetier");
        OperationDetail opt = new OperationDetail(label, cat, montant, montantpv, date, commentaire, username, type);
        opt.setId(id);
        return metier.modifier(opt, username, actor);
    }

    @Override
    public int supprimerOpt(int id, String actor) {
        ListableBeanFactory bf;
        bf = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        OperationDetailMetier metier=(OperationDetailMetier)bf.getBean("operationDetailMetier");
        metier.supprimer(id, actor, actor);
        return 1;
    }

    @Override
    public OperationDetail chercherOpt(int id, String actor) {
        ListableBeanFactory bf;
        bf = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        OperationDetailMetier metier=(OperationDetailMetier)bf.getBean("operationDetailMetier");
        return metier.chercherById(id, actor);
    }

    @Override
    public List<Categorie> listerCats(int type) {
        ListableBeanFactory bf;
        bf = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        CategorieMetier metier=(CategorieMetier)bf.getBean("categorieMetier");
        return metier.lister(type);
    }

    @Override
    public Categorie chercherCat(int id) {
        ListableBeanFactory bf;
        bf = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        CategorieMetier metier=(CategorieMetier)bf.getBean("categorieMetier");
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Droit> listerDroits() {
        ListableBeanFactory bf;
        bf = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        DroitMetier metier=(DroitMetier)bf.getBean("droitMetier");
        return metier.listerDroit();
    }

    @Override
    public List<Partage> listerPartage(String username) {
        ListableBeanFactory bf;
        bf = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        PartageMetier metier=(PartageMetier)bf.getBean("partageMetier");
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Partage creerPartage(String username, String actor, int droit) {
        ListableBeanFactory bf;
        bf = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        PartageMetier metier=(PartageMetier)bf.getBean("partageMetier");
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Droit obtenirDroit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    
}
