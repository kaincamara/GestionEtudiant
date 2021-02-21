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
public class Users extends Personne{
   public String login;
   public String password;

    public Users() {
        super();
        type="Users";
    }
   
}

