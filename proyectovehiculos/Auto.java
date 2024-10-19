   
package proyectovehiculos;

public class Auto extends Vehiculo {
    //Atributos de la clase derivada/subclase/hija 
    private boolean descapotable;
    
    public Auto(){
        
    }
   
    public Auto (boolean descapotable){
        this.descapotable = descapotable;
    }
    public Auto (boolean descapotable,
            String Dueño, int Puertas, int Ruedas){
        super(Dueño, Puertas, Ruedas);
        this.descapotable = descapotable;
    }
    
    public boolean isDescapotable() {
        return descapotable;
    }

    public void subir (){
        descapotable = false;
    }
    public void bajar (){
        descapotable = true;
    }
    @Override
    public void caracteristicas(){
        super.caracteristicas(); //invocación del método de la super clase
        if (descapotable == true)
            System.out.println("Capota abierta");
        else 
            System.out.println("Capota cerrada");
    }
    
}
