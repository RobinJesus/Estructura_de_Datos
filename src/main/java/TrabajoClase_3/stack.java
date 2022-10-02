/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoClase_3;

/**
 *
 * @author rjesu
 */
public class stack <T>{ 
   // Nuestros atributos
    private node<T>  top;
    
    
    public void push (T value) {
        node <T> newNode = new node<T> (value);
         
         if (top == null){
             
             top = newNode;
         }
         else {
             newNode.setNext(top);
             top = newNode;
         }
    }
    
    public T pop () {
        
        node<T> popped_value = top;
        if (top != null) {
            top = top.getNext();
            return popped_value.getValue();
        }
        else {
            return null;
        }
    }    
}

