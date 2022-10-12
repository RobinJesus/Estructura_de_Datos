/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicas;

/**
 *
 * @author rjesu
 */
//Las clases con como plantillas que se utilizan para la creación de objetos
public class Practica_1 {
   private String nombre;
   private char Sexo;
   private int Edad;
   private String Cedula;
   private double peso;
   private double altura;
//Los atributos se definen como privados
   
   
   public final int PESOBAJO = -1;
   public final int PESOIDEAL = 0;
   public final int SOBREPESO = 1;
   


   
   public Practica_1()
   {
       
       nombre = "";
       Sexo = 'F';
       Edad = 20;
       Cedula = "999999999";
       peso = 50;
       altura = 160;       
   }
    //Un constructor con el nombre, edad y sexo, el resto por defecto.   
   public Practica_1(String pNombre, int pEdad, char pSexo)
   {
       nombre = pNombre;
       Sexo = comprobarSexo(pSexo);
       Edad = pEdad;
       Cedula = "999999999";
       peso = 50;
       altura = 160;       
   }
   
//Un constructor con todos los atributos como parámetro.
   public Practica_1(String pNombre, int pEdad, char pSexo, 
                    String pCedula, double pPeso, double pAltura)
   {
       nombre = pNombre;
       Sexo = pSexo;
       Edad = pEdad;
       Cedula = pCedula;
       peso = pPeso;
       altura = pAltura;       
   }
   
   //se crea un metodo integer
   public int calcularIMC()
   {
       int retorno=0;
       double AlturaenM=0;
       double imc=0;
       AlturaenM = this.altura/100;                     
       //(peso en kg/(altura^2  en m))
       
       imc = this.peso / Math.pow(AlturaenM,2);       
       /*
        si esta fórmula devuelve un valor menor que 20, la función devuelve un -1, 
        si devuelve un número entre 20 y 25 (incluidos), 
        significa que esta en su peso ideal la función devuelve un 0  
        y si devuelve un valor mayor que 25 significa que tiene sobrepeso, 
        la función devuelve un 1. 
        if(1==0)
        {
            bloque de codigo el if
            cuando el bloque tiene mas de una linea de codigo obligatoriamente
            se usan llaves {}
            si el bloque es de una sola linea, las llaves {} son opcionales
        }      
       */
//Se utilizan condiciones para obtener el dato
       if(imc < 18)
           retorno = PESOBAJO;
       else if(imc >=18 && imc <=25)
           retorno = PESOIDEAL;    
       else if(imc > 25)
           retorno = SOBREPESO;
       
       return retorno;
   }
   
   private char comprobarSexo(char pSexo)
   {
       char retorno;
       if(pSexo != 'H' && pSexo != 'F')
           retorno = 'F';
       else
           retorno=pSexo;
       
       return retorno;
   }
//Se generan los get and set de los atributos indicados, toda a su ves lograr obtener el dato en el principal.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char Sexo) {
        this.Sexo = comprobarSexo(Sexo);
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double RetornarIMC()
    {
       double retorno=0;
       double imc=0;
       double alturaM=0;
       //(peso en kg/(altura^2  en m)), 
       
       alturaM = altura/100;
       
       imc = peso/Math.pow(alturaM, 2);
       
        return imc;
    }
    
    //Se crea un toString, el cual obtiene toda la información que se muestra en el Main.
    public String toString()
    { 
        String retorno="";
       
        retorno = "======================================== \n";
        retorno+= "         INFORMACIÓN DE LA PERSONA       \n";
        retorno+= "======================================== \n";        
        retorno+= "Nombre: " + this.nombre + "\n";
        retorno+= "Edad: " + this.Edad + "\n";
        retorno+= "Sexo: " + this.Sexo + "\n";
        retorno+= "Altura: " + this.altura + " cms \n";
        retorno+= "Peso: " + this.peso + " kg \n";
        retorno+= "Valor IMC: " + this.RetornarIMC() + " \n";
        if(this.calcularIMC() == PESOBAJO)
        {
            retorno+= "IMC: PESO BAJO\n";            
        }
        else if(this.calcularIMC() == PESOIDEAL)
            retorno+= "IMC: PESO IDEAL\n";
        else if(this.calcularIMC() == SOBREPESO)        
            retorno+= "IMC: SOBRE PESO\n";
        
        retorno+= "======================================== \n";                                
        
        return retorno;
    }


}
