/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

import Dao.DaoArticle;
import Dao.DaoCategorie;
import Dao.DaoCommande;
import Dao.DaoPersonne;
import Models.Personne;

/**
 *
 * @author toshiba
 */
public class Service {
    private DaoPersonne daoPersonne;
    private DaoCommande daoCommande;
    private DaoArticle daoArticle;
    private DaoCategorie daoCategorie;

    public Service() {
        daoCommande=new DaoCommande();
        daoPersonne=new DaoPersonne() {};
        daoArticle=new DaoArticle();
        daoCategorie=new DaoCategorie();
    }
    public Personne seConnecter(String login, String password){
         return daoPersonne.findUserConnect(login, password);
}
    public boolean creerPersonne(Personne pers){
        int nbreLigne= daoPersonne.insert(pers);
        return nbreLigne != 0;
    }

    
}
