package src;
import java.util.*;

public class rectangulo{
    private int ancho;
    private int largo;
    public rectangulo(int ancho, int largo){
        this.ancho = ancho;
        this.largo = largo;
    }

    public int calcularArea(){
        int area = ancho * largo;  
        return area;
    }

    public int calcularPerimetro(){
        int perimetro = 2 * (ancho + largo);
        return perimetro;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }
}
