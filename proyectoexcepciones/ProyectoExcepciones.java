//PROYECTO REALIZADO POR: JOEL EMILIANO SALAZAR FIGUEROA
package proyectoexcepciones;

public class ProyectoExcepciones {

    public static void main(String[] args) {
       Banco banco = new Banco(100);
       CuentaDeAhorro CDA = new CuentaDeAhorro("98765432E", 300);
       CuentaCorriente CC = new CuentaCorriente("21378459X",500);
       CuentaDeAhorroEsp CEsp = new CuentaDeAhorroEsp("998875642C",200.00,5);
    
       //Empezamos el bloque donde se podrían realizar excepciones
       try{
          banco.agregarCuenta(CC, 1);
          banco.agregarCuenta(CEsp, 1);
          //La siguiente instrucción será la que lanzará una excepcioón.
          //Pero como somos muy buenos, la trataremos para que el programa no truene.
          banco.agregarCuenta(new CuentaDeAhorro("91234562X", 1000),101);
        //Al momento de correr este manejo de excepciones quedó invalido pero se ve bien bonita
        //Aparte que me da miedo que al quitarla el programa truene de maneras impensables
       }catch (RangoArray e){
           System.out.println("Error al agregar la cuenta: " + e.getMessage());
       }
       banco.mostrarInformacion();
    }
}
//SALUDOS MAESTRA!! :D