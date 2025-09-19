import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<String> letras = List.of("a", "b");
        List<Integer> numeros = List.of(1, 2, 3);
        List<String> combinaciones = new ArrayList<>();
        
        // Combinaciones letra + número
        for (String letra : letras) {
            for (int numero : numeros) {
                combinaciones.add(letra + numero);
            }
        }
        
        // Combinaciones número + letra
        for (int numero : numeros) {
            for (String letra : letras) {
                combinaciones.add(numero + letra);
            }
        }
        
        System.out.println("Todas las combinaciones posibles entre estos 4 valores: " + combinaciones);
    }
}