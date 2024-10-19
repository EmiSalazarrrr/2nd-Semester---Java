package ejercicio1_clasesobjetos;

import java.util.Scanner;

public class Ejercicio1_ClasesObjetos {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
       int opc;
       Cuenta objCuenta=null; //declarar variable de objeto
       do{
           System.out.println("1.   Alta de cuenta\n"
                   + "2.    Retiro\n"
                   + "3.    Depósito\n"
                   + "4.    Consulta de Saldo\n"
                   + "0.    Salir\n");
           System.out.print("Opción: ");
           opc = leer.nextInt();
           switch(opc){
               case 1: 
                   System.out.println("Alta de cuenta");
                   System.out.println("Ingresa los siguientes datos");
                   System.out.println("IDCliente\t Nombre\t Monto inicial");
                   objCuenta = new Cuenta(leer.nextInt(),leer.next(),leer.nextDouble());
                   break;
               case 2: 
                   if (objCuenta != null)
                    System.out.print("Valor después del Retiro"+objCuenta.Retiro());
                   else
                       System.out.println("No ha sido creada la cuenta");
                   break; 
               case 3: 
                   if (objCuenta != null)
                    System.out.print("Valor después del Retiro"+objCuenta.Deposito());
                   else
                       System.out.println("No ha sido creada la cuenta");
                   break; 
               case 4: 
                   if (objCuenta != null)
                    System.out.print("Tu saldo es de: "+objCuenta.getMontoAhorro());
                   else 
                       System.out.println("No ha sido creada la cuenta");
                   break; 
           }
       }while (opc != 0);
    }
    
}
