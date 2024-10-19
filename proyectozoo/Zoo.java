
package proyectozoo;

import java.util.Scanner;

public class Zoo {
    private String Nombre;
    private String Ciudad;
    private String Pais;
    private int Tamaño;
    private double PresupuestoAnual;
    private String FApertura;
    private String FCierre;
    private String EstadoDelZoo;
    private int EstadoDelZooAyuda;
    private String EncNombre;
    private String CURP;
    //Atributos completados
  
    /*
    A continuación irá el constructor para inicializar los atributos 
    */
    
    public Zoo(){ 
        Nombre = "";
        Ciudad = "";
        Pais = "";
        Tamaño = 0;
        PresupuestoAnual = 0;
        FApertura = "";
        FCierre = "";
        EstadoDelZoo = "Abierto";
        EstadoDelZooAyuda = 0;
        EncNombre = "";
        CURP = "";
    }
    public String AgregarZoo (){ //Método PARA AGREGAR ZOO
        Scanner leer = new Scanner (System.in);
        leer.useDelimiter("\n");
        System.out.print("Dame los siguientes datos \n"
                + "Nombre del zoologico: ");
        Nombre = leer.next();
        System.out.print("Ciudad: ");
        Ciudad = leer.next();
        System.out.print("País: ");
        Pais = leer.next();
        System.out.print("Tamaño: ");
        Tamaño = leer.nextInt();
        System.out.print("Presupuesto Anual: ");
        PresupuestoAnual = leer.nextDouble();
        System.out.print("Fecha de apertura: ");
        FApertura = leer.next();
        if(EstadoDelZoo == "Cerrado"){ 
            System.out.println("Dame la fecha de cierre");
            FCierre = leer.next();
        }
        System.out.print("Nombre del encargado: ");
        EncNombre = leer.next();
        System.out.println("CURP del encargado: ");
        CURP = leer.next();
        String Confirmado;
        Confirmado = "Zoo agregado";
        return Confirmado;
    }
   
    public void CambiarEstado () {
        int X; //Variable para así poder hacer el ajuste de estado
        Scanner leer = new Scanner (System.in);
        leer.useDelimiter("\n");
        if (EstadoDelZoo == "Cerrado")
            System.out.println("No se puede volver a abrir;");
        System.out.println("¿A qué estado quieres actualizar?\n"
                + "1. Abierto al público. \n"
                + "2. En remodelación. \n"
                + "3. Cerrado.");
        X = leer.nextInt();
        if (X == 1)
            EstadoDelZoo = "Abierto al publico";
        if (X == 2)
            EstadoDelZoo = "En remodelación";
        if (X == 3){
            EstadoDelZoo = "Cerrado";
            System.out.println("Dime la fecha de cierre");
            FCierre = leer.next();
        }
        //Opciones para ajuste de estado.
        if (X!= 1||X!=2||X!=3)
            System.out.println("Dame una opción valida.");
    }
   //Siguiente método es para mostrar el estado del Zoo que quiere el usuario.
    public String MostrarEstado (int ARC){
       System.out.println("El estado del Zoo es: ");
       return EstadoDelZoo;
   }
    //Siguiente método es para mostrar los datos del zoo, aquí haré un ciclo en el main para mostrar el de todos.
    public void MostrarZoo(){
        System.out.println("Nombre del Zoo: "+Nombre);
        System.out.println("Ciudad: "+Ciudad);
        System.out.println("Pais: "+Pais);
        System.out.println("Tamaño: "+Tamaño+"m2");
        System.out.println("Presupuesto Anual: "+PresupuestoAnual+"pesos.");
        System.out.println("Fecha de apertura: "+FApertura);
        if (FCierre != "")//Cuando Fecha de Cierre sea diferente de su valor inicial esto significa que se cambió.
            System.out.println("Fecha de cierre: "+FCierre);
        System.out.println("Nombre del encargado: "+EncNombre);
        System.out.println("CURP del encargado: "+CURP);
    }
    public int EstadoDelZoo(int ARC){
        if (EstadoDelZoo == "Abierto")
            EstadoDelZooAyuda = 1;
        if (EstadoDelZoo == "En remodelación")
            EstadoDelZooAyuda = 2;
        if (EstadoDelZoo == "Cerrado")
            EstadoDelZooAyuda =3;
        return EstadoDelZooAyuda;
    }
}
    
