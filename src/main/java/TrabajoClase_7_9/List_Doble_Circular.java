/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoClase_7_9;

/**
 *
 * @author rjesu
 */
public class List_Doble_Circular {

    private node<Persona> head;
    private node<Persona> tail;

    public List_Doble_Circular() {
    }

    public void insertar(Persona value) {

        node<Persona> nuevoNode = new node<Persona>(value);

        if (head == null) {
            head = nuevoNode;
            tail = head;
            tail.setNext(head);
            head.setBack(tail);
        } else if (head.getValue().getId() > nuevoNode.getValue().getId()) {
            nuevoNode.setNext(head);
            head = nuevoNode;
            tail.setNext(head);
        } else if (head.getValue().getId() < nuevoNode.getValue().getId() && head.getNext() == null) {

            head.setNext(nuevoNode);
        } else if (tail.getValue().getId() <= value.getId()) {
            nuevoNode.setBack(tail);
            tail.setNext(nuevoNode);
            tail = nuevoNode;
            tail.setNext(head);
            head.setBack(tail);
        } else {
            node<Persona> aux = head;

            while (aux.getNext().getValue().getId() < nuevoNode.getValue().getId()) {
                aux = aux.getNext();
            }

            nuevoNode.setNext(aux.getNext());
            aux.setNext(nuevoNode);
            aux.getNext().setBack(nuevoNode);
            nuevoNode.setBack(aux);
        }
    }

    public void imprimirList_Simple_Circular() {
        node<Persona> aux = head;

        while (aux != null) {
            System.out.println(aux.getValue().toString());
            aux = aux.getNext();
        }

    }

    public boolean existe(int id) {
        
        boolean existe = false;
        

        return existe;
    }

    public void modificar(Persona p) {

    }

    public void elimina(int id) {

        node<Persona> aux = head;
        
        if(aux != null){
          
        while (aux.getNext().getValue().getId() == id) {
            aux = aux.getNext();
            
            System.out.println(aux);
        }

    }
}
public Persona extrae(int in){
        Persona p=null;
        
        
        return p;
    }
}
