/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author user
 */
public class Professeur extends Personne {
    private String grade;

    public Professeur() {
    }

    public Professeur(String grade, String nomComplet) {
        super(nomComplet);
        this.grade = grade;
    }

    public Professeur(String grade, int id, String nomComplet) {
        super(id, nomComplet);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return super.toString()+"Grade :"+grade; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
}
