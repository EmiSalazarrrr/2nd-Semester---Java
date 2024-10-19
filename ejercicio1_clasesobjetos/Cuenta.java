package ejercicio1_clasesobjetos;

import java.util.Scanner;

public class Cuenta {
    //IDCuenta, NombreCliente, MontoAhorro
   private int IDCuenta;
   private String NombreCliente;
   private double MontoAhorro;
   
   //Constructor por defecto
   public Cuenta(){
       IDCuenta = 0;
       NombreCliente = "";
       MontoAhorro = 0;
   }
   //Constructor Paramtétrico

    public Cuenta(int IDCuenta, String NombreCliente, double MontoAhorro) {
        this.IDCuenta = IDCuenta;
        this.NombreCliente = NombreCliente;
        this.MontoAhorro = MontoAhorro; 
    }

    public int getIDCuenta() {
        return IDCuenta;
    }

    public void setIDCuenta(int IDCuenta) {
        this.IDCuenta = IDCuenta;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public double getMontoAhorro() {
        return MontoAhorro;
    }

    public void setMontoAhorro(double MontoAhorro) {
        this.MontoAhorro = MontoAhorro;
    }
    public double Deposito(){
        Scanner leer = new Scanner (System.in);
        double MontoADepositar;
        System.out.println("Ingrese el Monto a Depositar = $ ");
        MontoADepositar = leer.nextDouble();
        MontoAhorro += MontoADepositar;
        return MontoAhorro;
    }
    
    public double Retiro(){
        Scanner leer = new Scanner (System.in);
        double MontoARetirar;
        System.out.print("Ingresa el Monto a Retirar = $ ");
        MontoARetirar = leer.nextDouble();
        if (MontoAhorro >= MontoARetirar)
            MontoAhorro -= MontoARetirar;
        else 
            System.out.println("Saldo insuficiente en la cuenta.");
        return MontoAhorro;
    }
}