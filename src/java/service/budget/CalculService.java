/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.budget;

import entite.OperationDetail;
import java.util.Date;
import java.util.List;
import metier.OperationDetailMetier;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 *
 * @author phuong
 */
public class CalculService implements ICalculService{

    @Override
    public int add(int i, int j) {
        return i + j;
    }    

    @Override
    public OperationDetail creer(String label, int cat, double montant, double montantpv, Date date, String commentaire, String username) {
        OperationDetail opt = new OperationDetail();
        opt.setCategorie(cat);
        opt.setCommentaire(commentaire);
        opt.setDateOp(date);
        opt.setLabel(label);
        opt.setMontant(montant);
        opt.setMontantPrevu(montantpv);
        ListableBeanFactory bf;
        bf = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        OperationDetailMetier metier=(OperationDetailMetier)bf.getBean("operationDetailMetier");
        opt = metier.creer(opt, username, username);
        return opt;
    }

    @Override
    public List listerOpts(String username) {
        ListableBeanFactory bf;
        bf = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        OperationDetailMetier metier=(OperationDetailMetier)bf.getBean("operationDetailMetier");
        return metier.lister(username, null, null, 1); 
    }
}
