/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea2;

/**
 *
 * @author VIBEXZ
 */
import java.util.Scanner;

public class cola {

    Node1 head; //cabeza de la cola
    Node1 tail; // ultimo de la cola
    Scanner Teclado = new Scanner(System.in);
    
    public cola() {
        this.head = null;
        this.tail = null;
    }

    public void ingresoPersona() {

        Node1 newNode = new Node1();
        Node1 aux = new Node1();
        
        
        System.out.print("Ingres un dato: ");
        newNode.dato = Teclado.nextLine();
        
        // SI HEAD ES DIFERENTE DE NULO Y EL DATO DE HEAD ES IGUAL AL DATO DEL NUEVO NODO
        // HEAD VA A APUNTAR A EL NUEVO NODO
        if ( head != null && "Palco".equals(newNode.dato)  ){
            
            
            
            
           
            
            
            

        }
        else if (head == null) {

            head = newNode;
            head.next = null;
            tail = newNode;

        } else {

            tail.next = newNode;
            newNode.next = null;
            tail = newNode;

        }

    }

    

    public void Mostrar() {

        Node1 aux = new Node1();
        aux = head;
        if (head != null) {

            while (aux != null) {
                
                

                System.out.print(" " + aux.dato);
                aux = aux.next;

            }

        } else {

            System.out.print("\n la cola esta vacia\n ");

        }

    }

}
