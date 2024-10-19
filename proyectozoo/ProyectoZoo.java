//Hice equipo con Emilio Rodrigo Ayala Reynoso
package proyectozoo;

import java.util.Scanner;

public class ProyectoZoo {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int opc, N=0, ARC;
        boolean encontrado = false;
        System.out.println("Ingresa el numero de Zoo´s a registrar: ");
        N = leer.nextInt();
        Zoo ObjZoo[] = new Zoo[N];  
        for (int i = 0; i<N; i++ )
            ObjZoo[i] = new Zoo();
        do{
            System.out.println("1. Agregar Zoo. \n"
                    + "2. Modificar estado del Zoo. \n"
                    + "3. Mostrar todos los Zoo´s. \n"
                    + "4. Mostrar todos los zoo's en un estado específico. \n"
                    + "0. Terminar. \n"
                    + "Selecciona una opción: "); 
            opc = leer.nextInt();
            switch (opc){
                case 1:
                    System.out.println("A cuál zoo vas a agregar?");   
                    N = leer.nextInt();
                    ObjZoo[N-1].AgregarZoo();
                    break;
                case 2:
                    System.out.println("¿A cuál zoologico quieres cambiar?");
                    N = leer.nextInt();
                    ObjZoo[N-1].CambiarEstado();
                    break;
                case 3:
                    for (int i = 0; i<N; i++)
                    ObjZoo[i].MostrarZoo();
                    break;
                case 4:
                    System.out.println("1. Abierto al publico. \n"
                            + "2. En remodelación. \n"
                            + "3. Cerrado");
                    ARC = leer.nextInt();
                    for (int i = 0; i <N; i++){
                        if (ObjZoo[i].EstadoDelZoo(ARC) == ARC){
                            ObjZoo[i].MostrarZoo();
                            encontrado = true;
                        }
                    if (encontrado == false)
                            System.out.println("No se encontraron Zoo´s en ese estado");
                    }
                    break;
            }
        }while(opc!=0);
    
    
    }
    
}
