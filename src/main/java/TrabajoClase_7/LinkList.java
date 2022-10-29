/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoClase_7;

/**
 *
 * @author rjesu
 */
public class LinkList {
    
    private node<Persona> cabeza;
    
    
    public LinkList(){
        
    }
    
    public void insertar(Persona value){
        
        node <Persona> nuevoNode = new node <Persona>(value);
        
        if (cabeza ==null){
            cabeza = nuevoNode;
        }
        else if(cabeza.getValue().getId()>nuevoNode.getValue().getId()){
            nuevoNode.setNext(cabeza);
            cabeza = nuevoNode;
        }
        
        else if(cabeza.getValue().getId()<nuevoNode.getValue().getId()&&cabeza.getNext()==null){
            
            cabeza.setNext(nuevoNode);           
        }
        else{
            node <Persona> aux = cabeza;
            
            while(aux.getNext()!= null && aux.getNext().getValue().getId()< nuevoNode.getValue().getId()){
                aux = aux.getNext();
            }
            
            nuevoNode.setNext(aux.getNext());
            aux.setNext(aux);
        }
    }
    public void imprimirLinkList(){
        node <Persona> aux = cabeza;
        
        while (aux!= null){
            System.out.println(aux.getValue().toString());
            aux = aux.getNext();
        }
    }
    
    public void eliminarLinkList(){
        
    }
    
}
