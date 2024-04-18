/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

import java.util.ArrayList;
import java.util.Collections;
public class Competencia {
     private ArrayList<Atleta> atletas;
      
     public Competencia(){
       atletas = new ArrayList<>();
     }
     public void registrarAtleta (String nombre, String nacionalidad, double tiempo){
     Atleta nuevoAtleta =new Atleta(nombre, nacionalidad);
     Atleta nuevoAtleta1 =new Atleta(tiempo);
     atletas.add(nuevoAtleta);
    
     }
     public Atleta encontrarCampeon(){
         Atleta campeon =atletas.get(0);
         for (Atleta atleta:atletas){
             if (atleta.getTiempo()< campeon.getTiempo()){
         campeon=atleta;    
         }//fin if
         }//fin for
     return campeon; 
    }
     public double binarySearch(ArrayList<Atleta>atletas, double tiempo){
        // Collections.sort(atletas.atletas);
        int left=0;
        int rigth =atletas.size()-1;
        while (left<=rigth){
            int mid =left +(rigth-left)/2;//indice a la mitad
            //Tomar el valor mid y preguntar si podemos bi
            for(Atleta atleta:atletas){
                if(tiempo==atleta.getTiempo()){
                 double tiempo2=tiempo;
                
                    //Campeon =atleta
                    
                }
            }
        }
         return 0;
     }
             
         public ArrayList <String>atletasPorPais(String pais){
              ArrayList<String>atletaPorPais=new ArrayList<>();
                for (Atleta atleta:atletas){
                if (atleta.getNacionalidad().equalsIgnoreCase(pais)){
                atletaPorPais.add(atleta.getNombre());
         }//fin if
         }//fin for
 
           return atletaPorPais;

    }
         
  }
     
