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
public class Client extends Personne {
    public int telephone;
    public String adresse;

    public Client() {
        super();
        type="Client";
    }

    public Client(int telephone, String adresse, int id, String nomComplet, String type, String login, String password) {
        super(id, nomComplet, type, login, password);
        this.telephone = telephone;
        this.adresse = adresse;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Client{" + "telephone=" + telephone + ", adresse=" + adresse + '}';
    }
    
    
} 

