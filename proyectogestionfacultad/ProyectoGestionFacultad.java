package proyectogestionfacultad;

import java.util.Scanner;

public class ProyectoGestionFacultad {

    public static void main(String[] args) {
      Scanner leer = new Scanner (System.in);
      leer.useDelimiter("\n");
      int opc, N, n = 0, Cambios, opc2; //Se usará la variable "Cambios" para usar solo una variable y ahorrar espacio en memoria
       System.out.print("Cantidad de Personas máxima = ");
       N = leer.nextInt();
       Persona RegistroPersonas[] = new Persona[N];  
       
       
       do{
          System.out.println("Ingresa la acción que quieres realizar.");
          System.out.println("1. Registrar personas."
                  + "\n 2. Cambio de estado civil. "
                  + "\n 3. Reasignación de despacho. "
                  + "\n 4. Matriculación de nuevo curso a un estudiante. "
                  + "\n 5. Cambio de departamento de un profesor. "
                  + "\n 6. Traslado de sección de un empleado del personal de servicio. "
                  + "\n 7. Imprimir toda la información de cada tipo de individuo. "
                  + "\n 0. Salir. ");
          System.out.println("Opción: ");
           opc = leer.nextInt();
           
           //Inicio del menú
           switch (opc){
               case 1:
                   if (n<N)
                       RegistroPersonas[n++] = RegistraPersona();
                   else 
                       System.out.println("Fuera de rango. . \n");
                   break;
               case 2: 
                   System.out.println("¿De qué posición quieres cambiar el estado civil?");
                   Cambios = leer.nextInt();
                   RegistroPersonas[Cambios].CambioEstado();
                   break;
               case 3:
                   System.out.println("¿De qué posición quieres cambiar el despacho?");
                   Cambios = leer.nextInt();
                   if (RegistroPersonas[Cambios] instanceof Empleado)
                      ((Empleado)RegistroPersonas[Cambios]).ReasignarDespacho(); 
                   //Uso el CAST para asignar el objeto como empleado y así usar el método de Reasignación de despacho
                   else 
                       System.out.println("En esta posición no hay un empleado.");
                   break;
               case 4: 
                   System.out.println("¿De qué posición quieres cambiar el curso matriculado?");
                   Cambios = leer.nextInt();
                   if (RegistroPersonas[Cambios] instanceof Estudiante)
                       ((Estudiante)RegistroPersonas[Cambios]).MatricularCurso();
                   else 
                       System.out.println("En esta posición no hay un estudiante.");
                   break;
               case 5: 
                   System.out.println("¿En qué posición se encuentra el profesor al que desea cambiar de departamento?");
                   Cambios = leer.nextInt();
                   if (RegistroPersonas[Cambios] instanceof Profesor)
                       ((Profesor)RegistroPersonas[Cambios]).NuevoDepartamento();
                   else 
                       System.out.println("En esta posición no existe un profesor");
                   break;
               case 6: 
                   System.out.println("¿En qué posición está el personal de servicio que deseas cambiar?");
                   Cambios = leer.nextInt();
                   if (RegistroPersonas[Cambios] instanceof PersonalDeServicio)
                       ((PersonalDeServicio)RegistroPersonas[Cambios]).TrasladoSeccion();
                   else
                       System.out.println("En esta posición no hay un personal de servicio.");
                   break;
               case 7: 
                   System.out.println("Ingresa que tipo de personas quieres que visualizar: "
                           + "\n 1. Estudiantes."
                           + "\n 2. Profesores."
                           + "\n 3. Personales de servicio.");
                   opc2 = leer.nextInt();
                   switch (opc2){
                       case 1:
                           for (int x = 0; x<N; x++){
                               if (RegistroPersonas[x] instanceof Estudiante)
                                   ((Estudiante)RegistroPersonas[x]).Información();
                           }
                           break;
                       case 2: 
                           for (int x = 0; x<N; x++){
                               if (RegistroPersonas[x] instanceof Profesor)
                                    ((Profesor)RegistroPersonas[x]).Información();
                           }
                           break;
                       case 3:
                           for (int x = 0; x<N; x++){
                               if (RegistroPersonas[x] instanceof PersonalDeServicio)
                                   ((PersonalDeServicio)RegistroPersonas[x]).Información();
                           }
                           break;
                   }
                   break;
           }
           
      }while (opc != 0);
      
    } // Fin del main.
    
    public static Persona RegistraPersona(){
        Persona objPersona = null;
        Scanner leer = new Scanner(System.in);
        leer.useDelimiter("\n");
        int opc;
        System.out.println("Selecciona el tipo de Persona"
                + "\n1. Estudiante."
                + "\n2. Profesor."
                + "\n3. Personal de servicio.");
        opc = leer.nextInt();
        switch (opc){
            case 1:
                System.out.println("Ingresa los datos del ESTUDIANTE: "
                        + "\nNombre. \tApellidos. \tNumero de identificación."
                        + "\tEstado civil. \tCurso matriculado.");
                objPersona = new Estudiante (leer.next(), leer.next(), 
                        leer.nextInt(), leer.next(), leer.next());
                break;
            case 2: 
                System.out.println("Ingresa los datos del PROFESOR: "
                        + "\nNombre. \t Apellidos. \tNúmero de identificación."
                        + "\tEstado civil. \tAño de incorporación. \tNúmero de despacho."
                        + "\tDepartamento");
                objPersona = new Profesor (leer.next(), leer.next(), leer.nextInt(),
                        leer.next(), leer.nextInt(), leer.nextInt(), leer.next());
                break; 
            case 3: 
                System.out.println("Ingresa los datos del PERSONAL DE SERVICIO: "
                        + "\nNombre. \t Apellidos. \tNúmero de identificación."
                        + "\tEstado civil. \tAño de incorporación. \tNúmero de despacho."
                        + "\t Seleccion asignada");
                objPersona = new PersonalDeServicio (leer.next(), leer.next(),
                        leer.nextInt(), leer.next(), leer.nextInt(), leer.nextInt(), leer.next());
                break;
        }
        return objPersona;
    }
    
}