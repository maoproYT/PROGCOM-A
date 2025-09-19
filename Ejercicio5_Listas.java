import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<String> lenguajes = new ArrayList<>();
        lenguajes.add("python");
        lenguajes.add("java");
        lenguajes.add("c++");
        
        List<String> mayusculas = new ArrayList<>();
        
        for (String lenguaje : lenguajes) {
            mayusculas.add(lenguaje.toUpperCase());
        }
        
        System.out.println("original: " + lenguajes);
        System.out.println("mayúsculas: " + mayusculas);
    }
}