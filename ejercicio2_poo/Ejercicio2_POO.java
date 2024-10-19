
package ejercicio2_poo;

import java.util.Scanner;

public class Ejercicio2_POO {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int opcM;
        Libro objLibro = null; //Declaración del objeto.
        
       do{
           System.out.println("¿Qué quieres hacer?"
                   + "1. Dar de alta un libro"
                   + "2. Ver disponibilidad"
                   + "0. Salir");  
           opcM = leer.nextInt();
           switch(opcM){
               case 1: 
                   
           }
       }while(opcM == 0);
    }
    
}
