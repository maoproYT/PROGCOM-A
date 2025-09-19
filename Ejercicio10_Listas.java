import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<>();
                for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese la temperatura " + (i + 1) + ": ");
            double temp = scanner.nextDouble();
            temperaturas.add(temp);
        }        
        List<String> clasificaciones = new ArrayList<>();
        for (double temp : temperaturas) {
            String clima;
            if (temp < 26) {
                clima = "frío";
            } else if (temp >= 26 && temp <= 29) {
                clima = "templado";
            } else {
                clima = "caliente";
            }
            clasificaciones.add(clima);
        }
        
        System.out.println("\nResultados de clasificación:");
        System.out.println("Temperaturas: " + temperaturas);
        System.out.println("Clasificaciones: " + clasificaciones);
                System.out.println("\nDetalle:");
        for (int i = 0; i < temperaturas.size(); i++) {
            System.out.println(temperaturas.get(i) + "celcius" + clasificaciones.get(i));
        }
        
        scanner.close();
    }
}