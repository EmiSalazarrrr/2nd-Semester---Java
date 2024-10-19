
package ejercicio2_poo;

import java.util.Scanner;

public class Libro {
    /*
    Titulo
    Autor
    Año de edición
    ID del libro
    Editorial
    
    */
    private String Titulo;
    private String Autor;
    private int Año;
    private int IDLibro;
    private String Editorial;
    private boolean Disponibilidad;
    
   //Constructor por defecto.
    public Libro(){
        Titulo = "";
        Autor = "";
        Año = 0;
        IDLibro = 0;
        Editorial = "";
        Disponibilidad = false;
}

    public Libro(String Titulo, String Autor, int Año, int IDLibro, String Editorial) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Año = Año;
        this.IDLibro = IDLibro;
        this.Editorial = Editorial;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }
    

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int Año) {
        this.Año = Año;
    }

    public int getIDLibro() {
        return IDLibro;
    }

    public void setIDLibro(int IDLibro) {
        this.IDLibro = IDLibro;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }
    public String Titulo(){
        Scanner leer = new Scanner (System.in);
        leer.useDelimiter("\n");
        String NombreLibro;
        System.out.print("Dame el nombre del libro.");
        NombreLibro = leer.next();
        return Titulo;
    }
    public String Autor(){
        Scanner leer = new Scanner (System.in);
        leer.useDelimiter("\n");
        String NombreAutor;
        System.out.print("Dame el nombre del autor del libro.");
        NombreAutor = leer.next();
        return Autor;
    }
    public int Año(){
        Scanner leer = new Scanner (System.in);
        int AñoLibro;
        System.out.println("Dime el año en que se salió el libro.");
        AñoLibro = leer.nextInt();
        return Año;
    }
    public String Editorial(){
        Scanner leer = new Scanner (System.in);
        leer.useDelimiter("\n");
        String NombreEditorial;
        System.out.println("Dime el nombre de la editorial.");
        NombreEditorial = leer.next();
        return Editorial;
    }
    public boolean Disponibilidad(){
        Scanner leer = new Scanner (System.in);
        boolean Disponible;
        int opc;
        System.out.println("Quierés llevarte el libro?");
        System.out.println("1 = Sí. 2 = No.");
        opc = leer.nextInt();
        if (opc == 1)
            Disponible = false;
        else 
            Disponible = true;
        return Disponibilidad;
    }
    
    
}
