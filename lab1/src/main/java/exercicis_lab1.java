/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mariona farre
 */
import java.util.*;
import java.util.Scanner;

public class exercicis_lab1 {
    
    //tot entrar dins de la mateixa classe- static main per executar codi
    
    public static void main(String [] args){
        
        System.out.println("Bon dia!");
       /* String nom;
        int edat;
        
        Scanner inputDevice=new Scanner(System.in);
        System.out.print("Entra el teu nom>>");
              
        nom=inputDevice.nextLine();
        System.out.print("Entra la teva edat>>");
        edat=inputDevice.nextInt();
        System.out.println("El teu nom es "+ nom+" i tens "+ edat+" anys.");
        */
        //exercici
        //llegir un sencer,N per teclat 
        //llegir N paraules sense repeticions- si repeticions missatge error i 
        //ignorar paraula
        
        int N;
        Scanner intscanner=new Scanner(System.in);
        System.out.println("Entra numero de paraules>> ");

        N=intscanner.nextInt();
           
        String paraules[]= new String[N];
        
        String paraula;
        
        System.out.println("Escriu les paraules: ");
        /*
        for(int i=0;i<paraules.length;++i){
            
            paraula=intscanner.nextLine();

            boolean trobat= no_repetit(paraules,paraula);
            
            System.out.println("repetit o no");
            if(trobat==false){ paraules[i]=paraula; }
           
        }*/
        int w=0;
        while(w<paraules.length){
            
            paraula=intscanner.next();
                    
            boolean trobat= no_repetit(paraules,paraula);
            
            if(trobat==false){
                paraules[w]=paraula; 
                ++w;
            }else{
               System.out.println("Paraula repetida, entra una altre paraula: ");               
            } 
        }

        System.out.println("Les paraules per pantalla: ");

        for(int i=0;i<paraules.length;++i){
            System.out.println(paraules[i]);
        }

        //Encastar les paraules guardades- totes parelles possibles
        //Si sufix d'una==prefix de la seguent GAT- TORTUGA => TORTUGAT/GATORTUGA
       
        System.out.println("Encastar les paraules: ");
        
        for(int i=0;i<paraules.length;++i){
            
            System.out.println(">> "+paraules[i]+" Encastat amb: ");
            
            String[] encastades= new String[paraules.length];

            encastades=encastat(paraules,paraules[i]);

            for(int j=0;j<encastades.length;++j){ 
                if(encastades[j]!=null)System.out.println(encastades[j]);
            }
        }
        
    }
    
    public static boolean no_repetit(String[] p, String paraula){
        int i=0;
        boolean trobat=false;
        while(i<p.length && trobat==false && p[i]!=null){
            if(p[i].contentEquals(paraula))trobat=true;
            else ++i;
        }
        return trobat;
        
    }
    
    public static String[] encastat(String[] p, String paraula){
        //tenir sufix(final) de paraula i prefix(inici) de les paraules      
        List<String> resultat=new ArrayList<>();
        
        for(String word:p){
            //recorre tot el array de paraules - mirar condicio - si si guardar
            //paraula encastads
            //si sufix (final)de paraula= prefix(starts) p[i] == encastar
            System.out.println("Encastar paraules" +paraula+":"+word);
            
            int n=paraula.length(); //utlima lletra
            int t=word.length();
            
            int midamitjana=Math.min(n,t);
            int r=0; //lletres q coincideixen 
            
          //  System.out.println(+paraula.charAt(n)+":"+word.charAt(t));

            while(r<midamitjana && paraula.charAt(n-midamitjana-1)==word.charAt(midamitjana)){
                midamitjana++;
            }
            
            if(midamitjana>0){
                String encastada=paraula+word.substring(midamitjana);
                 resultat.add(encastada);
                
                System.out.println("Encastada "+encastada);
            }
                    
        }
        return resultat.toArray(new String[0]);
    }

    
}
