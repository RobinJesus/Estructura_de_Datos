/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Practicas;

import java.util.HashSet;
import java.util.Set;



//----------------------------------------------------Practica 1-----------------------------------------------------------------------------

public class Main {


    public static void main(String[] args) {
        
        
        //p1 utiliza el constructor por defecto
        Practica_1 p1 = new Practica_1();
        
        p1.setNombre("MARIO GONZALEZ");
        p1.setAltura(180);
        p1.setEdad(30);
        p1.setPeso(75);
        p1.setSexo('R');
        
        //Utiliza el constructor con nombre, edad y sexo, el resto por defecto
        Practica_1 p2;        
        p2 = new Practica_1("PEDRO PEREZ", 50, 'W');
        
        //un constructor con todos los parametros 
        Practica_1 p3 = new Practica_1("MARIA PRADO", 25, 'F', "123456789", 52, 165);
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());     
        
    }
    
}

