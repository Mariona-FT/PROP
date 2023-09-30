package edu.upc.prop.lab.s1;

import java.util.Collections;
import java.util.Objects;

/**
 *
 * @author bernat
 */
public class Propietari implements Comparable<Propietari>{
    String NIF;
    String nom;
    int ID;

    public Propietari(String NIF, String nom, int ID) {
        setNIF(NIF);
        setNom(nom);
        setID(ID);
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }
     
   

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public int getID(){
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Propietari other = (Propietari) obj;
        if (!Objects.equals(this.NIF, other.NIF)) {
            return false;
        }
        return Objects.equals(this.nom, other.nom);
    }

    @Override
    public int compareTo(Propietari t) {
        return (int)(this.ID-t.ID);
        
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

}
