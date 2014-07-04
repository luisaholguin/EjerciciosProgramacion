/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejerciciosprogramacion;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @authora: Luisa Holguin
 */
public class Ejercicio4 {
public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);       
        String S1="";
        String S2="";
        int bandera=0;
        int i=0;
        String Luisa= " ";
        int v = 0;
        JOptionPane.showMessageDialog(null," EJERCICIO 4 " , " Ejercicios de Programacion ", JOptionPane.INFORMATION_MESSAGE);
        while (bandera==0) {
         S1=(JOptionPane.showInputDialog("Ingrese la primer frase "));
         S2=(JOptionPane.showInputDialog("Ingrese la segunda frase "));
        
         int longitud1=S1.length();
         int longitud2=S2.length();
        // char[]  arreglo1 = new char[longitud1];
        // char[] aCaracteres;
         char[] frase1 = S1.toCharArray();
          char[] frase2 = S2.toCharArray(); 
          for ( i = 0; i < longitud2; i++)
          {
              for (int j = 0; j < longitud1; j++) 
              {
                  if (frase1[j]== frase2[i]) 
                  {
                      frase1[j]=' ';
                  }
              }
          }       
           for ( i=0;i<frase1.length;i++)
               if (frase1[i]!=' ') {
                   System.out.println(" " + frase1[i]);
               }
            Luisa = JOptionPane.showInputDialog("Desea continuar ingresando de nuevo otros valores SI=0 , NO=1 ");
        v = Integer.parseInt(Luisa);
        if (v==1)  
            bandera=1;                        
        }       
        JOptionPane.showMessageDialog(null," Fin del ejercicio 4 "); 
          
    }
    
}
