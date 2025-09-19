import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<String> palabras = List.of("sol", "estrella", "mar", "planeta");
        List<String> palabrasLargas = new ArrayList<>();
        
        for (String palabra : palabras) {
            if (palabra.length() > 4) {
                palabrasLargas.add(palabra);
            }
        }
        System.out.println("Palabras con más de 4 letras del abecedario: " + palabrasLargas);
    }
}