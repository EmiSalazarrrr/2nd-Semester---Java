
package libro.poo;

public class Libro {
    private String Titulo, Autor, Editorial;
    private boolean Disponibilidad;

    public Libro() {
    }

    public Libro(String Titulo, String Autor, String Editorial) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Editorial = Editorial;
        this.Disponibilidad = true; //Sí disponible
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

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public boolean isDisponibilidad() {
        return Disponibilidad;
    }

    public void setDisponibilidad(boolean Disponibilidad) {
        this.Disponibilidad = Disponibilidad;
    }
    
    public boolean Prestamo(){
        if (Disponibilidad == true ){ //Sí se puede prestar
            Disponibilidad = false;
            return true;
        }
        return false;
    }
    public boolean Devolución(){
       if (Disponibilidad == false ){ //Sí se pudo la devolución
            Disponibilidad = true;
            return true; 
    }
       return false;
    }
            
    
}
