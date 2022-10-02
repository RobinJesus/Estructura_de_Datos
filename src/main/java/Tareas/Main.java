/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tareas;

/**
 *
 * @author rjesu
 */
public class Main {
    
    

    public static void  CrearVector(String[] args) {
        
        System.out.print("Digite el tamaño ");
         int tamaño = new java.util.Scanner(System.in).nextInt();
         int vector []= new int [tamaño];
         
         System.out.println(Vector.devolver(vector, tamaño));
         System.out.println(Vector.valorMay(vector, tamaño, tamaño));
    }
}
