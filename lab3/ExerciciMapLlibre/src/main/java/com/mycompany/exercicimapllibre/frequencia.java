/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicimapllibre;

/**
 *
 * @author usuario
 */

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;


public class frequencia {
    
    Map <Integer,String> freq;

    
    public frequencia(Map<Integer, String> freq) {
        this.freq = freq;
    }

    public Map<Integer, String> getFreq() {
        return freq;
    }

    public void setFreq(Map<Integer, String> freq) {
        this.freq = freq;
    }


    @Override
    public String toString() {
        return "frequencia{" + "freq=" + freq + '}';
    }
    
    
    private static final Logger LOG = Logger.getLogger(frequencia.class.getName());
    
    
}
