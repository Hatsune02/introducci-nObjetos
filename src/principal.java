package src;
import java.util.*;

public class principal {

    // LLAMAR TODOS LOS OBJETOS
    Contador x = new Contador();
    cuadrado cuadradito = new cuadrado(4);
    circulo circulito = new circulo(5);
    rectangulo rectangulito = new rectangulo(3,7);
    libro librito = new libro("A Song of Ice and Fire", 120, "Fantasía", "Inglés");
    fraccion fraccion1 = new fraccion(5, 3);
    fraccion fraccion2 = new fraccion(3, 2);

    public principal(){
        // SEGUNDAS VARIABLES QUE APUNTAN A LA PRIMERA
        Contador y = x;
        cuadrado cuadraditoDos = cuadradito;
        circulo circulitoDos = circulito;
        rectangulo rectangulitoDos = rectangulito;
        libro libritoDos = librito;
        fraccion fraccioncita1 = fraccion1;
        fraccion fraccioncita2 = fraccion2;

        // CAMBIAR VARIABLES DE LOS OBJETOS CON LA SEGUNDA VARIABLE
        y.setContador(10);
        cuadraditoDos.setLado(18);
        circulitoDos.setRadio(13);
        rectangulitoDos.setAncho(10);
        rectangulitoDos.setLargo(20);
        libritoDos.setNombre("Escapa por tu vida v:");
        libritoDos.setIdioma("Español");
        libritoDos.setPrecio(60);
        libritoDos.setGenero("A");
        fraccioncita1.setNumerador(13);
        fraccioncita1.setDenominador(27);
        fraccioncita2.setNumerador(13);
        fraccioncita2.setDenominador(27);

        // MOSTRAR CON LA PRIMERA VARIABLE
        System.out.println("CONTADOR_______________");
        System.out.println("Contador Cambiado ");
        System.out.println("Contador :" + x.getContador()); 
        System.out.println("");
        System.out.println("CUADRADO_______________");
        System.out.println("El lado del cuadrado es: " + cuadradito.getLado());
        System.out.println("Área :" + cuadradito.calcularArea());
        System.out.println("Perímetro :" + cuadradito.calcularPerimetro());
        System.out.println("");
        System.out.println("CIRCULO________________");
        System.out.println("El radio del circulo es: " + circulito.getRadio());
        System.out.println("Área :" + circulito.calcularArea());
        System.out.println("Perímetro :" + circulito.calcularPerimetro());
        System.out.println("");
        System.out.println("RECTANGULO_____________");
        System.out.println("Los lados del rectángulo son: " + rectangulito.getAncho() + " y " + rectangulito.getLargo());
        System.out.println("Área :" + rectangulito.calcularArea());
        System.out.println("Perímetro :" + rectangulito.calcularPerimetro());
        System.out.println("");
        System.out.println("LIBRO__________________");
        librito.mostrarDatosLibro();
        System.out.println("");
        System.out.println("FRACCIONES_____________");
        System.out.println("Fracción 1:  " + fraccion1.getNumerador() + " / " + fraccion1.getDenominador());
        System.out.println("Fracción 2:  " + fraccion2.getNumerador() + " / " + fraccion2.getDenominador());
        System.out.println("");


    }

}