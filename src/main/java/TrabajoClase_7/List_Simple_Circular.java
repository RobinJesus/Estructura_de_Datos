/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoClase_7;

/**
 *
 * @author rjesu
 */
public class List_Simple_Circular {

    private node<Persona> head;
    private node<Persona> tail;

    public List_Simple_Circular() {

    }

    public void insertar(Persona value) {

        node<Persona> nuevoNode = new node<Persona>(value);

        if (head == null) {
            head = nuevoNode;
            tail = head;
            tail.setNext(head);
        } 
        else if (head.getValue().getId() > nuevoNode.getValue().getId()) {
            nuevoNode.setNext(head);
            head = nuevoNode;
            tail.setNext(head);
        } 
        else if (head.getValue().getId() < nuevoNode.getValue().getId() && head.getNext() == null) {

            head.setNext(nuevoNode);
        } 
        else if(tail.getValue().getId()<= value.getId()){
            tail.setNext(nuevoNode);
            tail = nuevoNode;
            tail.setNext(head);
        }
        else {
            node<Persona> aux = head;

            while (aux.getNext().getValue().getId() < nuevoNode.getValue().getId()) {
                aux = aux.getNext();
            }

            nuevoNode.setNext(aux.getNext());
            aux.setNext(nuevoNode);
        }
    }

    public void imprimirList_Simple_Circular() {
        node<Persona> aux = head;
        

        while (aux != null) {
            System.out.println(aux.getValue().toString());
            aux = aux.getNext();
        }
        
    }

}