import java.util.ArrayList;
import java.util.List;

class Tupla {
    int numero;
    int cuadrado;
    
    public Tupla(int numero, int cuadrado) {
        this.numero = numero;
        this.cuadrado = cuadrado;
    }
    
    
    public String toString() {
        return "(" + numero + ", " + cuadrado + ")";
    }
}

public class Main {
    public static void main(String[] args) {
        
        List<Tupla> tuplas = new ArrayList<>();
        
        for (int i = 1; i <= 5; i++) {
            tuplas.add(new Tupla(i, i * i));
        }
        
        System.out.println("Una tupla, no sabía que era antes de hacer este trabajo: " + tuplas);
    }
}