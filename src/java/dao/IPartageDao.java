/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import entite.Partage;

/**
 *
 * @author phuong
 */
public interface IPartageDao {    
    List findAll();
    Partage findById(int id);
    int insert(Partage partage);
    int update(int id, Partage partage);
    int delete(int id);
}
