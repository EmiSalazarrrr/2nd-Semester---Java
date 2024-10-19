/*
Se necesita un programa que permita capturar el nombre y las ventas semanales de todos los vendedores que trabajan en una empresa
considerando que se trabajan 6 dias a la semana y las ventas se registran por día. El programa deberá solicitar el número de vendedores y por cada vendededor
se creará un objeto. Las opciones que deberás incluir en a ejecución del programa será 1 Agregar los nombres de todos los vendedores, 2 agregar la venta correspondiente a cada vendededor
en un día específico, 3 mostrar el total de ventas semanales de un vendedor conociendo su número, 4 mostrar las ventas totales de la empresa.
 */
package ventas;

import java.util.Scanner;

public class Ventas {

    public static void main(String[] args) {
        
      Scanner leer = new Scanner (System.in);
      int opc, N, x;
      float total;
        System.out.println(" Cuántos vendedores?");
        N = leer.nextInt();
        Vendedor objVendedores[] = new Vendedor[N];
        
        do{
            System.out.println("1. Agregar Vendedores.\n"
                    + "2. Agregar la venta en un día especifico.\n"
                    + "3. Mostrar el total de las ventas.\n"
                    + "4. Mostrar las ventas totales de la empresa.\n"
                    + "0. Salida.");
            opc = leer.nextInt();
            switch (opc){
                case 1: 
                    for (int i=0; i<N;i++){
                        System.out.println("Dame el nombre del vendedor"+(i+1));
                           objVendedores[i]= new Vendedor(leer.next());
                    }
                    break;
                case 2: 
                    System.out.println("Día de la venta: ");
                    x = leer.nextInt();
                    for (int  i = 0; i<N; i++){
                        System.out.println("Cuánto vendió el vendedor"+objVendedores[i].getNombre());
                        objVendedores[i].GuardarVentas(x-1, leer.nextFloat());
                    }
                    break;
                case 3: 
                    System.out.println("Ingresa el número de vendedor");
                    x = leer.nextInt();
                    System.out.println("Las ventas semanales de:"+objVendedores[x-1].getNombre()
                    +"fueron de: "+objVendedores[x-1].VtasSemana());
                    break;
                case 4:
                    total =0;
                    for (int i =0;i<N;i++){
                        total+=objVendedores[i].VtasSemana(); 
                    }
                    System.out.println("Las ventas totales fueron: "+total);
                    break;
                    
            }
        }while (opc != 0);
      
              
              
              
    }
    
}
