/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TAREAS.tarea2;

import static java.lang.Math.pow;

/**
 *
 * @author VIBEXZ
 */
public class SerieTaylor {

    /**
     *
     * N ES UN NUMERO QUE EMPIEZA EN 0 Y VA INCREMENTANDO CON CADA ITERACION. X
     * ES UN CONSTANTE. N ES EL NUMERO MÁXIMO DE INTERACIONES QUE SE VAN A HACER
     */
    public static double coseno(double x, int n) {

        if (n == 0) {

            return 1;

        } else {

            return Math.pow(-1, n) * Math.pow(x, 2 * n) / factorial(2 * n) + coseno(x, n - 1);

        }

    }

    public static int factorial(int n) {
        if (n <= 1) {
            return 1;                                 //ESTE YA LO HABIAMOS HECHO EN CLASE

        } else {
            return n * factorial(n - 1);

        }

    }

    //prueba para ver si esta bueno 
    public static double l(double x) {
        int i;
        double s = 0;
        int signo = 1;

        for (i = 0; i < 10; i += 2) {

            s += signo * pow(x, i) / factorial(i);
            signo *= -1;

        }

        return s;
    }

}
