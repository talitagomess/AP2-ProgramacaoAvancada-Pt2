package Questao02;

public class Incremental {
    private static int count = 0;
    private int numero;
    
    public Incremental() {
        this.numero = ++Incremental.count;
    }

    public String toString() {
        return "incremental: " + this.numero;
    }
    
}