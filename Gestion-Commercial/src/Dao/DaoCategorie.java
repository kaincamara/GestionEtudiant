/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Models.Article;
import Models.Categorie;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author toshiba
 */
public class DaoCategorie implements IDao<Categorie> {
     public final String SQL_INSERT="INSERT INTO `gestion_commercial_liage3`.`article` (`Reference`, `Libelle`, `Stock`, `Prix`) VALUES (?,?,?,?,?,?);";
    private final String SQL_SELECT__ALL_CATEGORIE="select * from article";
    
    private DaoMysql mysql;
    public DaoCategorie() {
        mysql=new DaoMysql();
    }
 @Override
    public int insert(Categorie cart) { 
    int nbreLigne=0;
         
      try {
            //insertion et retrn nbre de ligne
           mysql.ouvrirConnexionBd();
            //3 preparation de la requete
            mysql.preparerRequete(SQL_INSERT);
        
            //remplacer le var de la requete par les valeurs
            mysql.getPs().setString(1, cart.getNomCategorie());
           mysql.getPs().setInt(4, cart.getid());
            //executer la requete
             nbreLigne=mysql.executeMiseAJour();
        
         } catch (SQLException ex) {
            Logger.getLogger(DaoCategorie.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
          mysql.CloseConnexion();
      }
        return nbreLigne;
        
    }
    
    public List<Cartegorie> findAll(){
        List<Cartegorie>lCartegories=new ArrayList<>();
        
          //chargement du driver
               try {     
            mysql.ouvrirConnexionBd();
            String SQL_SELECT_ALL_CARTEGORIE = null;
         
            
            //3 preparation de la requete
            mysql.preparerRequete(SQL_SELECT_ALL_CARTEGORIE);
            ResultSet rs=mysql.executeSelect();
       
            while(rs.next()){
                Categorie cart=new Categorie(rs.getInt("id"), rs.getString("nomCategorie"));
                lCategories.add(cart);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoCategorie.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
                   mysql.CloseConnexion();
               }
       
        //Remplir liste
        return lCartegories;
    }    

    private static class lCategories {

        private static void add(Categorie cart) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public lCategories() {
        }
    }

   
    
    
}

