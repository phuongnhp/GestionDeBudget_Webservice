/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entite.OperationDetail;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author phuong
 */
public class OperationDetailDao extends HibernateDaoSupport implements IOperationDetailDao{

    @Override
    public List findAll(String username) {
        return getHibernateTemplate().find("from entite.OperationDetail where username = '" + username +"' order by dateOp desc");
    }

    @Override
    public OperationDetail findById(int id) {
        List<OperationDetail> list = getHibernateTemplate().find("from entite.OperationDetail where id = " + id);
        if(list.isEmpty())
           return null;
        return list.get(0);
    }

    @Override
    public OperationDetail insert(OperationDetail operationDetail) {
        System.out.println(operationDetail.toString());
        getHibernateTemplate().persist(operationDetail);
        System.out.println(operationDetail.toString());
        return operationDetail;
    }

    @Override
    public int update(OperationDetail newOperationDetail) {
        System.out.println(findById(newOperationDetail.getId()).toString());
        if(findById(newOperationDetail.getId()) == null)
            return -99;
        getHibernateTemplate().update(newOperationDetail);
        System.out.println(findById(newOperationDetail.getId()).toString());
        return 1;
    }

    @Override
    public int delete(int id) {
        OperationDetail operation = findById(id);
        if(operation==null)
            return -99;
        getHibernateTemplate().delete(operation);
        return 1;
    }    
}
