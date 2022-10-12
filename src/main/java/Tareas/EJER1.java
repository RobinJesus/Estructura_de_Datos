/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tareas;

/**
 *
 * @author VIBEXZ
 */
public class EJER1 {
    
    public static String invertir(int numero) {

        if (numero < 10) {
            return String.valueOf(numero);     //convertimos los valores a string para poder darles la vuelta
                                               // si los dejamos como enteros se va hacer una suma y no va a dar el resultado
                                               // ejemplo si lo dejamos entero y nuestras variable numero es 123 retorna 6 porque se suman por eso se pasan a string
                                              
            
        } else {
            return String.valueOf(numero % 10) + invertir(numero / 10); 
        }

    }

}
