/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tareas;

import TrabajoClase_3.*;

/**
 *
 * @author rjesu
 */
public class node <T> {
    
    private T value;
    private node<T> next;
    private node<T> back;
    
    

    public node(T value) {
        this.value=value;
    }

    public node(node<T> next) {
        this.next = next;
    }
    
    

    public node<T> getNext() {
        return next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    
    public void setNext(node<T> next) {
        this.next = next;
    }     
}
