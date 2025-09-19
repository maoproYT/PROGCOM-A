import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        String palabra = "programacion";
        String vocalesStr = "aeiouAEIOU";
        List<Character> vocales = new ArrayList<>();
        
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            if (vocalesStr.indexOf(letra) != -1) {
                vocales.add(letra);
            }
        }
        
        System.out.println("Vocales en '" + palabra + "': " + vocales);
    }
}