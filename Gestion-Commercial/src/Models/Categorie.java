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
public class Categorie {
    public int id;
    public String nomCatégorie;

    public Categorie() {
    }

    public Categorie(int id, String nomCatégorie) {
        this.id = id;
        this.nomCatégorie = nomCatégorie;
    }

    public Categorie(String nomCatégorie) {
        this.nomCatégorie = nomCatégorie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomCatégorie() {
        return nomCatégorie;
    }

    public void setNomCatégorie(String nomCatégorie) {
        this.nomCatégorie = nomCatégorie;
    }

    @Override
    public String toString() {
        return "Categorie{" + "id=" + id + ", nomCat\u00e9gorie=" + nomCatégorie + '}';
    }

    public String getNomCategorie() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getid() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
