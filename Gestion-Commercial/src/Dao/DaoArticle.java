/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Models.Article;
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
public class DaoArticle implements IDao<Article> {
     public final String SQL_INSERT="INSERT INTO `gestion_commercial_liage3`.`article` (`Reference`, `Libelle`, `Stock`, `Prix`) VALUES (?,?,?,?,?,?);";
    private final String SQL_SELECT__ALL_ARTICLE="select * from article";
    
    private DaoMysql mysql;
    public DaoArticle() {
        mysql=new DaoMysql();
    }

    @Override
    public int insert(Article art) {
    int nbreLigne=0;
         
      try {
            //insertion et retrn nbre de ligne
           mysql.ouvrirConnexionBd();
            //3 preparation de la requete
            mysql.preparerRequete(SQL_INSERT);
        
            //remplacer le var de la requete par les valeurs
            mysql.getPs().setString(1, art.getReference());
          mysql.getPs().setString(2, art.getLibelle());
          mysql.getPs().setString(3, art.getStock());
           mysql.getPs().setInt(4, art.getPrix());
            //executer la requete
             nbreLigne=mysql.executeMiseAJour();
        
         } catch (SQLException ex) {
            Logger.getLogger(DaoArticle.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
          mysql.CloseConnexion();
      }
        return nbreLigne;
        
    }
    
    public List<Article> findAll(){
        List<Article>lArticles=new ArrayList<>();
        
          //chargement du driver
               try {     
            mysql.ouvrirConnexionBd();
            String SQL_SELECT_ALL_ARTICLE = null;
            
            //3 preparation de la requete
            mysql.preparerRequete(SQL_SELECT_ALL_ARTICLE);
            ResultSet rs=mysql.executeSelect();
       
            while(rs.next()){
                Article art=new Article(rs.getInt("id"), rs.getString("libelle"), rs.getInt("nbre_etudiant"));
                lArticles.add(art);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoArticle.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
                   mysql.CloseConnexion();
               }
       
        //Remplir liste
        return lArticles;
    }    
    
    
}
