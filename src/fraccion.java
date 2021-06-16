package src;

import java.util.*;

public class fraccion{

    private int numerador;
    private int denominador;

    public fraccion(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public void sumar(fraccion primera, fraccion segunda){
        int mcm = primera.denominador * segunda.denominador;
        if(mcm != 0){
            int numeradorTotal = (mcm / primera.denominador * primera.numerador) + (mcm / segunda.denominador * segunda.numerador);
            boolean sePuede = true;

            while(sePuede){
                if(mcm % 2 == 0 && numeradorTotal % 2 == 0){
                    mcm = mcm/ 2;
                    numeradorTotal = numeradorTotal / 2;
                }

                else if(mcm % 3 == 0 && numeradorTotal % 3 == 0){
                    mcm = mcm/ 3;
                    numeradorTotal = numeradorTotal / 3;
                }

                else if(mcm % 5 == 0 && numeradorTotal % 5 == 0){
                    mcm = mcm/ 5;
                    numeradorTotal = numeradorTotal / 5;
                }

                else if(mcm % 7 == 0 && numeradorTotal % 7 == 0){
                    mcm = mcm/ 7;
                    numeradorTotal = numeradorTotal / 7;
                }

                else if(mcm % 11 == 0 && numeradorTotal % 11 == 0){
                    mcm = mcm/ 11;
                    numeradorTotal = numeradorTotal / 11;
                }
                else{
                    sePuede = false;
                }
            }

            System.out.println("El total es " + numeradorTotal + "/" + mcm);
        }
        
        else{
            System.out.println("No se puede dividir por 0");
        }
    }

    public void restar(fraccion primera, fraccion segunda){
        int mcm = primera.denominador * segunda.denominador;
        if(mcm != 0){
            int numeradorTotal = (mcm / primera.denominador * primera.numerador) - (mcm / segunda.denominador * segunda.numerador);
            boolean sePuede = true;

            while(sePuede){
                if(mcm % 2 == 0 && numeradorTotal % 2 == 0){
                    mcm = mcm/ 2;
                    numeradorTotal = numeradorTotal / 2;
                }

                else if(mcm % 3 == 0 && numeradorTotal % 3 == 0){
                    mcm = mcm/ 3;
                    numeradorTotal = numeradorTotal / 3;
                }

                else if(mcm % 5 == 0 && numeradorTotal % 5 == 0){
                    mcm = mcm/ 5;
                    numeradorTotal = numeradorTotal / 5;
                }

                else if(mcm % 7 == 0 && numeradorTotal % 7 == 0){
                    mcm = mcm/ 7;
                    numeradorTotal = numeradorTotal / 7;
                }

                else if(mcm % 11 == 0 && numeradorTotal % 11 == 0){
                    mcm = mcm/ 11;
                    numeradorTotal = numeradorTotal / 11;
                }
                else{
                    sePuede = false;
                }
            }

            System.out.println("El total es " + numeradorTotal + "/" + mcm);
        }
        
        else{
            System.out.println("No se puede dividir por 0");
        }
    }

    public void multiplicar(fraccion primera, fraccion segunda){
        int denominadortotal = primera.denominador * segunda.denominador;
        if(denominadortotal != 0){
            int numeradorTotal = segunda.numerador * segunda.numerador;
            boolean sePuede = true;

            while(sePuede){
                if(denominadortotal % 2 == 0 && numeradorTotal % 2 == 0){
                    denominadortotal = denominadortotal/ 2;
                    numeradorTotal = numeradorTotal / 2;
                }

                else if(denominadortotal % 3 == 0 && numeradorTotal % 3 == 0){
                    denominadortotal = denominadortotal/ 3;
                    numeradorTotal = numeradorTotal / 3;
                }

                else if(denominadortotal % 5 == 0 && numeradorTotal % 5 == 0){
                    denominadortotal = denominadortotal/ 5;
                    numeradorTotal = numeradorTotal / 5;
                }

                else if(denominadortotal % 7 == 0 && numeradorTotal % 7 == 0){
                    denominadortotal = denominadortotal/ 7;
                    numeradorTotal = numeradorTotal / 7;
                }

                else if(denominadortotal % 11 == 0 && numeradorTotal % 11 == 0){
                    denominadortotal = denominadortotal/ 11;
                    numeradorTotal = numeradorTotal / 11;
                }
                else{
                    sePuede = false;
                }
            }

            System.out.println("El total es " + numeradorTotal + "/" + denominadortotal);
        }
        
        else{
            System.out.println("No se puede dividir por 0");
        }
    }

    public void dividir(fraccion primera, fraccion segunda){
        int denominadortotal = primera.denominador * segunda.numerador;
        if(denominadortotal != 0){
            int numeradorTotal = primera.numerador * segunda.denominador;
            boolean sePuede = true;

            while(sePuede){
                if(denominadortotal % 2 == 0 && numeradorTotal % 2 == 0){
                    denominadortotal = denominadortotal/ 2;
                    numeradorTotal = numeradorTotal / 2;
                }

                else if(denominadortotal % 3 == 0 && numeradorTotal % 3 == 0){
                    denominadortotal = denominadortotal/ 3;
                    numeradorTotal = numeradorTotal / 3;
                }

                else if(denominadortotal % 5 == 0 && numeradorTotal % 5 == 0){
                    denominadortotal = denominadortotal/ 5;
                    numeradorTotal = numeradorTotal / 5;
                }

                else if(denominadortotal % 7 == 0 && numeradorTotal % 7 == 0){
                    denominadortotal = denominadortotal/ 7;
                    numeradorTotal = numeradorTotal / 7;
                }

                else if(denominadortotal % 11 == 0 && numeradorTotal % 11 == 0){
                    denominadortotal = denominadortotal/ 11;
                    numeradorTotal = numeradorTotal / 11;
                }
                else{
                    sePuede = false;
                }
            }

            System.out.println("El total es " + numeradorTotal + "/" + denominadortotal);
        }
        
        else{
            System.out.println("No se puede dividir por 0");
        }
    }
    
    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
}