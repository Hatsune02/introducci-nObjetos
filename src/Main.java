package src;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Main intro = new Main();
    }
    Scanner leer = new Scanner(System.in);
    Contador x = new Contador();
    cuadrado cuadradito = new cuadrado(4);
    circulo circulito = new circulo(5);
    rectangulo rectangulito = new rectangulo(3,7);
    libro librito = new libro("A Song of Ice and Fire", 120, "Fantasía", "Inglés");
    fraccion fraccion1 = new fraccion(5, 3);
    fraccion fraccion2 = new fraccion(3, 2);

    public Main(){
        menu();
    }

    public void menu(){

        do{
            int opcion;
            System.out.println("___MENU____________________________");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Ejercicio 4");
            System.out.println("5. Ejercicio 5");
            System.out.println("6. Ejercicio 6");
            System.out.println("7. Ejercicio 7");
            System.out.println("8. Salir");

            opcion = getInt("Ingrese la opcion que quiere usar");
            switch(opcion){

                case 1:
                    System.out.println("1) Incrementar contador || 2) Decrementar contador || 3) Set Contador");
                    System.out.println("Contador :" + x.getContador());
                    int escoger = getIntRango("Escoger ", 1);
                    if(escoger == 1){
                        x.aumentarContador();
                        System.out.println("Contador incrementado ");
                        System.out.println("Contador :" + x.getContador());
                    }
                    else if(escoger == 2){
                        x.decrementarContador();
                        System.out.println("Contador decrementado ");
                        System.out.println("Contador :" + x.getContador());
                    }
                    else if(escoger == 3){
                        int nuevoContador = getInt("Ingrese nuevo contador ");
                        x.setContador(nuevoContador);
                        System.out.println("Contador :" + x.getContador());
                    }
                    break;
                case 2:
                    System.out.println("El lado del cuadrado es: " + cuadradito.getLado());
                    System.out.println("Área :" + cuadradito.calcularArea());
                    System.out.println("Perímetro :" + cuadradito.calcularPerimetro());
                    break;
                case 3:
                    System.out.println("El radio del circulo es: " + circulito.getRadio());
                    System.out.println("Área :" + circulito.calcularArea());
                    System.out.println("Perímetro :" + circulito.calcularPerimetro());
                    break;
                case 4:
                    System.out.println("Los lados del rectángulo son: " + rectangulito.getAncho() + " y " + rectangulito.getLargo());
                    System.out.println("Área :" + rectangulito.calcularArea());
                    System.out.println("Perímetro :" + rectangulito.calcularPerimetro());
                    break;
                case 5:
                    System.out.println("1) Prestar Libro || 2) Devolver Libro || 3) Mostrar datos del libro");
                    int escoger1 = getIntRango("Escoger ", 1);
                    if(escoger1 == 1){
                        librito.prestarLibro();
                        System.out.println("El libro se ha prestado ");
                    }
                    else if(escoger1 == 2){
                        librito.devolverLibro();
                        System.out.println("El libro se ha devuelto ");
                    }
                    else if(escoger1 == 3){
                        librito.mostrarDatosLibro();
                    }
                    break;
                case 6:
                    System.out.println("MENU___________");
                    System.out.println("1) Sumar");
                    System.out.println("2) Restar");
                    System.out.println("3) Multiplicar");
                    System.out.println("4) Dividir");
                    System.out.println("Fracción 1:  " + fraccion1.getNumerador() + " / " + fraccion1.getDenominador());
                    System.out.println("Fracción 2:  " + fraccion2.getNumerador() + " / " + fraccion2.getDenominador());
                    int escoger2 = getIntRango("Escoger ", 1);
                    if(escoger2 == 1){
                        fraccion1.sumar(fraccion1, fraccion2);
                    }
                    else if(escoger2 == 2){
                        fraccion1.restar(fraccion1, fraccion2);
                    }
                    else if(escoger2 == 3){
                        fraccion1.multiplicar(fraccion1, fraccion2);
                    }
                    else if(escoger2 == 4){
                        fraccion1.dividir(fraccion1, fraccion2);
                    }
                    break;
                case 7:
                    principal ej7 = new principal();
                    break;
                case 8:
                    System.exit(0);
                    break;
            }
        } while(true);

    }

    public int getInt(String titulo){
        String n = "";

        while(n.equals("")){
            System.out.println(titulo);
            n = leer.nextLine();
            if(!n.matches("[0-9 ]*$")){
                n = "";
            }
        }

        return Integer.parseInt(n);
    }

    public int getIntRango(String titulo, int rango){
        String n = "";

        while(n.equals("")){
            System.out.println(titulo);
            n = leer.nextLine();
            if(!n.matches("[0-9]{"+rango+"}")){
                n = "";
            }
        }

        return Integer.parseInt(n);
    }

    public String getString(String titulo){
        String n = "";

        while(n.equals("")){
            System.out.println(titulo);
            n = leer.nextLine();
            if(!n.matches("^[A-Za-z ]*$")){
                n = "";
            }
        }

        return n;
    }

    public String getStringNumeros(String titulo){
        String n = "";

        while(n.equals("")){
            System.out.println(titulo);
            n = leer.nextLine();
            if(!n.matches("^[A-Za-z 0-9]*$")){
                n = "";
            }
        }

        return n;
    }

    public int getIntRango(String titulo, int rango, int tamanio){
        String n = "";

        while(n.equals("")){
            System.out.println(titulo);
            n = leer.nextLine();
            if(!n.matches("[0-"+rango+"]{"+tamanio+"}")){
                n = "";
            }
        }

        return Integer.parseInt(n);
    }
}
