
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mariona farre
 */
public class novesclasses {
    
    
    public static void main(String[] args){
        
        Persona maria= new Persona(123,"11212312","Maria",new Date()); //fer servir el constructor creat
        maria.setNom("Maria");
        
       try{
           maria.setNom("");
       }
       catch(Exception error){
           System.out.println("Error erroni nova classe");
       }
    System.out.println(">"+maria.getNom().toUpperCase());
        System.out.println(">"+maria.getNom().toUpperCase());
            
    }

  
    
}
