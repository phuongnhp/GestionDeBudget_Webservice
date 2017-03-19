/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entite.Categorie;
import entite.Utilisateur;
import java.util.List;

/**
 *
 * @author phuong
 */
public interface ICategorieDao {
    List findAll();
    Categorie findById(int id);
    int insert(Categorie categorie);
    int update(int id, Categorie newCategorie);
    int delete(int id);
}
