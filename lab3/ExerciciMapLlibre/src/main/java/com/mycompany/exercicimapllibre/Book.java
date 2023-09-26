package com.mycompany.exercicimapllibre;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.*;

/**
 *
 * @author bernat
 */
public class Book {
    
    private Map<String,Integer> diccionari= new HashMap<>();
    

    public void main(String[] args) {

        Book b=new Book();
        b.readAllLinesFromTheBook();
        b.showFrequencyReport();
    }

    /**
     * Update the frequency counter with the words appearing in the line .
     * @param line contains the words that should be accounted.
     */
    private void registerWordsInALine(String line) {
       //  System.out.println(line);
        //TODO
        //mirar les paraules i guardarles per totes 
        String[] paraules=line.split("");
        
        for(String paraula:paraules){
            
            //processar paraula - min, caracters extranys
            
            paraula=paraula.toLowerCase();
            paraula=paraula.replaceAll("[a-z,0-9]", "");
            
            
            //cercar paraula dicc
            int r= dicccionari.get(paraula);
            int recompte=0;
            
            //si no hi es - freq =1  
            //si trobar dicc -> freq i incrementar +1
            if(r!=null){
                recompte=r;
            }
            recompte++;
         
            diccionari.put(paraula,recompte);
            
        }        
    }
    
    /**
     * Shows in stdout a list of words using the format:
     *    {word} - {frequency}
     * 
     * Words should appear sorted by descending frequency.
     */
    private void showFrequencyReport(){

        System.out.println("     Frequency report");
        System.out.println("============================");
        // TODO
        List<Entry<String,Integer>> dicordenat=new ArrayList<>();

        for (Entry<String,Integer> entry:diccionari.entrySet()){
            System.out.println(">"+entry.getKey()+":"+entry.getValue());
            dicordenat.add(entry);
        }
        /*
        //ordenar la llista +- freq
        Collections.sort(dicordenat. (p1,o2)-> {
            return p1.getValue()-o2.getValue(); //ordre de petit gran
        };
       
        
        for (Entry<String,Integer> entry:dicordenat){
            System.out.println(">"+entry.getKey()+":"+entry.getValue());
        }
        */
    }
    


    private void readAllLinesFromTheBook() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(
                    "Dracula.txt"));
            String line = reader.readLine();
            while (line != null) {               
                 registerWordsInALine(line);
                // read next line
                line = reader.readLine();
              
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    
    

}
