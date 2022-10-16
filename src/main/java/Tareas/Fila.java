/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tareas;

public class Fila <T>{
    
    private node <T> head;
    private node<T> tail;
    
    public node<T> ingresoPalco1(T value){
        
        node<T> newNode = new node<T> (value);
        
        if(head == null){
            
            head=newNode;
            tail=newNode;
        }
        else{
            tail.setNext(newNode);
            tail = newNode;
        }
        return null;
}
    
        public node<T> ingresoPalco2(T value){
        
            node<T> palco2 = new node<T> (value);
        
    
             if(head == null){
            
                head=palco2;
                tail=palco2;
        }
            else{
                 tail.setNext(palco2);
                 tail = palco2;
        }
        return null;
}
         public node<T> ingresoPalco3(T value){
        
             node<T> palco3 = new node<T> (value);
        
    
             if(head == null){
            
                 head=palco3;
                 tail=palco3;
        }
            else{
                 tail.setNext(palco3);
                 tail = palco3;
        }
        return null;
}
        
         public node<T> ingresoSombra(T value){
        
             node<T> sombra= new node<T>(value);
        
             if (head == null){
                head = sombra;
                tail=sombra;
        }
            else{
                tail.setNext(sombra);
                tail = sombra;
        }
        return null;
    }
        public node<T> ingresoSol1(T value){
        
            node<T> sol= new node<T>(value);
        
             if (head == null){
                head = sol;
                tail=sol;
        }
            else{
                tail.setNext(sol);
                tail = sol;
        }
        return null;
    }
         public node<T> ingresoSol2(T value){
        
            node<T> sol= new node<T>(value);
        
             if (head == null){
                head = sol;
                tail=sol;
        }
             else{
                tail.setNext(sol);
                tail = sol;
        }
        return null;
             
    }

             
 }
   
