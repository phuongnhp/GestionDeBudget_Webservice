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
import javax.jws.WebService;

/**
 *
 * @author phuong
 */
@WebService
public interface IBudgetService {    
    List listerOpts(String username, String actor, int type);
    OperationDetail creerOpt(String label, int cat, double montant, double montantpv, Date date, String commentaire, String username, int type, String actor);
    OperationDetail modifierOpt(int id, String label, int cat, double montant, double montantpv, Date date, String commentaire, String username, int type, String actor);
    int supprimerOpt(int id, String actor);
    OperationDetail chercherOpt(int id, String actor);
    List listerCats(int type);
    Categorie chercherCat(int id);
    List listerDroits();
    Droit obtenirDroit();
    List listerPartage(String username);
    Partage creerPartage(String username, String actor, int droit);
}
