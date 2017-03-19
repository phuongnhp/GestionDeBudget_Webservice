/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entite;

import java.util.Date;


/**
 *
 * @author phuong
 */
public class OperationDetail {
    Integer id;
    String label;
    Integer categorie;
    Double montant;
    Double montantPrevu;
    Date dateOp;
    String commentaire;
    String username;
    Integer opType;

    public OperationDetail(String label, Integer categorie, Double montant, Double montantPrevu, Date dateOp, String commentaire, String username, Integer opType) {
        this.label = label;
        this.categorie = categorie;
        this.montant = montant;
        this.montantPrevu = montantPrevu;
        this.dateOp = dateOp;
        this.commentaire = commentaire;
        this.username = username;
        this.opType = opType;
    }

    public OperationDetail() {
    }

    @Override
    public String toString() {
        return "OperationDetail{" + "id=" + id + ", label=" + label + ", categorie=" + categorie + ", montant=" + montant + ", montantPrevu=" + montantPrevu + ", dateOp=" + dateOp + ", commentaire=" + commentaire + ", username=" + username + ", opType=" + opType + '}';
    }

    public Integer getCategorie() {
        return categorie;
    }

    public void setCategorie(Integer categorie) {
        this.categorie = categorie;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public Double getMontantPrevu() {
        return montantPrevu;
    }

    public void setMontantPrevu(Double montantPrevu) {
        this.montantPrevu = montantPrevu;
    }

    public Date getDateOp() {
        return dateOp;
    }

    public void setDateOp(Date dateOp) {
        this.dateOp = dateOp;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getOpType() {
        return opType;
    }

    public void setOpType(Integer opType) {
        this.opType = opType;
    }
}
