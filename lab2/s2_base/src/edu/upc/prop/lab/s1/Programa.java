package edu.upc.prop.lab.s1;


/**
 *
 * @author bernat
 */
public class Programa {
    
    
    public static void main(String[] args) {
        
        //----------------------------------------------------------------------
        
        System.out.println("Hello world!");
        
        //----------------------------------------------------------------------
        
        Gos gos1 = new Gos(1, "Charly",6, "Bulldog", false);        
        Gos gos2 = new Gos(2, "Rivel",7, "Pitbull", true);        
        Gos gos3 = new Gos(3, "Rivel",7, "Pitbull", true);        
        Gat gat1 = new Gat(4, "Boira", 2, "Siamés", false);
        Gat gat2 = new Gat(5, "Xipi", 13, "Maltès", true);
        Gat gat3 = new Gat(6, "Nipi", 3, "Korea", true);
        
        //----------------------------------------------------------------------
        
        Propietari p1 = new Propietari("11111111H", "Paco",22);
        Propietari p2 = new Propietari("22222222H", "Marta",44);
        Propietari p3 = new Propietari("33333333H", "Cristina",55);
        Propietari p4 = new Propietari("44444444H", "Pep",67);
        Propietari p5 = new Propietari("55555555H", "Josep",1);
        Propietari p6 = new Propietari("66666666H", "Pepa",4444);
        //----------------------------------------------------------------------
                System.out.println("buu!");

    }
    
}
