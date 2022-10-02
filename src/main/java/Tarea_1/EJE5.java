/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TAREAS.tarea1;

/**
 *
 * @author VIBEXZ
 */
public class EJE5 {
    
    public static String tabla(int a, int d){
        if (a==1){
            return d+" x "+1+" = "+d+"\n";
        }else{
            int b;
            b=a;
            return tabla(a-1,d)+d+" x "+b+" = "+(d*b)+"\n";
        }
    
    }
    
    
}
