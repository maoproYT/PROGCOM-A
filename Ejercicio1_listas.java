import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> cuadrados = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            cuadrados.add(i * i);
        }
        System.out.println(cuadrados);
    }
}