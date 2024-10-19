
package libro.poo;

import java.util.Scanner;

public class LibroPOO {

    public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
    int opc, i=-1; //i indica la posición del último Libro agregado
    Libro Libros [] = new Libro [25];    
    do{
        System.out.println("1. Agregar un Nuevo Libro"
                + "2. Mostrar todos los libros."
                + "0 Terminar.");
        System.out.println("Opción: ");
        opc = leer.nextInt();
        switch (opc){
            case 1:
                System.out.println("Agregar Libro Nuevo.");
                System.out.println("Ingresa los siguientes datos.");
                System.out.println("Título \tAutor \tEditorial");
                Libros[++i] = new Libro(leer.next(),leer.next(),leer.next());
                break;
            case 2: 
                System.out.println("Libros Registrados" + (i+1));
                for (int j = 0; j <=i ; j++){
                    System.out.println(" Libro "+(j+1));
                    System.out.println("Titulo: "+Libros[j].getTitulo());
                    System.out.println("Autor: "+Libros[j].getAutor());
                    System.out.println("Editorial: "+Libros[j].getEditorial());
                    if (Libros[j].isDisponibilidad())
                        System.out.println("Libro Disponible.");
                    else
                        System.out.println("Libro en préstamo.");
            }
                break;
        }
    }while (opc != 0);
    }
    
}
