package Tareas;

/**
 *
 * @author rjesu
 */
public class Vector {
        public static int []devolver(int [] v, int cont){
        if(cont<=v.length-1){
            System.out.println("Dar número ");
            v[cont]= new java.util.Scanner(System.in).nextInt();
            return devolver (v, cont+1);
        }
        return v;
    }
    
    public static int valorMay (int [] numeros,int indice,int may){
        if (indice!=numeros.length){
            if(numeros[indice]>may){
                System.out.print(may);
                System.out.print(numeros[indice]);
                may=valorMay(numeros,indice+1,numeros[indice]);
            }
            else{
                System.out.println("\n");
                System.out.print(may);
                System.out.print(numeros[indice]);
                may= valorMay(numeros, indice + 1,may);
            }
        }
        System.out.println("\n");
        return may;
        
    }
}
