import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<String> resultados = new ArrayList<>();
        
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                resultados.add(i + " - par");
            } else {
                resultados.add(i + " - impar");
            }
        }
        
        System.out.println("Lista de los números: " + resultados);
    }
}