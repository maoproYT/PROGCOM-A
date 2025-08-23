// Importamos la clase Scanner para poder leer datos del usuario
import java.util.Scanner;

// Definimos la clase principal Ejercicio9
public class Ejercicio9 {
    // Método principal: aquí comienza la ejecución del programa
    public static void main(String[] args) {

        // Creamos un objeto Scanner para leer el número desde teclado
        Scanner sc = new Scanner(System.in);

        // Pedimos al usuario que ingrese un número
        System.out.print("Ingresa un número: ");
        // Guardamos el valor en la variable Valor1
        int Valor1 = sc.nextInt();

        // MÉTODO 1: Usando if - else
        // Si el número es divisible entre 3 y 5
        if (Valor1 % 3 == 0 && Valor1 % 5 == 0) {
            System.out.println("FizzBuzz (if-else)");
        } 
        else {
            // Si solo es divisible entre 3
            if (Valor1 % 3 == 0) {
                System.out.println("Fizz (if-else)");
            } 
            // Si solo es divisible entre 5
            else if (Valor1 % 5 == 0) {
                System.out.println("Buzz (if-else)");
            } 
            // Si no es divisible ni entre 3 ni entre 5
            else {
                System.out.println(Valor1 + " (if-else)");
            }
        }
            // MÉTODO 2: Usando if - else if - elif
        // Verificamos cada condición en orden de prioridad
        if (Valor1 % 3 == 0 && Valor1 % 5 == 0) {
            System.out.println("FizzBuzz (if-else if-else)");
        } 
        else if (Valor1 % 3 == 0) {
            System.out.println("Fizz (if-else if-else)");
        } 
        else if (Valor1 % 5 == 0) {
            System.out.println("Buzz (if-else if-else)");
        } 
        else {
            System.out.println(Valor1 + " (if-else if-else)");
        }
        // MÉTODO 3: Usando operador ternario
        // Evaluas en una sola línea con operadores ternarios anidados
        String resultado = (Valor1 % 3 == 0 && Valor1 % 5 == 0) ? "FizzBuzz (ternario)" :
                           (Valor1 % 3 == 0) ? "Fizz (ternario)" :
                           (Valor1 % 5 == 0) ? "Buzz (ternario)" :
                           Valor1 + " (ternario)";
        // Muestro el resultado en pantalla
        System.out.println(resultado);
        // Cerra el objeto Scanner para liberar memoria
        sc.close();
    }
}

