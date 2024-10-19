//Clase para la excepción que se presente en el caso de tener un Saldo Negativo.
package proyectoexcepciones;

public class SaldoNegativo extends Exception {
    public SaldoNegativo(String message){
        super(message);
    }
}
