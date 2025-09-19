import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Integer> dobles = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            dobles.add(i * 2);
        }
        System.out.println(dobles);
    }
}