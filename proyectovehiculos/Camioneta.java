
package proyectovehiculos;

public class Camioneta extends Vehiculo {
    private float tara, carga;
    
    public Camioneta(){
        
    }

    public Camioneta(float tara, float carga) {
        this.tara = tara;
        this.carga = carga;
    }

    public Camioneta(float tara, float carga, String Dueño, int Puertas, int Ruedas) {
        super(Dueño, Puertas, Ruedas);
        this.tara = tara;
        this.carga = carga;
    }

    public float getTara() {
        return tara;
    }

    public void setTara(float tara) {
        this.tara = tara;
    }

    public float getCarga() {
        return carga;
    }

    public void setCarga(float carga) {
        this.carga = carga;
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
   @Override
    public void caracteristicas(){
        super.caracteristicas();
        System.out.println("Tara: "+ tara);
        System.out.println("Carga: "+ carga);
    }
    
}
