/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import dao.ICategorieDao;
import dao.IOperationDetailDao;
import entite.Categorie;
import entite.OperationDetail;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author phuong
 */
public class OperationDetailMetier implements IOperationDetailMetier {

    IOperationDetailDao dao;
    ICategorieDao catDao;

    public void setCatDao(ICategorieDao catDao) {
        this.catDao = catDao;
    }

    public void setDao(IOperationDetailDao dao) {
        this.dao = dao;
    }

    @Override
    public List lister(String username, Date dateDebut, Date dateFin, int type) {
        List<OperationDetail> list = dao.findAll(username);
        List<OperationDetail> l = new ArrayList<>();
        for (OperationDetail op : list) {
            if (op.getOpType() == type) {
                l.add(op);
            }
        }
        return l;
    }

    @Override
    public OperationDetail chercherById(int id, String actor) {
        return dao.findById(id);
    }

    @Override
    public OperationDetail creer(OperationDetail operation, String username, String actor) {
        if (operation == null) {
            return null;
        }
        if (!username.matches(operation.getUsername())) {
            return null;
        }
        if (operation.getCategorie() == null) {
            return null;
        }
        if (operation.getDateOp() == null) {
            return null;
        }
        Categorie cat = catDao.findById(operation.getCategorie());
        operation.setOpType(cat.getCatType());
        return dao.insert(operation);
    }

    @Override
    public OperationDetail modifier(OperationDetail operation, String username, String actor) {
        if (operation == null) {
            return null;
        }
        System.out.println(operation);
        OperationDetail opt = dao.findById(operation.getId());
        if (opt == null) {
            return null;
        }
        if (!username.matches(opt.getUsername())) {
            return null;
        }
        if (operation.getCategorie() == null) {
            return null;
        }
        if (operation.getDateOp() == null) {
            return null;
        }
        if (opt.getCategorie().compareTo(operation.getCategorie()) != 0) {
            Categorie cat = catDao.findById(operation.getCategorie());
            opt.setCategorie(operation.getCategorie());
            opt.setOpType(cat.getCatType());
        }
        if (operation.getCommentaire() != null) {
            if (!opt.getCommentaire().matches(operation.getCommentaire())) {
                opt.setCommentaire(operation.getCommentaire());
            }
        }
        if (opt.getDateOp().compareTo(operation.getDateOp()) != 0) {
            opt.setDateOp(operation.getDateOp());
        }
        if (operation.getLabel() != null) {
            if (!opt.getLabel().matches(operation.getLabel())) {
                opt.setLabel(operation.getLabel());
            }
        }
        if (operation.getMontant() != null) {
            if (opt.getMontant().compareTo(operation.getMontant()) != 0) {
                opt.setMontant(operation.getMontant());
            }
        }
        if (operation.getMontantPrevu() != null) {
            if (opt.getMontantPrevu().compareTo(operation.getMontantPrevu()) != 0) {
                opt.setMontantPrevu(operation.getMontantPrevu());
            }
        }
        dao.update(opt);
        return dao.findById(operation.getId());
    }

    @Override
    public int supprimer(int id, String username, String actor) {
        OperationDetail opt = dao.findById(id); 
        if (opt == null) {
            return -99;
        }
        if (!username.matches(opt.getUsername())) {
            return -999;
        }
        return dao.delete(id);
    }

}
