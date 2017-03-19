/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entite.Authority;
import java.util.List;

/**
 *
 * @author phuong
 */
public interface IAuthorityDao {
    List findAll();
    Authority findById(int id);
    int insert(Authority aut);
    int update(int id, Authority aut);
    int delete(int id);
}
