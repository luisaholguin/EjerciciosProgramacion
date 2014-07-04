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
public class Ejercicio9 {
    public static void main(String[] args) 
    {
      int bandera=0;
      String Luisa= " ";
      int v = 0;
      int numero=0,c=0;
      JOptionPane.showMessageDialog(null," EJERCICIO 9 " , " Ejercicios de Programacion ", JOptionPane.INFORMATION_MESSAGE);
      while (bandera==0) {   
        for (int i = 0; i < 2; i++) 
        {
            numero=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero entero positivo"));
            if (numero>0)
            {
                i=2;               
            }
            else
            {
                i=0;
                JOptionPane.showMessageDialog(null, "Debe de Ingresar Valores Enteros Positivos " );
            }  
        }    
        long[] arreglo=new long[numero];
        for (int i = 0; i < arreglo.length; i++) 
        {
            arreglo[i]=i*i;           
        }
        for (int i = 0; i < arreglo.length; i++) 
        {
            if (numero==arreglo[i])
            {
                i=arreglo.length;
                c=1;
            }
        }
        if (c==1 || numero==1)
        {
            JOptionPane.showMessageDialog(null, "TRUE" );
        }
        else
        {
            JOptionPane.showMessageDialog(null, "FALSE" );
        }  
        Luisa = JOptionPane.showInputDialog("Desea continuar ingresando de nuevo otros valores SI=0 , NO=1 ");
          v = Integer.parseInt(Luisa);
          if (v==1)  
            bandera=1;                        
          }       
          JOptionPane.showMessageDialog(null," Fin del ejercicio 9 "); 
    }    
}
