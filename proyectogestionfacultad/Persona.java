
package proyectogestionfacultad;

import java.util.Scanner;

public class Persona {
  protected String Nombre;
  protected String Apellidos;
  protected int NumeroIdentificacion;
  protected String EstadoCivil;
  
  
  public Persona(){
      
  }
  
  //Constructor parámetrico
  public Persona (String Nombre, String Apellidos, int NumeroIdentificacion, String EstadoCivil){
      this.Nombre = Nombre;
      this.Apellidos = Apellidos;
      this.NumeroIdentificacion = NumeroIdentificacion;
      this.EstadoCivil = EstadoCivil;
  }
  //Método para cambio de estado civil
  public void CambioEstado(){
      Scanner leer = new Scanner(System.in);
      System.out.println("Ingresa el nuevo estado civil");
      EstadoCivil = leer.next();
      System.out.println("Estado civil cambiado con éxito");
  }
  //Método para mostrar información
  public void Información(){
      System.out.println("Nombre: " +Nombre + 
              "\n Apellidos: " + Apellidos + 
              "\n Identificación: " + NumeroIdentificacion +
              "\n Estado Civil: " + EstadoCivil);
  }
  
  
}