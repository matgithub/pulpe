/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionEntreprise;

/**
 *
 * @author p1205670
 */
public class conteneur {
    String status,date_paie,nom_etude;
    int nbjours,indemnite;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate_paie() {
        return date_paie;
    }

    public void setDate_paie(String date_paie) {
        this.date_paie = date_paie;
    }

    public String getNom_etude() {
        return nom_etude;
    }

    public void setNom_etude(String nom_etude) {
        this.nom_etude = nom_etude;
    }

    public int getNbjours() {
        return nbjours;
    }

    public void setNbjours(int nbjours) {
        this.nbjours = nbjours;
    }

    public int getIndemnite() {
        return indemnite;
    }

    public void setIndemnite(int indemnite) {
        this.indemnite = indemnite;
    }
    
}
