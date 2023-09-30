/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicimapllibre;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author usuario
 */
public class exercicis_lab3 {
    
    public static void main(String[] args){
       Map<Integer,String> mapa=new HashMap<>();
       
        mapa.put(23,"Michele Jordan");
        mapa.put(10,"Lionel Messi");
        
        System.out.println("23 es"+mapa.get(23));
        
        if (mapa.containsKey(666666)){
            System.out.println("23 es"+mapa.get(66666));
        }
        
         if (mapa.containsValue("Michele Jordan")){
            System.out.println("23 es"+mapa.get(66666));
        }
         
        for (String valor:mapa.values()){
            System.out.println("*"+valor);
        }
        
    }
}
