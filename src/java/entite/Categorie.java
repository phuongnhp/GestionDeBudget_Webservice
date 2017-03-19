/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entite;

/**
 *
 * @author phuong
 */
public class Categorie {
    Integer id;
    String catNom;
    Integer catType;

    @Override
    public String toString() {
        return "Categorie{" + "id=" + id + ", catNom=" + catNom + ", catType=" + catType + '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCatNom() {
        return catNom;
    }

    public void setCatNom(String catNom) {
        this.catNom = catNom;
    }

    public Integer getCatType() {
        return catType;
    }

    public void setCatType(Integer CatType) {
        this.catType = CatType;
    }
    
    
}
