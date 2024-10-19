
package proyectoexcepciones;

public class CuentaDeAhorroEsp extends CuentaDeAhorro{
    protected int penalizacion;
    public CuentaDeAhorroEsp(String DNITitular, double Saldo, int penalizacion){
        super (DNITitular, Saldo);
        this.penalizacion = penalizacion;
    }
    
    //Método para retirar con la cantidad de penalización que se aplicará
    @Override 
    public void retirar (double cantidad) throws SaldoNegativo{
        double CantidadPenalizacion;
        CantidadPenalizacion = cantidad * (1 + penalizacion / 100);
        if (Saldo - CantidadPenalizacion < 0 )
            throw new SaldoNegativo("Saldo insuficiente");
        Saldo -= CantidadPenalizacion;
}

    public double getPenalizacion() {
        return penalizacion;
    }
    
    //Redefinición del toString
    @Override 
    public String toString(){
        return super.toString() + ", Penalización: " + penalizacion + "%";
    }
    
}
