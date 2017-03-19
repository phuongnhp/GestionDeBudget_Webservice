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

/**
 *
 * @author phuong
 */
@WebService
public interface ICalculService {

    int add(int i, int j);    
    OperationDetail creer(String label, int cat, double montant, double montantpv, Date date, String commentaire, String username);
    List listerOpts(String username); 
}
