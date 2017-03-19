/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entite;

/**
 *
 * @author phuong
 */
public class Utilisateur {
    String username;
    String motdepasse;
    Integer enabled;

    @Override
    public String toString() {
        return "Utilisateur{" + "username=" + username + ", motdepasse=" + motdepasse + ", enabled=" + enabled + '}';
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMotdepasse() {
        return motdepasse;
    }

    public void setMotdepasse(String motdepasse) {
        this.motdepasse = motdepasse;
    }    
}
