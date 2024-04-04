/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

import java.util.ArrayList;
public class Competencia {
     private ArrayList<Atleta> atletas;
      
     public Competencia(){
         ArrayList<Atleta> atletas = new ArrayList<Atleta>();
     }
     public void nuevoAtleta (){
         atletas.add(new Atleta("Pepito", "Colombia",2,4));
         
     }
}
