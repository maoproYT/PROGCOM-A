// Importamos la clase Scanner para leer datos del usuario
import java.util.Scanner;

// Clase principal, debe coincidir con el nombre del archivo (Main.java)
public class Main {

    // Método principal que se ejecuta al iniciar el programa
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer desde teclado
        Scanner sc = new Scanner(System.in);

        // Pedimos que ingrese un número
        System.out.print("Ingresa un número: ");
        int numero = sc.nextInt(); // Guardamos el número ingresado en la variable "numero"

        // Caso 1: usando if - else
        System.out.println("\n--- Caso 1: if - else ---");
        ejemploIfElse(numero); // Llamamos al método ejemploIfElse

        // Caso 2: usando if - else if - else
        System.out.println("\n--- Caso 2: if - else elif ---");
        ejemploIfElseIf(numero); // Llamamos al método ejemploIfElseIf

        // Caso 3: todo en un solo renglón con operador ternario
        System.out.println("\n--- Caso 3: operador ternario un renglón ---");
        ejemploTernario(numero); // Llamamos al método ejemploTernario

        // Cerramos el objeto Scanner para liberar recursos
        sc.close();
    }

    // Caso 1: if - else

    static void ejemploIfElse(int numero) {
        // Si el número es mayor que 0
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } 
        // En cualquier otro caso (cero o negativo)
        else {
            System.out.println("El número no es positivo.");
        }
    }


    // Caso 2: if - else-elif
 
    static void ejemploIfElseIf(int numero) {
        // Si el número es mayor que 0
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } 
        // Si el número es menor que 0
        else if (numero < 0) {
            System.out.println("El número es negativo.");
        } 
        // En cualquier otro caso (exactamente cero)
        else {
            System.out.println("El número es cero.");
        }
    }


    // Caso 3: operador ternario

    static void ejemploTernario(int numero) {
        // Usamos el operador ternario para decidir qué mensaje mostrar
        // (condición ? valor_si_verdadero : valor_si_falso)
        // Aquí anidamos dos ternarios para cubrir positivo, negativo y cero
        System.out.println(
            (numero > 0) ? "El número es positivo." : 
            (numero < 0) ? "El número es negativo." : 
            "El número es cero."
        );
    }
}


