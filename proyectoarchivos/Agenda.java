/*
Esta clase será la encargada de gestionar y
almacenar los contactos de la agenda.
*/
package proyectoarchivos;

import java.io.*;
 

public class Agenda {
    //Un atributo será para el maximo de contactos.
    private static final int Contactos_Max = 50;
    //El siguiente para hacer el arreglo con los diferentes contactos
    private String[] Contactos;
    //El número del contacto
    private int NumContactos;
    
    //Constructor que generará la agenda.
    public Agenda(){
        Contactos = new String[Contactos_Max];
        NumContactos = 0;
        try{
            LeerDesdeArchivo();
        }catch (IOException e){
            System.out.println("Error al cargar el archivo: "+e.getMessage());
        }
    }
    //Método para agregar contactos.
    public void AgregarContacto (String Contacto){
        if (NumContactos<Contactos_Max){
            Contactos[NumContactos] = Contacto;
            NumContactos++;
        }
        else
            System.out.println("No se puede agregar más contactos. La agenda está llena.");
    }
    
    //Método para ordenar contactos.
    public void OrdenarContactos(){
        //El -1 será porque los arreglos empiezan desde 0.
        for (int i = 0;i<NumContactos - 1 ; i++){
            int Contacto1 = i;
            for (int x = i + 1; x < NumContactos; x++){
                //If para verificar si el Contacto1 es menor que el Contacto en X
                if (Contactos[x].compareTo(Contactos[Contacto1])<0)
                    Contacto1 = x;
            }
            String Ayudante;
            Ayudante = Contactos[i];
            Contactos[i] = Contactos[Contacto1];
            Contactos[Contacto1] = Ayudante;
        }
    }
    //Método para mostrar contactos
    public void MostrarContactos(){
        for(int i = 0; i < NumContactos; i++){
            System.out.println(Contactos[i]);
        }
    }
    //Método para eliminar contactos
    public void EliminarContactos(String Contacto){
        boolean Encontrado = false;
        for (int x = 0; x < NumContactos; x++){
            if (Contactos[x].equals(Contacto)){
                Encontrado = true;
                //Mover los elementos una posición hacia la izquierda
                for (int i = x; i<(NumContactos - 1); i++){
                    //Reposicionamiento de contactos
                    Contactos[i] = Contactos [i+1];
                }
                Contactos[NumContactos - 1] = null;
                NumContactos--;
                break; //Salir del ciclo una vez que se ha encontrado y eliminado el contacto
            }
            if (Encontrado)
                System.out.println("Contacto ha sido eliminado");
        }
    }
    //Método para guardar en el archivo.
    public void GuardarEnArchivo(){
        BufferedWriter bw = null;
        FileWriter fw = null;
        try{
         fw = new FileWriter("Agenda.txt");   
         bw = new BufferedWriter(fw);
         for (int x = 0; x<NumContactos; x++){
             bw.write(Contactos[x]);
             bw.newLine();
         }
        } catch (IOException e){
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        } finally{    
            try{
                if (bw != null)
                    bw.close();
                if (fw != null)
                    fw.close();
            }catch (IOException e){
                System.out.println("Error al cerrar el archivo: "+ e.getMessage());
            }
        }
    }
    
    //Método para leer contactos
    private void LeerDesdeArchivo() throws IOException{
        //Creando el objeto que leerá el archivo.
        BufferedReader br = null;
        FileReader fr = null;
        try{
            File archivo = new File("Agenda.txt");
            if (!archivo.exists()){
                System.out.println("El archivo no existe. Se creará uno nuevo.");
                return;
            }
           fr = new FileReader (archivo);
           br = new BufferedReader (fr);
           //Variable para almacenar cada línea leída del archivo 
           String linea; 
           while ((linea = br.readLine())!= null && NumContactos<Contactos_Max){
               Contactos[NumContactos] = linea;
               NumContactos++;
           }
        } catch (FileNotFoundException e){
            System.out.println("El archivo no existe.");
        } catch (IOException e){
            System.out.println("Error al leer el archivo: "+ e.getMessage());
        } finally { //Finally obligatorio para cerrar los objetos de lectura
            try{
                if (br != null)
                    br.close();
                if (fr != null)
                    fr.close();
            } catch (IOException e ){
                System.out.println("Error al cerrar el archivo: "+e.getMessage());
            }
        }
    }
}

