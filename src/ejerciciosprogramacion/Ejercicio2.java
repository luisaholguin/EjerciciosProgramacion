/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejerciciosprogramacion;

import javax.swing.JOptionPane;

/**
 *
 * @authora: Luisa Holguin
 */
public class Ejercicio2 {
     public static void main(String[] args) {
        
        int x,y;
        int resp;
        int bandera=0;
        int i=0;
        String Luisa= " ";
        int v = 0;
        JOptionPane.showMessageDialog(null," EJERCICIO 2 " , "Ejercicios de Programacion ", JOptionPane.INFORMATION_MESSAGE);
        while (bandera==0) {
        x=Integer.parseInt(JOptionPane.showInputDialog("Cual es el valor del entero x"));
        y=Integer.parseInt(JOptionPane.showInputDialog("Cual es el valor del entero y"));
        if (x<=0 || x>255 || y<=0 || y>255)
        {
            resp=-1;
            JOptionPane.showMessageDialog( null, resp);
        }
        else
        {
            int[] arreglo=new int[y];
            arreglo[0]=x;
            for (i = 1; i < arreglo.length; i++) 
            {
               x=x*(i+1);
               arreglo[i]=x;
                System.out.println(i+" "+arreglo[i]);               
            }
            for (i = 0; i < arreglo.length; i++) 
            {
                if(i==(y-1))
                {
                    resp=arreglo[i];
                    JOptionPane.showMessageDialog(null,"Su resultado es " + resp);
                }
            }
         } 
        Luisa = JOptionPane.showInputDialog("Desea continuar ingresando de nuevo otros valores SI=0 , NO=1 ");
        v = Integer.parseInt(Luisa);
        if (v==1)  
            bandera=1;                        
        }       
        JOptionPane.showMessageDialog(null," Fin del ejercicio 2"); 
    }    
}
