/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Mansour Djamil
 */
public class Detail {
    private String annee;
    private List<String> modules=new ArrayList();
    //ManyToOne
    private Classe cl;
    private Professeur professeur;
    
    public Details(String annee)
}
