/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Test;

import DAO.DaoArticle;
import DAO.DaoCommande;
import DAO.DaoProfil;
import DAO.DaoUtilisateur;
import MODEL.Article;
import MODEL.Client;
import MODEL.Commande;
import MODEL.Profil;
import MODEL.Utilisateur;

/**
 *
 * @author kain camara
 */
public class TestDao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        DaoCommande daoCommande=new DaoCommande();
        Commande Commande=new Commande(001,29);
        daoCommande.insert(Commande);
        
        //daoArticle.findAll().forEach((article)->{
          //  System.out.println(article);            
       // });
       
       
        //DaoUtilisateur daoUtilisateur=new DaoUtilisateur();
        //Client client=new Client("gp","gp",77,"six");
        //daoUtilisateur.insert(client);
    }
        
        
        
     
}
