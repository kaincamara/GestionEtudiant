/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package METIER;

import DAO.DaoArticle;
import DAO.DaoCategorie;
import DAO.DaoCommande;
import DAO.DaoDetails;
import DAO.DaoProfil;
import DAO.DaoUtilisateur;
import MODEL.Article;
import MODEL.Categorie;
import MODEL.Client;
import MODEL.Commande;
import MODEL.Profil;
import MODEL.Utilisateur;
import java.util.List;

/**
 *
 * @author kain camara
 */
public class Service {
    private DaoUtilisateur daoUtilisateur;
    private DaoProfil daoProfil;
    private DaoArticle daoArticle;
    private DaoCategorie daoCategorie;
    private DaoCommande daoCommande;
    private DaoDetails daoDetails;
      
      
    public Service(){
        daoUtilisateur = new DaoUtilisateur();
        daoProfil = new DaoProfil();
        daoCategorie = new DaoCategorie();
        daoCommande = new DaoCommande();
        daoDetails = new DaoDetails();
    }
    
    public boolean creerProfil (Profil profil){        
        int nbreLigne=daoProfil.insert(profil);
        if(nbreLigne==0)return false ;
        else return true;
    }  
    
    public List<Profil> listerProfil(){
        return daoProfil.findAll();
    }  

    public boolean creerUtilisateur (Utilisateur utilisateur){        
        int nbreLigne=daoUtilisateur.insert(utilisateur);
        if(nbreLigne==0)return false ;
        else return true;
    }  
     
      public Utilisateur seConnecter(String login,String pwd){
         return daoUtilisateur.findUserConect(login, pwd);
     }
    public List<Utilisateur> listerUtilisateur(){
        return daoUtilisateur.findAll();
    }    
      
    public List<Article> listerArticle(){
        return daoArticle.findAll();
    }   
    public boolean enregistrerArticle (Article article){        
        int nbreLigne=daoArticle.insert(article);
        if(nbreLigne==0)return false ;
        else return true;
    }  
    
    public boolean creerCategorie (Categorie categorie){        
        int nbreLigne=daoCategorie.insert(categorie);
        if(nbreLigne==0)return false ;
        else return true;
    }  
    
    public List<Categorie> listerCategorie(){
        return daoCategorie.findAll();
    }  
    
    public boolean enregistrerClient (Client client){        
        int nbreLigne=daoUtilisateur.insert(client);
        if(nbreLigne==0)return false ;
        else return true;
    } 
        
     public Article chercherArticleParReference(String reference){
        return daoDetails.findArticleByReference(reference);        
    }
     
      public Utilisateur chercherClientParTelephone(String telephone){
        return daoUtilisateur.findClientByTelephone(telephone);        
    }
      
     public boolean ajouterCommande (Commande commande){        
        int nbreLigne=daoCommande.insert(commande);
        if(nbreLigne==0)return false ;
        else return true;
    }  
    
}
