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
public class Ejercicio5 {
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int c=0;
        int bandera=0;
        String Luisa= " ";
        int v = 0;
        JOptionPane.showMessageDialog(null," EJERCICIO 5 " , " Ejercicios de Programacion ", JOptionPane.INFORMATION_MESSAGE);
        while (bandera==0) {
        int n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos numeros desea ingresar"));
        int[] arreglo=new int[n];
        
        for (int i = 0; i < arreglo.length; i++) {
            
            int numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero"));
            arreglo[i]=numero;
        }
                
        System.out.println("Arreglo De Entrada");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]);
        }
        System.out.println("");
         int i, j, aux;
         for(i=0;i<arreglo.length-1;i++)
              for(j=0;j<arreglo.length-i-1;j++)
                   if(arreglo[j+1]<arreglo[j]){
                      aux=arreglo[j+1];
                      arreglo[j+1]=arreglo[j];
                      arreglo[j]=aux;
                   } 
         System.out.println("Arreglo de numeros ordenado");
         for ( i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]);
        }
         System.out.println("Arreglo Sin Numeros Repetidos");
         int a1;
         for ( i = 0; i < arreglo.length; i++) {
             if (i==0) {
             System.out.print(arreglo[i]);
             }
             else
             {
                 a1=i-1;
                 aux=arreglo[i];
             if (aux==arreglo[a1]) {
                 
             }else{
                 System.out.println(arreglo[i]);
             }
             }                     
        }
        Luisa = JOptionPane.showInputDialog("Desea continuar ingresando de nuevo otros valores SI=0 , NO=1 ");
        v = Integer.parseInt(Luisa);
        if (v==1)  
            bandera=1;                        
        }       
        JOptionPane.showMessageDialog(null," Fin del ejercicio 5 ");    
    }
}

