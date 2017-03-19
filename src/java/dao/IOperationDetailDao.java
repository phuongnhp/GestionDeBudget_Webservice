/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entite.OperationDetail;
import java.util.List;

/**
 *
 * @author phuong
 */
public interface IOperationDetailDao {
    List findAll(String username);
    OperationDetail findById(int id);
    OperationDetail insert(OperationDetail operationDetail);
    int update(OperationDetail newOperationDetail);
    int delete(int id); 
}
