/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionEntreprise;

/**
 *
 * @author p1205670
 */
public class Entreprise {
    
    static int cpt=0;// a initialiser avec le dernier id creer en table mais comment faire ^^
    
    public int id;
    public String nom;
    public String adr;
    public String tel;

    public Entreprise() {
        cpt++;
        this.id = cpt;
    }

    public static int getCpt() {
        return cpt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdr() {
        return adr;
    }

    public void setAdr(String adr) {
        this.adr = adr;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
    
}
