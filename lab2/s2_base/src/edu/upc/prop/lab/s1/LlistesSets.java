/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.upc.prop.lab.s1;
import java.util.*;
/**
 *
 * @author mariona farre
 */
public class LlistesSets {
    
    public static void main(String[] args) {
        
    List<Gat> gats= new ArrayList<>();
    Gat gat6 = new Gat(4, "Boira", 2, "Siamés", false);
    Gat gat7 = new Gat(5, "Xipi", 13, "Maltès", true);
    Gat gat8 = new Gat(6, "Nipi", 3, "Korea", true);
    gats.add(gat6);
    gats.add(gat7);
    gats.add(gat8);
    
    gats.remove(gat7);
    
    System.out.println(" > "+gats.get(1));
        
    //retrona el numero del index de la llista
    int indexDelBoira= gats.indexOf(gat6);
    System.out.println("Index del gat boira "+indexDelBoira);
    
   //PROPIETARIS amb hash 
   
   
   //RECORREGUTS
   for (int i=0;i<gats.size();++i){
      System.out.println("llista gats1: "+gats.get(i).getNom());

   }
   
   //recorre tota la llista
   for(Gat g:gats){
     System.out.println("llista gats2: "+g.getNom());

   }
   
    //Proves amb sets
    //sha de comparar amb numeros no amb el nom
    Set <Propietari> setPropietari = new HashSet<>();
    Propietari p1 = new Propietari("11111111H", "Paco",22);
    Propietari p2 = new Propietari("22222222H", "Marta",44);
    Propietari p3 = new Propietari("33333333H", "Cristina",55);
    Propietari p4 = new Propietari("44444444H", "Pep",67);
    Propietari p5 = new Propietari("55555555H", "Josep",1);
    Propietari p6 = new Propietari("66666666H", "Pepa",4444);
    
    setPropietari.add(p1);
    setPropietari.add(p2);
    setPropietari.add(p3);
    setPropietari.add(p4);
    setPropietari.add(p5);
    setPropietari.add(p6);

    //mateix id del propietari p4 pero amb nom i nif diferent
    Propietari p4bis = new Propietari("44444444H", "Pepo",67);
    
    System.out.println("llista propietaris inicial: ");

    for(Propietari p:setPropietari){
         System.out.println("llista propietaris 1: "+p.getNom() +" "+ p.getID());
       }
    
    //boolean existeix = setPropietari.contains(p4);
    //existeix=setPropietari.contains(p4bis);
    
    
    System.out.println("llista propietaris ORDENADA: ");
    List<Propietari> propietaris= new ArrayList<>();
    propietaris.add(p1);
   
    
    
    propietaris.add(p2);
    propietaris.add(p3);
    propietaris.add(p4);
    propietaris.add(p5);
    propietaris.add(p6);

    Collections.sort(propietaris);
    for(Propietari p:propietaris){
         System.out.println("llista propietaris 1: "+p.getNom()+ " "+ p.getID());
       }
    /*
    Collections.sort(propietaris,
            o1,o2-> p1.getNom().comareTo(o2.getNom());
    }
   
    Collections.sort(propietaris,new Comparator<Propietari>()){
        @Override
        public int compare(Propietari o1, Propietari o2){
            return o1.getNom().compareTo(o2.getNom());

        }*/
    }
    
}
