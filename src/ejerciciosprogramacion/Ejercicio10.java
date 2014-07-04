/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejerciciosprogramacion;

import javax.swing.JOptionPane;

/**
 *
 * @authora Luisa Holguin
 */
public class Ejercicio10 {
    public static void main(String args[]) {
      int x,y,S=0;
      int bandera=0;
      String Luisa= " ";
      int v = 0;
      JOptionPane.showMessageDialog(null," EJERCICIO 10 " , " Ejercicios de Programacion ", JOptionPane.INFORMATION_MESSAGE);
      while (bandera==0) {   
        x=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el valor para X "));
        y=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el valor para Y"));
         
        for (int i = x; i <= y; i++) {
            S=0; 
            for (int j = 1  ; j < i; j++) {
                if ((i % j)==0) {
                    S =S+j;
                }
                if ((i==y)&&((i%j)!=0)) {
                    S=0; 
                }
            }
            if (S==i) {
                JOptionPane.showMessageDialog(null, "El primer número perfecto ente "+ x+" y "+y+ " es = " +S);
                i=y;
            }
        }
            if(S==0) {
                JOptionPane.showMessageDialog(null, "no hay números perfectos para "+ x+" y "+y);
            }
          Luisa = JOptionPane.showInputDialog("Desea continuar ingresando de nuevo otros valores SI=0 , NO=1 ");
          v = Integer.parseInt(Luisa);
          if (v==1)  
            bandera=1;                        
          }       
          JOptionPane.showMessageDialog(null," Fin del ejercicio 10 ");
    }
}

