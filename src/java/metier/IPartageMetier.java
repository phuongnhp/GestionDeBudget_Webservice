/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import entite.Partage;
import java.util.List;

/**
 *
 * @author phuong
 */
public interface IPartageMetier {
    List lister(String username);
    Partage creer(Partage partage);
}
