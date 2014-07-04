/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejerciciosprogramacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @authora: Luisa Holguin
 */
public class Ejercicio6 {
    public static void main(String [] args)throws IOException {
     int bandera=0;
      String Luisa= " ";
      int v = 0;
      JOptionPane.showMessageDialog(null," EJERCICIO 6 " , " Ejercicios de Programacion ", JOptionPane.INFORMATION_MESSAGE);
      while (bandera==0) {
      BufferedReader a=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Ingrese una frase : ");
      String frase=a.readLine();
      String []palabra=frase.split(" ");
      for(int i=palabra.length-1;i>=0;i--){
          //System.out.println("Resultado de la frase");
          System.out.print(palabra[i]+ " " );       
       }
      Luisa = JOptionPane.showInputDialog("Desea continuar ingresando de nuevo otros valores SI=0 , NO=1 ");
          v = Integer.parseInt(Luisa);
          if (v==1)  
            bandera=1;                        
          }       
          JOptionPane.showMessageDialog(null," Fin del ejercicio 6 "); 
    }
    
}

