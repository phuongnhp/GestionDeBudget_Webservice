/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import entite.OperationDetail;
import java.util.Date;
import java.util.List;

/**
 *
 * @author phuong
 */
public interface IOperationDetailMetier {
    List lister(String username, Date dateDebut, Date dateFin, int type);
    OperationDetail chercherById(int id, String actor);
    OperationDetail creer(OperationDetail operation, String username, String actor);
    OperationDetail modifier(OperationDetail operation, String username, String actor);
    int supprimer(int id, String username, String actor);
}
