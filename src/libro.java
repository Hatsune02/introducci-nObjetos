package src;
import java.util.*;

public class libro{
    private String nombre;
    private double precio;
    private String genero;
    private String idioma;
    private boolean prestado;
    
    public libro(){
        nombre = "No tiene nombre definido";
        precio = 100;
        genero = "No tiene genero definido";
        idioma = "No tiene idioma definido";
        prestado = false;
    }

    public libro(String nombre, double precio, String genero, String idioma){
        this.nombre = nombre;
        this.precio = precio;
        this.genero = genero;
        this.idioma = idioma;
        prestado = false;
    }

    public void prestarLibro(){
        prestado = true;
        
    }

    public void devolverLibro(){
        prestado = false;
    }

    public void mostrarDatosLibro(){
        String estado;
        if(prestado){
            estado = "Prestado";
        }
        else{
            estado = "Disponible";
        }

        System.out.println("Datos del Libro_____________");      
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: Q" + precio);
        System.out.println("Género: " + genero);
        System.out.println("Idioma: " + idioma);
        System.out.println("Estado: " + estado);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
}