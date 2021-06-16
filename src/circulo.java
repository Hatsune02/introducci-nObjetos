package src;

import java.util.*;

public class circulo{
    private int radio;

    public circulo(int radio){
        this.radio = radio;
    }

    public double calcularArea(){
        double area = Math.PI * radio * radio;  
        return area;
    }

    
    public double calcularPerimetro(){
        double perimetro = Math.PI * radio;
        return perimetro;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
}