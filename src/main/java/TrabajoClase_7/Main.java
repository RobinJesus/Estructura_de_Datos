/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TrabajoClase_7;

/**
 *
 * @author rjesu
 */
public class Main {

    public static void main(String[] args) {

        LinkList Lista = new LinkList();
        
        Lista.insertar(new Persona(1,"P"));
        Lista.insertar(new Persona(3,"P"));
        Lista.insertar(new Persona(2,"P"));
        Lista.imprimirLinkList();
        
        /*List_Simple_Circular List_Circu = new List_Simple_Circular();

        List_Circu.insertar(new Persona(1, "P"));
        List_Circu.insertar(new Persona(3, "P"));
        List_Circu.insertar(new Persona(2, "P"));
        List_Circu.imprimirList_Simple_Circular();*/

    }

}
