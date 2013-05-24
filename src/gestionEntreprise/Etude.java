/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionEntreprise;

/**
 *
 * @author Sev
 */
public class Etude {
    
    static int cpt = 0;
    public int id_etude;
    public String nom_etude;
    public int duree;
    public Entreprise e;
//    public Etudiant etu;
    public int datefin;

    public int getId_etude() {
        return id_etude;
    }

    public void setId_etude(int id_etude) {
        this.id_etude = id_etude;
    }

    public String getNom_etude() {
        return nom_etude;
    }

    public void setNom_etude(String nom_etude) {
        this.nom_etude = nom_etude;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public int getDatefin() {
        return datefin;
    }

    public void setDatefin(int datefin) {
        this.datefin = datefin;
    }

    public Etude(String nom_etude) 
    {
        this.nom_etude = nom_etude;
    }
    
}
