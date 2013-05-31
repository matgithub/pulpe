/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionEntreprise;

/**
 *
 * @author p1205670
 */
public class Etudiant {
    
    static int cpt=0;// a initialiser avec le dernier id creer en table mais comment faire ^^
    
    public int id;
    public String nom;

    public Etudiant(int lastid) {
        cpt=lastid;
        cpt++;
        this.id = cpt;
        this.nom = "";
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
    
}
