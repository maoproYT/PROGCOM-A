// Importamos la clase Scanner, necesaria para leer datos del usuario
import java.util.Scanner;
// Definimos la clase principal llamada Ejercicio4
public class Ejercicio4 {
    // Método principal, punto de entrada del programa
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer datos desde el teclado
        Scanner sc = new Scanner(System.in);
        // Pedimos al usuario que ingrese una calificación entre 0 y 100
        System.out.print("Ingresa la calificación (0-100): ");
        int calificacion = sc.nextInt(); // Guardamos la calificación en una variable
        // ----------------- Forma 1: if - else -----------------
        // Si la calificación es mayor o igual a 60
        if (calificacion >= 60) {
            // Se considera aprobado
            System.out.println("Aprobado");
        } else {
            // Si no cumple la condición, está reprobado
            System.out.println("Reprobado");
        }
        // ----------------- Forma 2: if - else if - elif -----------------
        // Si la calificación es mayor o igual a 60
        if (calificacion >= 60) {
            System.out.println("Aprobado");
        }
        // Si es menor a 60
        else if (calificacion < 60) {
            System.out.println("Reprobado");
        }
        // Esta parte no es estrictamente necesaria, pero se agrega para mantener el formato
        else {
            System.out.println("Calificación inválida.");
        }
        // ----------------- Forma 3: Operador ternario -----------------
        // Se evalúa en una sola línea si es >= 60 o no
        System.out.println((calificacion >= 60) ? "Aprobado" : "Reprobado");
        // Cerramos el objeto Scanner para liberar recursos
        sc.close();
    }
}
