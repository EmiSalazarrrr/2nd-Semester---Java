
package proyectoexcepciones;

public class CuentaDeAhorro extends Cuenta {
    
    public CuentaDeAhorro(String DNITitular, double saldo){
        super (DNITitular, saldo);
    }
    
    @Override 
    public void ingresar (double cantidad){
        Saldo += cantidad;
    }
    /*
    Aquí irá un "throws" para cuando el saldo sea insuficiente 
    cuando queramos retirar y no tengamos suficiente saldo.
    */
    @Override 
    public void retirar(double cantidad) throws SaldoNegativo{
        if (Saldo - cantidad < 0)
            throw new SaldoNegativo("Saldo insuficiente en la cuenta de ahorro");
        Saldo -= cantidad;
    }
    
}
