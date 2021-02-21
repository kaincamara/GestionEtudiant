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
public abstract class Personne {
    protected int id;
    protected String nomComplet;
    protected String type;
    protected String login;
    protected String password;

    public Personne() {
    }

    public Personne(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    public Personne(int id, String nomComplet) {
        this.id = id;
        this.nomComplet = nomComplet;
    }

    public Personne(int id, String nomComplet, String type) {
        this.id = id;
        this.nomComplet = nomComplet;
        this.type = type;
    }

    public Personne(int id, String nomComplet, String type, String login) {
        this.id = id;
        this.nomComplet = nomComplet;
        this.type = type;
        this.login = login;
    }

    public Personne(int id, String nomComplet, String type, String login, String password) {
        this.id = id;
        this.nomComplet = nomComplet;
        this.type = type;
        this.login = login;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Personne{" + "id=" + id + ", nomComplet=" + nomComplet + ", type=" + type + ", login=" + login + ", password=" + password + '}';
    }  
}

