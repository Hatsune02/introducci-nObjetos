package src;
import java.util.*;

public class cuadrado{
    private int lado;
    
    public cuadrado(int lado){
        this.lado = lado;
    }

    public int calcularArea(){
        int area = lado * lado;
        return area;
    }

    public int calcularPerimetro(){
        int perimetro = 4 * lado;
        return perimetro;
    }
    public int getLado(){
        return lado;
    }
    
    public void setLado(int lado) {
        this.lado = lado;
    }

}