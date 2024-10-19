
package proyectoexcepciones;

public class CuentaCorriente extends Cuenta{

    public CuentaCorriente(String DNITitular, double Saldo) {
        super(DNITitular, Saldo);
    }
    //Override del método ingresar
    @Override 
    public void ingresar (double cantidad){
        Saldo += cantidad;
    }
    /*
    Aquí irá un "throws" para cuando el saldo sea insuficiente 
    cuando queramos retirar y no tengamos suficiente saldo.
    */
    @Override
    public void retirar (double cantidad) throws SaldoNegativo{
        if (Saldo - cantidad < 0)
            throw new SaldoNegativo("Saldo Insuficiente en la cuenta corriente");
        Saldo -= cantidad;
    }
    
}
