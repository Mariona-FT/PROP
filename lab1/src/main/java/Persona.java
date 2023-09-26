
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author c6890730
 */
public final class Persona {
    private long id;
    private String NIF;
    private String Nom;
    private Date dataNeixament;
    
    
    /*
    public Persona(long id,String NIF){
        this.id=id; //l'objecte acutal
        this.NIF=NIF;
        
    }
    */
//construir amb ALT+INSTERT
    public Persona(long id, String NIF, String nom, Date dataNeixament) {
        /*
        this.id = id;
        this.NIF = NIF;
        this.Nom = nom;
        this.dataNeixament = dataNeixament;
        */
        setId(id);
        setNIF(NIF);
        setNom(nom);
        setDataNeixament(dataNeixament);
    }

    public long getId() {
        return id;
    }

    public String getNIF() {
        return NIF;
    }

    public String getNom() {
        return Nom;
    }

    public Date getDataNeixament() {
        return dataNeixament;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public void setNom(String nom) {
        if(nom==null || nom.length()==0){
        throw new RuntimeException("Nom erroni");
    }
        this.Nom = nom;
    }

    public void setDataNeixament(Date dataNeixament) {
        this.dataNeixament = dataNeixament;
    }

   //retorn de tota la classe tots els seus valors
    
    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", NIF=" + NIF + ", Nom=" + Nom + ", dataNeixament=" + dataNeixament + '}';
    }
    
    
}
