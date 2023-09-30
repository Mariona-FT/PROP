/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mariona farre
 */

import java.util.*;

public class exercicis {
        public static void main(String[] args) {

    //Exercici comparador
    //CLasse futbolista: nom,gols,assistencies: crear collecio i ordenar
    //pot comparar: num gols -si empat assistencies - si empat nom

    List<Futbolista> futbolistes= new ArrayList<>();
    Futbolista f1=new Futbolista("Paco",3,4);
    Futbolista f2=new Futbolista("Lewi",0,0);
    Futbolista f3=new Futbolista("Venecia",7,2);
    Futbolista f4=new Futbolista("Lugi",3,0);
    Futbolista f5=new Futbolista("Pomma",3,0);
    Futbolista f6=new Futbolista("Carlota",10,15);

    futbolistes.add(f1);    
    futbolistes.add(f2);
    futbolistes.add(f3);
    futbolistes.add(f4);
    futbolistes.add(f5);
    futbolistes.add(f6);
 
    System.out.println("llista f inicial: ");
    for(Futbolista f:futbolistes){
       System.out.println(f.getNom()+","+f.getGols()+","+f.getAssistencies());
     }
    
     System.out.println("llista f comparada: ");
     Collections.sort(futbolistes);

    for(Futbolista f:futbolistes){
       System.out.println(f.getNom()+","+f.getGols()+","+f.getAssistencies());
     }

    
    
        }
}
