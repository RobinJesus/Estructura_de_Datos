/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TAREAS.tarea2;

/**
 *
 * @author VIBEXZ
 */
import java.util.Scanner;

public class pila {

    Scanner Teclado = new Scanner(System.in);
    Node top;

    public pila() {
        top = null;
    }

    public void ingresarNodo() {

        Node newNode = new Node();

        System.out.println("Ingrese la talla M - S -XS -XL : ");
        System.out.println("Ingrese el Tipo de camisa : ");
        System.out.println("Ingrese el color : ");
        System.out.println("Ingrese el lugar de confeccion : ");
        newNode.talla = Teclado.nextLine();
        newNode.color = Teclado.nextLine();
        newNode.tipoCamisa = Teclado.nextLine();
        newNode.confeccion = Teclado.nextLine();

        newNode.next = top;
        top = newNode;
        

    }
    
    
    public void desplegarPila() {
        Node actual = new Node(); // NODE QUE RECORRE LA PILA, INICIA EN PRIMERO, EL PRIMERO EN LA PULA 
        actual = top;

        if (top != null) {

            while (actual != null) {

                System.out.println("  " + actual.talla);  //IMPRIME EL NODO CON LOS DATOS
                System.out.println("  " + actual.color);  //IMPRIME EL NODO CON LOS DATOS
                System.out.println("  " + actual.tipoCamisa);  //IMPRIME EL NODO CON LOS DATOS
                System.out.println("  " + actual.confeccion);  //IMPRIME EL NODO CON LOS DATOS

                actual = actual.next;   // ACA RECORREMOS LA PILA. 

            }

        } else {
            System.out.print(" \n La pila esta vacia \n");

        }

    }
    
    public void tallasRep() {

        Node actual = new Node(); // NODE QUE RECORRE LA PILA, INICIA EN PRIMERO, EL PRIMERO EN LA PULA 
        actual = top;
        int repetidasm = 0;
        int repetidass = 0;
        int repetidasxs = 0;
        int repetidasxl = 0;

        if (top != null) {

            while (actual != null) {

                if ("m".equals(actual.talla) || "M".equals(actual.talla)) {
                    repetidasm++;
                    actual = actual.next;

                } else if ("s".equals(actual.talla) || "S".equals(actual.talla)) {
                    repetidass++;
                    actual = actual.next;

                } else if ("XS".equals(actual.talla) || "xs".equals(actual.talla)) {
                    repetidasxs++;
                    actual = actual.next;

                }else if ("XL".equals(actual.talla) || "xl".equals(actual.talla)) {
                    repetidasxl++;
                    actual = actual.next;

                }
                

            }
            System.out.println("Cantidad de tallas M repetias : " + repetidasm);
            System.out.println("Cantidad de tallas S repetias : " + repetidass);
            System.out.println("Cantidad de tallas XS repetias : " + repetidasxs);
            System.out.println("Cantidad de tallas XL repetias : " + repetidasxl);

        }

    }

}
