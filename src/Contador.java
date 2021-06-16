package src;
public class Contador{
    private int contador;

    public Contador(int contador){
        this.contador = contador;
    }

    public Contador(){
        contador = 0;
    }

    public Contador(Contador contador){
        this.contador = contador.contador;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public void aumentarContador(){
        contador++;
    }

    public void decrementarContador(){
        contador--;
    }
}