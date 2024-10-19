
package proyectogestionfacultad;

import java.util.Scanner;

public class Estudiante extends Persona{
        private String CursoMatriculado;
        
        //Constructor
        public Estudiante(String Nombre, String Apellido, 
                int NumeroIdentificacion, String EstadoCivil, String CursoMatriculado){
            super (Nombre, Apellido, NumeroIdentificacion, EstadoCivil);
            this.CursoMatriculado = CursoMatriculado;
        }
        
        //Método para Matriculación de un estudiante en un nuevo curso 
        public void MatricularCurso(){
            Scanner leer = new Scanner (System.in);
            leer.useDelimiter("\n"); //UseDeLimiter para leer texto en cadena
            System.out.println("Asigna en que curso estará");
            CursoMatriculado = leer.next();
            System.out.println("Curso matriculado asignado correctamente.");
        }
        
        //Método para imprimir información
        @Override 
        public void Información(){
            super.Información();
            System.out.println("Curso Matriculado: " + CursoMatriculado);
        }
}