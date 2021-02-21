/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author toshiba
 */
public class Commande {
    public int idCom;
    public String libelle;
    public int prix;
    public int qte;

    public Commande() {
    }

    public Commande(int idCom, String libelle, int prix, int qte) {
        this.idCom = idCom;
        this.libelle = libelle;
        this.prix = prix;
        this.qte = qte;
    }

    public Commande(String libelle, int prix, int qte) {
        this.libelle = libelle;
        this.prix = prix;
        this.qte = qte;
    }

    public int getIdCom() {
        return idCom;
    }

    public void setIdCom(int idCom) {
        this.idCom = idCom;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    @Override
    public String toString() {
        return "Commande{" + "idCom=" + idCom + ", libelle=" + libelle + ", prix=" + prix + ", qte=" + qte + '}';
    }

  
}

