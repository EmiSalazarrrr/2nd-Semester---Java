
package proyectovehiculos;

import java.util.Scanner;

public class ProyectoVehiculos {

    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
        int N, n=0, opc; //n número de vehículos que han sido registrados
        Vehiculo RegistroVehiculos[]; //Declaración del vector
        System.out.println("Ingresa el Número de vehiculos máximo a registrar = ");
        N = leer.nextInt();
        RegistroVehiculos = new Vehiculo[N]; //Creación del arreglo
        do{
            System.out.println("Agencia de Autos");
            System.out.println("1. Agregar un vehículo");
            System.out.println("2. Mostrar vehículos registrados");
            System.out.println("3. Mostrar todos Autos");
            System.out.println("4. Mostrar todas Camionetas");
            System.out.println("0. Terminar");
            System.out.println("Opción: ");
            opc = leer.nextInt();
            switch(opc){
                case 1:
                    if (N<25)
                        RegistroVehiculos[n++] = RegistrarVehiculo();
                    else 
                        System.out.println("Fuera de rango..\n");
                        
                    break;
                case 2:
                    System.out.println("Vehiculos registrados");
                    for ( int i = 0; i < N; i++){
                        System.out.println("----------------");
                        RegistroVehiculos[i].caracteristicas();
                    }
                    break;
                case 3:
                    System.out.println("Autos registrados:");
                    
                    break;
                case 4:
                    break;
            }
        }while (opc!=0);
        
        
        
        
    } //Salida de método main
    public static Vehiculo RegistrarVehiculo(){
        Vehiculo objNuevo=null;
        int opc;
        Scanner leer = new Scanner (System.in);
        leer.useDelimiter("\n");
        System.out.println("Tipo de vehiculo a Registrar"
                + "1. Auto - 2. Camioneta - 0. Regresar");
        opc = leer.nextInt();
        switch (opc){
            case 1: 
                System.out.println("Ingresa los datos para registrar el Auto");
                System.out.println("Dueño, Numero de Puertas, Numero de Ruedas");
                objNuevo = new Auto(false, leer.next(),leer.nextInt(),leer.nextInt());
                System.out.println("Registro Completado.\n");
                break;
            case 2:
                System.out.println("Ingresa los datos para registrar la camioneta");
                System.out.println("Peso de la Camioneta, Dueño, Número de Puertas, Numero de Ruedas");
                objNuevo = new Camioneta (leer.nextFloat(),0,leer.next(),leer.nextInt(),leer.nextInt());
                System.out.println("Registro completado. \n");
                break;
        }
        return objNuevo;
    } 
        
    
}

