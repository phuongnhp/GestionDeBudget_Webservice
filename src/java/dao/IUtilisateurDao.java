/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entite.Utilisateur;
import java.util.List;

/**
 *
 * @author phuong
 */
public interface IUtilisateurDao {
    List findAll();
    Utilisateur findById(String username);
    int insert(Utilisateur newUtilisateur);
    int update(String username, Utilisateur newUtilisateur);
    int delete(String username);
}
