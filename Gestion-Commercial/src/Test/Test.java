/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Dao.DaoPersonne;
import Models.Users;


/**
 *
 * @author toshiba
 */
public class Test {
  /**
* @param args the command line arguments
*/
public static void main (String[] args) {
//TODO code application logic here
DaoPersonne daoPersonne=new DaoPersonne() {};{
daoPersonne.findUser(new Users()).forEach(System.out::println);
}
//daoPersonne.findAll().forEach((classe)->{
//System.out.println(classe);
//});
}

    
}
