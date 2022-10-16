/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tareas;

/**
 *
 * @author VIBEXZ
 */
//import static TAREAS.tarea.EJE2.anagrama;
import static Tareas.EJER4.recurSum;
import java.util.Arrays;
import javax.swing.JOptionPane;
import tarea2.cola;

public class tarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //--------------------------------------------------------------TAREA 1------------------------------------------
        
        //--------------------------------------------------------------EJERCICIO 1---------------------------------------
        //System.out.println(EJER1.invertir(12336));
        //--------------------------------------------------------------EJERCICIO 2----------------------------------------
        /*
        
        
        String palabra = "hola";
        System.out.println(EJE2.eje2(palabra));
        */
        
        
       
         
        //--------------------------------------------------------------EJERCICIO 3----------------------------------------
        /*
         System.out.print("Digite el tamaño ");
         int tamaño = new java.util.Scanner(System.in).nextInt();
         int vector []= new int [tamaño];
         
         System.out.println(Arrays.toString(EJE2.devolver(vector, tamaño)));
         System.out.println(EJE2.valorMay(vector, tamaño, tamaño));
         */
        //---------------------------------------------------------------EJERCICIO 4-----------------------------------------
        /*
        
        int n = 10;
        System.out.println(recurSum(n));
        
         */
        
        //---------------------------------------------------------------EJERCICIO 5------------------------------------------
        /*
        int d;
        String val;
        val = JOptionPane.showInputDialog("Digite el numero de la tabla de multiplicar vas a utilizar");
        d = Integer.parseInt(val);
        System.out.println(EJE5.tabla(10, d));

         */
        //--------------------------------------------------------------TAREA 2------------------------------------------
        
        //--------------------------------------------------------------EJERCICIO 1---------------------------------------
        
        
         //-------------------------------------------------------------EJERCICIO 2----------------------------------------
         
         
          //------------------------------------------------------------EJERCICIO 3----------------------------------------
         Fila<Integer> Fila = new Fila<Integer>();
          
          Fila.ingresoPalco1(16);
          Fila.ingresoPalco2(17);
          Fila.ingresoPalco3(18);
          Fila.ingresoSombra(18);
          Fila.ingresoSol1(604170273);
          Fila.ingresoSol2(604560275);
          
         for (int i=0;i<17;i++){
             Fila.ingresoPalco1(i);
             System.out.println(Fila.ingresoPalco1(i));
         }

          }
           
        /* cola cola1 = new cola();
         cola1.ingresoPersona();
         cola1.ingresoPersona();
         cola1.ingresoPersona();
         cola1.Mostrar();*/
        
        
        
        
         
}
