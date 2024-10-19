
package fecha.poo;

import java.util.Scanner;

public class Fecha {
    private int dia;
    private int mes;
    private int año;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
     public void AgregarFecha(){
        Scanner leer = new Scanner(System.in);
        int dia, mes, año;
        System.out.print("Ingresa el dia :");
        dia = leer.nextInt();
        System.out.print("Ingresa el numero de mes :");
        mes = leer.nextInt();
        if (mes<1&&mes>12)
             System.out.println("Ingresa un mes ");
        System.out.print("Ingresa el año :");
        año = leer.nextInt();
        switch (mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (dia<1||dia>31)
                    System.out.println("Ingresa una fecha valida");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (dia<1||dia>30)
                    System.out.println("Ingresa una fecha valida");
                break;
            case 2: 
                if ((dia>=1)&&((año%4==0&&dia<=29)||(año%4!=0&&dia<=28)))
                    System.out.println("Fecha valida");
                else 
                    System.out.println("Ingresa una fecha valida");
                break;
        }
        
     }
     
     
}
