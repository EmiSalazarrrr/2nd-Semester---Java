
package escribirarchivo;

import java.io.*;
import java.util.Scanner;

public class EscribirArchivo {

    public static void main(String[] args){
        /*Scanner leer = new Scanner (System.in);
        leer.useDelimiter("\n");
        //Crear el objeto file
        File f = new File ("Datos_Archivo\\Texto.txt");
        //Crear el flujo de datos
        try{
            FileWriter fw = new FileWriter (f);
            PrintWriter pw = new PrintWriter (fw);
            String cad;
            System.out.println("Para terminar solo teclea <enter>");
            while(((cad = leer.next()).length())!=0){
            pw.println(cad);
            }
            pw.close();
            fw.close();
        }catch (IOException e){
            System.out.println("No existe la ruta, archivo no creado");
        }
    }
    public static void leerArchivo(){
*/
        File f = new File ("Datos_Archivo\\Texto.txt");
        try{
            FileReader fr = new FileReader (f);
            BufferedReader br = new BufferedReader (fr);
            String cad;
            int  i = 0;
            while ((cad =br.readLine())!= null){
                System.out.println(cad);
                i++;
            }
            System.out.println(i+"registros almacenados");
            br.close();
            fr.close();
        }catch(Exception e){
            System.out.println("No se encontró el archivo porque lo borramos");
        }
    }
}
