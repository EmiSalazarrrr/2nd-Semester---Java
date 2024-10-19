
package ventas;

public class Vendedor {
    
    private String Nombre;
    private float Ventas[];
       //Constructor por defecto
    public Vendedor(String N){
        this.Nombre = N;
        this.Ventas = new float [6];
    }
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public void GuardarVentas(int D, float Vtas){
        Ventas[D] = Vtas;
    }
    public float VtasSemana (){
        float SumaV = 0;
        for(int i=0;i<6;i++)
            SumaV+=Ventas[i];
        return SumaV;
    }
}
        
   
