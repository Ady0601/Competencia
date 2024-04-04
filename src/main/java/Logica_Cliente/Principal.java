/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import javax.swing.JOptionPane;

/**
 *
 * @author 1002807593
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        boolean x= true;
        while (x){
       String menu=JOptionPane.showInputDialog("Competencia \n" 
                                                                +"1.Registrar Atleta.\n"
                                                               + "2.Datos del campeon.\n"
                                                                + "3.Atletas por pais.\n"
                                                                +"4.Tiempo promedio de todos los atletas.\n"
                                                                +"5.Salir");
       
       int opcion=Integer.parseInt(menu);
       switch (opcion){
           case 1:
    
  String NombreAtleta=JOptionPane.showInputDialog("Ingrese Nombre : ");
             
      break;
     
           case 2:
      String Nombrecampeon=JOptionPane.showInputDialog("Ingrese Nombre : ");         
     String nacionalidad=JOptionPane.showInputDialog("Ingrese Nacionalidad : ");
      String tiempo=JOptionPane.showInputDialog("Ingresar el tiempo : ");
      break;
       
       case 3:
         break;
         
       case 4:
           break;
           
       case 5:
           x = false;
          break;
               
          default:
              System.out.println("Opcion invalida. intente de nuevo. ");
              break;
               
    }
    
}//Finaliza While
    }   
}