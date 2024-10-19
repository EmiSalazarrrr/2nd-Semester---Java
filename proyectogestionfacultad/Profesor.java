
package proyectogestionfacultad;

import java.util.Scanner;

public class Profesor extends Empleado{
    private String Departamento;
    
    //Constructor
    public Profesor(String Nombre, String Apellido, int NumeroIdentificacion, 
            String EstadoCivil, int AñoIncorporacion, int NumeroDespacho, String Departamento) {
        super(Nombre, Apellido, NumeroIdentificacion, EstadoCivil, AñoIncorporacion, NumeroDespacho);
        this.Departamento = Departamento;
    }
    //Método para cambiar de departamento
    public void NuevoDepartamento (){
        Scanner leer = new Scanner (System.in);
        leer.useDelimiter("\n"); //UseDeLimiter para leer texto en cadena
        System.out.println("Ingresa el nuevo departamento: ");
        Departamento = leer.next();
        System.out.println("Nuevo departamento asignado.");
    }
    //Método para imprimir información
    @Override
    public void Información(){
        super.Información();
        System.out.println("Departamento: " + Departamento);
    }
}