/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.budget;

import entite.OperationDetail;
import java.util.Date;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import metier.OperationDetailMetier;
import metier.UtilisateurMetier;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 *
 * @author phuong
 */
@WebService(serviceName = "Operation")
public class Operation {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "listerOperation")
    public List<OperationDetail> listerOperation(@WebParam(name = "username") String username, @WebParam(name = "dateDebut") Date dateDebut, @WebParam(name = "dateFin") String dateFin) {
        ListableBeanFactory bf;
        bf = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        OperationDetailMetier metier=(OperationDetailMetier)bf.getBean("operationDetailMetier");
        return metier.lister(username, dateDebut, dateDebut,1);
    }
}
