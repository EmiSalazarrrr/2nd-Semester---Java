/*
El equipo para este proyecto está conformado por:
López Vega Kevin Guadalupe
Morán Arechiga Karol Gabriel
Salazar Figueroa Joel Emiliano

Y el tema que se hará para el proyecto será una AGENDA!!
*/
package proyectoarchivos;

import java.util.Scanner;

public class ProyectoArchivos {

    public static void main(String[] args) {
        //Creacción de los objetos
        Agenda Agenda = new Agenda();
        Scanner leer = new Scanner (System.in);
        int opc;
        String NuevoContacto, ContactoAEliminar;
        
        do{
            System.out.println("Menú: \n"
                    + "1. Agregar contacto. \n"
                    + "2. Ordenar contactos. \n"
                    + "3. Mostrar reporte de contactos. \n"
                    + "4. Eliminar contacto. \n"
                    + "5. Salir. \n"
                    + "Seleccione una opción: ");
            opc = leer.nextInt();
            leer.nextLine(); //Limpiar el buffer
            switch (opc){
                case 1:
                    System.out.println("Ingrese el nombre del contacto: ");
                    NuevoContacto = leer.next();
                    Agenda.AgregarContacto(NuevoContacto);
                    break;
                case 2:
                    Agenda.OrdenarContactos();
                    System.out.println("Contactos ordenados.");
                    break;
                case 3:
                    Agenda.MostrarContactos();
                    break;
                case 4:
                    System.out.println("Ingrese el nombre del contacto a eliminar: ");
                    ContactoAEliminar = leer.next();
                    Agenda.EliminarContactos(ContactoAEliminar);
                    break;
                case 5:
                    Agenda.GuardarEnArchivo(); 
                    System.out.println("Contactos guardados y programa finalizado.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }while (opc != 5);
    }
    
}