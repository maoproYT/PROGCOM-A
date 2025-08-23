// Importamos la clase Scanner, necesaria para leer datos del usuario
import java.util.Scanner;

// Definimos la clase principal llamada Ejercicio3
public class Ejercicio3 {

    // Método principal, punto de entrada del programa
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer datos desde el teclado
        Scanner sc = new Scanner(System.in);
        // Pedimos al usuario que ingrese el primer número
        System.out.print("Ingresa el primer número: ");
        int num1 = sc.nextInt(); // Guardamos el primer número en la variable num1

        // Pedimos al usuario que ingrese el segundo número
        System.out.print("Ingresa el segundo número: ");
        int num2 = sc.nextInt(); // Guardamos el segundo número en la variable num2
        // ----------------- Forma 1: if - else -----------------
        // Si num1 es mayor que num2
        if (num1 > num2) {
            // Mostramos que el mayor es num1
            System.out.println("El mayor es: " + num1);
        } else {
            // Si no, mostramos que el mayor es num2
            System.out.println("El mayor es: " + num2);
        }
        // ----------------- Forma 2: if - else if - else -----------------
        // Comprobamos si num1 es mayor que num2
        if (num1 > num2) {
            System.out.println("El mayor es: " + num1);
        }
        // Si num2 es mayor que num1
        else if (num2 > num1) {
            System.out.println("El mayor es: " + num2);
        }
        // Si ninguno es mayor, significa que son iguales
        else {
            System.out.println("Ambos son iguales.");
        }
        // ----------------- Forma 3: Operador ternario -----------------
        // Usamos una condición en una sola línea:
        // Si num1 > num2, muestra num1, en caso contrario muestra num2
        System.out.println("El mayor es: " + ((num1 > num2) ? num1 : num2));
        // Cerramos el objeto Scanner para liberar recursos
        sc.close();
    }
}

