
package horapoo;

import java.util.Scanner;

public class HoraPOO {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int opc, HH, MM, SS;
        Hora ObjHora = new Hora();
        do{
            System.out.println("1.Agregar Hora \n"
                    + "2. Ver hora (24 hrs) \n"
                    + "3. Ver hora (12 hrs) \n"
                    + "0. Salir");
            opc = leer.nextInt();
            switch (opc){
                case 1:
                    System.out.println("Dame las HH, MM y SS: ");
                    HH = leer.nextInt();
                    MM = leer.nextInt(); 
                    SS = leer.nextInt();
                    ObjHora.AgregarHora(HH, MM, SS);
                    break;
                case 2:
                    System.out.println("Son las: "+ObjHora.Horas24());
                    break;
                case 3:
                    System.out.println("Son las: "+ObjHora.Horas12());
                    break;
            }
        }while(opc!=0);
    }
    
}
