/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Logica_Negocio.Atleta;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 1002807593
 */
public class AlgoritmosOrdenamiento {

    /**
     * @param args the command line arguments
     */
   

private static ArrayList<Atleta> atletas = new ArrayList();
static Scanner lec= new Scanner(System.in);

 public static void main(String[] args) {
      
     System.out.println("Escribir el numero de tiempos a ingresar");
     int input =lec.nextInt();
     for (int i =0 ; i< input ; i++){
         System.out.println("Digite el tiempo del atleta numero: "+i);
         double tiempoAtleta=lec.nextDouble();
       registrarTiempos(tiempoAtleta);
      
     }//Fin for
     System.out.println("Listado de los tiempos");
     mostrarTiempos(input);

 
     int option=0;
     do{
         System.out.println("1. Ordenar por seleccion");
         System.out.println("2. Ordenar por Insercion");
         System.out.println("3. Ordenar Burbuja");
         System.out.println("4. Salir");
   
         option= lec.nextInt();
         switch (option){
             case 1:
                 ordenarPorSeleccion();
                 mostrarTiempos(input);
                 break;
                         case 2:
                             ordenarPorInsercion();
                             mostrarTiempos(input);
                             
                             break;
                                     case 3:
                                         ordenarPorBurbuja();
                                         mostrarTiempos(input);
                                         break;
                                     case 4:
                                         System.exit(input);
                                         break;
                                         
         }
         
         
         
         
     }while (option!=4);
    
 }//fin main

 public static void registrarTiempos(double tiempo){
     Atleta  nuevoTiempo = new Atleta(tiempo);
     atletas.add (nuevoTiempo);
 }

    public static void mostrarTiempos (double tiempo){
       for (Atleta a:atletas){
        System.out.println(a.getTiempo());
       }
    }
    public static void ordenarPorInsercion(){
        for (int i=1 ; i<atletas.size();i++){
            boolean agregado = false;
            for (int j=i;j>0 && !agregado;j--){
                Atleta uno =atletas.get(j);
                Atleta dos = atletas.get(j-1);
                if(uno.getTiempo()<dos.getTiempo()){
                    atletas.set(j, dos);
                    atletas.set(j-1, uno);
               }else{
                    agregado=true;
                     
                }
            }
        }
    }

public static void ordenarPorSeleccion (){
    for (int i=0 ; i<atletas.size()-1;i++){
    Atleta menor =atletas.get(i);
    int posMenor=i;
    
    for (int j=1;j <atletas.size();j++){
        Atleta actual=atletas.get(j);
        if (actual.getTiempo()<menor.getTiempo()){
            menor =actual;
            posMenor=j;
          
        }
    }
    Atleta temp = atletas.get(0);
    atletas.set(0, menor);
    atletas.set(posMenor, temp);
}
}
public static void  ordenarPorBurbuja(){
    int n=atletas.size();
    for (int i=0; i <n -1;i++){
        for(int j=0;j<n-i;j++){
                Atleta uno= atletas.get(j);
                Atleta dos= atletas.get(j+1);
                if (uno.getTiempo()>dos.getTiempo()){
                   atletas.set(j, dos);
                   atletas.set(j+1, uno);
            }
        }
    }
}
}
