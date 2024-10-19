
package horapoo;

public class Hora {
    private int Hora;
    private int Minuto;
    private int Segundo;
    
    public Hora(){
       Hora = 0;
       Minuto = 0;
       Segundo = 0;
    }
    public void AgregarHora (int HH, int MM, int SS){
        Hora = HH;
        Minuto = MM;
        Segundo = SS;
    }
    public String Horas24(){
        String HorasVC;
        HorasVC = Hora+"/"+Minuto+"/"+Segundo;
        return HorasVC;
}
    public String Horas12(){
        String HorasDC;
        if (Hora>=12)
            Hora = Hora-12;
        HorasDC = Hora+"/"+Minuto+"/"+Segundo;
        return HorasDC;
    }
}
