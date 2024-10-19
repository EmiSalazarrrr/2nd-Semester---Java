
package proyectogestionfacultad;

import java.util.Scanner;

public class Empleado extends Persona {
    //Los atributos serán protected porque serán heredados a las clases Profesor y PersonalDeServicio
    protected int AñoIncorporacion;
    protected int NumeroDespacho;
    
    
    //Constructor
    public Empleado (String Nombre, String Apellido, int NumeroIdentificacion, String EstadoCivil, 
            int AñoIncorporacion, int NumeroDespacho){
        super (Nombre, Apellido, NumeroIdentificacion, EstadoCivil);
        this.AñoIncorporacion = AñoIncorporacion;
        this.NumeroDespacho = NumeroDespacho;
    }
    
    //Método para reasignarDespacho
    public void ReasignarDespacho(){
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingresa el nuevo Numero de despacho: ");
        NumeroDespacho = leer.nextInt();
        System.out.println("Nuevo despacho asignado.");
    }
    
    //Método para imprimir información
    @Override
    public void Información(){
        super.Información();
        System.out.println("Año de incorporación: " + AñoIncorporacion + 
                "\n Número de despacho: " + NumeroDespacho);
    }
}