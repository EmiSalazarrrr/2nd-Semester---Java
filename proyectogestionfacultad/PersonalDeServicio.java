
package proyectogestionfacultad;

import java.util.Scanner;

public class PersonalDeServicio extends Empleado {
    private String SeleccionAsignada;
    
    //Constructor
    public PersonalDeServicio(String Nombre, String Apellido, int NumeroIdentificacion, 
            String EstadoCivil, int AñoIncorporacion, int NumeroDespacho, String SeleccionAsignada) {
        super(Nombre, Apellido, NumeroIdentificacion, EstadoCivil, AñoIncorporacion, NumeroDespacho);
        this.SeleccionAsignada = SeleccionAsignada;
    }
    //Método para trasladar de sección
    public void TrasladoSeccion(){
        Scanner leer = new Scanner (System.in);
        leer.useDelimiter("\n"); //UseDeLimiter para leer texto en cadena 
        System.out.println("Ingresa la nueva sección a la que será asignado: ");
        SeleccionAsignada = leer.next();
        System.out.println("Nuevo selección asignada correctamente.");
    }
    
    //Método para imprimir información
    @Override
    public void Información(){
        super.Información();
        System.out.println("Selección asignada: " + SeleccionAsignada);
    }
}