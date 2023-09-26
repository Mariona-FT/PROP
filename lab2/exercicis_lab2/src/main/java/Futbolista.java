/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mariona farre
 */

import java.util.Collections;
import java.util.Objects;


public class Futbolista implements Comparable<Futbolista> {
    //nom, gols,assistencies
    //pot comparar: num gols -si empat assistencies - si empat nom
    //collecio futbolistes+ ordenar
    
    String Nom;
    int Gols;
    int Assistencies;

    public Futbolista(String Nom, int Gols, int Assistencies) {
        this.Nom = Nom;
        this.Gols = Gols;
        this.Assistencies = Assistencies;
    }

    public String getNom() {
        return Nom;
    }

    public int getGols() {
        return Gols;
    }

    public int getAssistencies() {
        return Assistencies;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setGols(int Gols) {
        this.Gols = Gols;
    }

    public void setAssistencies(int Assistencies) {
        this.Assistencies = Assistencies;
    }
    
    
    @Override
    public int compareTo(Futbolista f) {
        //pot comparar: num gols -si empat assistencies - si empat nom
        int comparacio=(int)(this.Gols-f.Gols);
        if(comparacio==0){
            comparacio=(int)(this.Assistencies-f.Assistencies);
            if(comparacio==0){
                comparacio=(int)(this.Nom.compareTo(f.Nom));
            }
        }
        
        return comparacio;
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
