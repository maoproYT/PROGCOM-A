// Importamos la clase Scanner para poder leer datos desde el teclado
import java.util.Scanner;

// Definimos la clase principal llamada Ejercicio7
public class Ejercicio7 {
    // Método principal: aquí inicia la ejecución del programa
    public static void main(String[] args) {

        // Creamos un objeto Scanner para leer datos del usuario por consola
        Scanner sc = new Scanner(System.in);

        // Mostramos un mensaje para que el usuario ingrese un año
        System.out.print("Ingresa un año: ");
        // Guardamos el número ingresado en la variable Valor1
        int Valor1 = sc.nextInt();
        // -------------------------------
        // MÉTODO 1: Usando if - else
        // -------------------------------
        // Verificamos si el año es divisible entre 4 y no entre 100, o si es divisible entre 400
        if ((Valor1 % 4 == 0 && Valor1 % 100 != 0) || (Valor1 % 400 == 0)) {
            // Si se cumple la condición, es un año bisiesto
            System.out.println("Es bisiesto (if-else)");
        } else {
            // Si no se cumple, no es bisiesto
            System.out.println("No es bisiesto (if-else)");
        }
        // -------------------------------
        // MÉTODO 2: Usando if - else if - eLfi
        // -------------------------------
        // Primero verificamos si el año es divisible entre 400
        if (Valor1 % 400 == 0) {
            System.out.println("Es bisiesto (if-else if-else)");
        }
        // Si no es divisible entre 400, verificamos si es divisible entre 100
        else if (Valor1 % 100 == 0) {
            System.out.println("No es bisiesto (if-else if-else)");
        }
        // Si no es divisible entre 100, verificamos si es divisible entre 4
        else if (Valor1 % 4 == 0) {
            System.out.println("Es bisiesto (if-else if-else)");
        }
        // Si no cumple ninguna de las condiciones anteriores
        else {
            System.out.println("No es bisiesto (if-else if-else)");
        }
        // -------------------------------
        // MÉTODO 3: Usando operador ternario
        // -------------------------------
        // Guardamos en una variable el resultado de la condición usando el operador ternario
        String resultado = ((Valor1 % 4 == 0 && Valor1 % 100 != 0) || (Valor1 % 400 == 0)) 
                             ?"Es bisiesto (ternario)" 
                            : "No es bisiesto (ternario)";
        // Imprimimos el resultado
        System.out.println(resultado);
        // Cerramos el objeto Scanner para liberar recursos
        sc.close();
    }
}
