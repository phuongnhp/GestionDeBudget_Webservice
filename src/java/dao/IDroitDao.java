/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entite.Droit;
import java.util.List;

/**
 *
 * @author phuong
 */
public interface IDroitDao {
    List findAll();
    Droit findById(int id);
    int insert(Droit droit);
    int update(int id, Droit droit);
    int delete(int id);
}
