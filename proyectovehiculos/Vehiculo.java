
package proyectovehiculos;

public class Vehiculo {
    //Atributos de la clase base
    protected String Dueño;
    protected int Puertas;
    protected int Ruedas;
    
    public Vehiculo(){
        }
    public Vehiculo(String Dueño, int Puertas, int Ruedas){
        }

    public String getDueño() {
        return Dueño;
    }

    public void setDueño(String Dueño) {
        this.Dueño = Dueño;
    }

    public int getPuertas() {
        return Puertas;
    }

    public void setPuertas(int Puertas) {
        this.Puertas = Puertas;
    }

    public int getRuedas() {
        return Ruedas;
    }

    public void setRuedas(int Ruedas) {
        this.Ruedas = Ruedas;
    }
    public void caracteristicas(){
        System.out.println("Dueños : "+Dueño);
        System.out.println("Puertas: "+Puertas);
        System.out.println("Ruedas: "+Ruedas);
    }
    
}
   
