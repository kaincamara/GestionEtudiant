/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Models.Client;
import Models.Personne;
import Models.Users;
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
public abstract class DaoPersonne implements IDao<Personne> {
    public final String SQL_INSERT="INSERT INTO `gestion_commercial_liage3`.`personne` (`nom_complet`, `login`, `password`, `tel`, `Adresse`, `type`) VALUES (?,?,?,?,?,?);";
    private final String SQL_SELECT_CONNECT="select * from personne where login=? and password";
    private final String SQL_SELECT_ALL_USERS="select * from personne where type='User'";
    private DaoMysql mysql;
    public DaoPersonne() {
        mysql=new DaoMysql();
    }
  
    public List<Users> findUser (Users user) {
        List<Users> lUsers=new ArrayList<>();
     try {
       mysql.ouvrirConnexionBd();
        //3 preparation de la requete
       mysql.preparerRequete (SQL_SELECT_ALL_USERS);
        //mysql.getPs().setString(l,professeur.getType());
       ResultSet rs=mysql.executeSelect();

     while (rs.next()) {
           Users usr=new Users();
        usr.setId(rs.getInt("id"));
        usr.setNomComplet(rs.getString("nom_complet"));
        lUsers.add(usr);
   } } catch (SQLException ex) {
      Logger.getLogger(DaoPersonne.class.getName()).log(Level.SEVERE, null, ex);
   }
    return lUsers;
    }  

    public Personne findUserConnect(String login, String password) {
        //recherche
     Personne pers=null;
      try {
       mysql.ouvrirConnexionBd();
       mysql.preparerRequete(SQL_SELECT_CONNECT);
       mysql.getPs().setString(1, login);
       mysql.getPs().setString(2, password);

     ResultSet rs=mysql.executeSelect();
     
     if(rs.getString("type").trim().compareTo("User")==0) {
        pers=new Users();
    }
    pers.setId(rs.getInt("id"));
    pers.setNomComplet(rs.getString("nom_complet"));
    pers.setLogin(rs.getString("login"));
    pers.setPassword(rs.getString("password"));
    } catch  (SQLException ex){
    Logger.getLogger(DaoPersonne.class.getName()).log(Level.SEVERE, null, ex);
    }
     return pers;
    }
 @Override
    public int insert(Personne pers){
       int nbreLigne=0;
       Client clt=new Client();
        try {
         mysql.ouvrirConnexionBd();
            //3 preparation de la requete
            mysql.preparerRequete(SQL_INSERT);
       
            mysql.getPs().setString(1, pers.getNomComplet());
            mysql.getPs().setString(2, pers.getType());
            mysql.getPs().setString(3, pers.getLogin());
            mysql.getPs().setString(4, pers.getPassword());
            mysql.getPs().setInt(5, clt.getTelephone());
            mysql.getPs().setString(6, clt.getAdresse());
            nbreLigne=mysql.executeMiseAJour();
            
        } catch (SQLException ex) {
            Logger.getLogger(DaoPersonne.class.getName()).log(Level.SEVERE, null, ex);
        }
       return nbreLigne;
    }
}



