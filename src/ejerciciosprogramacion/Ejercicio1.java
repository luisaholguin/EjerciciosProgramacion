/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejerciciosprogramacion;

import javax.swing.JOptionPane;

/**
 *
 * @author Pc
 */
public class Ejercicio1 {
    public static void main(String[] args) {
    JOptionPane.showMessageDialog(null," EJERCICIO 1 " , "Ejercicios de Programacion ", JOptionPane.INFORMATION_MESSAGE);
        int x=0, y=0, z; 
        int a=7, b=6, resp=0;
        int bandera=0;
        int i=0;
        String Luisa=" ";
        int v = 0;
        int[] arreglo1=new int[128];
        int[] arreglo2=new int[128];
        int[] arreglo3=new int[255];
        while (bandera==0) {
        for ( i = 0; i <= 127; i++) 
        {            
            arreglo1[i]=a;
            a=a+1;         
        }
        for (int j = 0; j <= 127; j++) 
        {            
            arreglo2[j]=b;
            b=b-2;
            
        }
        a=0;
        for ( i = 0; i < 255; i++) 
        {
            z=i % 2;
            if (z==0)
            {
             arreglo3[i]=arreglo1[a];
             
            }
            else
            {                
                arreglo3[i]=arreglo2[a]; 
                a=a+1;
            }
            System.out.println(i+" "+arreglo3[i]);                    
        }
        x=Integer.parseInt(JOptionPane.showInputDialog("Cual es el valor del entero de x " ));
        y=Integer.parseInt(JOptionPane.showInputDialog("Cual es el valor del entero de y " ));
        if (x<=0 || x>255 || y<=0 || y>255)
        {
            resp=-1;
        }
        else
        {
            for ( i = 0; i <255; i++) 
            {
                if (x==(i+1))
                {
                    a=arreglo3[i];
                }
                else
                {
                    if (y==(i+1))
                    {
                        b=arreglo3[i];
                    }
                    
                }
            }
            resp=a+b;
        }
        JOptionPane.showMessageDialog(null, "  Su resultado es  "  + resp);
        Luisa = JOptionPane.showInputDialog("Desea continuar ingresando de nuevo otros valores SI=0 , NO=1 ");
        v = Integer.parseInt(Luisa);
        if (v==1)  
            bandera=1;                    
        } 
        JOptionPane.showMessageDialog(null," Fin del ejercicio 1"); //fin del ejercicio
    }    
}

