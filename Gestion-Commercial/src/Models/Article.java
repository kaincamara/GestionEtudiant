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
public class Article {
    public int id;
    public String ref;
    public String libelle;
    public String Stock;
    public int prix;

    public Article() {
    }

    public Article(int id, String ref, String libelle, String Stock, int prix) {
        this.id = id;
        this.ref = ref;
        this.libelle = libelle;
        this.Stock = Stock;
        this.prix = prix;
    }

    public Article(String ref, String libelle, String Stock, int prix) {
        this.ref = ref;
        this.libelle = libelle;
        this.Stock = Stock;
        this.prix = prix;
    }

    public Article(int aInt, String string, int aInt0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getStock() {
        return Stock;
    }

    public void setStock(String Stock) {
        this.Stock = Stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    @Override
    public String toString() {
        return "Article{" + "id=" + id + ", ref=" + ref + ", libelle=" + libelle + ", Stock=" + Stock + ", prix=" + prix + '}';
    }

    public String getReference() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
