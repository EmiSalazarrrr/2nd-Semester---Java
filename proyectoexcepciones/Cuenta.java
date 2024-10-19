//Cuenta padre pero de aquí heredarán todas las subclases necesarias
package proyectoexcepciones;

public abstract class Cuenta {
    protected String DNITitular;
    protected double Saldo;
    
    public Cuenta(String DNITitular, double Saldo){
        this.DNITitular = DNITitular;
        this.Saldo = 0.0;
    }
    
    public abstract void ingresar (double cantidad);
    
    public abstract void retirar (double cantidad) throws SaldoNegativo;

    public String getDNITitular() {
        return DNITitular;
    }

    public double getSaldo() {
        return Saldo;
    }
    
    @Override
    public String toString(){
        return "DNI del titular: " + DNITitular + ", Saldo: " + Saldo;
    }
}
