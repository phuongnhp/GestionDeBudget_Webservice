/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.budget;

import java.util.HashMap;

/**
 *
 * @author phuong
 */
public class BudgetServiceResult {
    int code;
    HashMap<String, Object> objet;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getObjet() {
        return objet;
    }

    public void setObjet(HashMap objet) {
        this.objet = objet;
    }

    @Override
    public String toString() {
        return "BudgetServiceResult{" + "code=" + code + ", objet=" + objet + '}';
    }    
}
