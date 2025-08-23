// Importamos la clase Scanner para poder leer datos que el usuario escriba en teclado
import java.util.Scanner;

// Definimos la clase principal del programa, debe llamarse igual que el archivo (Main.java)
public class Main {

    // Método principal, aquí empieza la ejecución del programa
    public static void main(String[] args) {
        // Creamos un objeto de tipo Scanner para capturar lo que el usuario escriba
        Scanner sc = new Scanner(System.in);

        // Mostramos un mensaje pidiendo la edad
        System.out.print("Ingresa tu edad: ");
        // Leemos el número que el usuario escribe y lo guardamos en la variable "edad"
        int edad = sc.nextInt();

        // -------------------------
        // Caso 1: usando if - else
        // -------------------------
        // Indicamos en pantalla qué caso se está probando
        System.out.println("\n--- Caso 1: if - else ---");
        // Llamamos al método que contiene la lógica de este caso y le pasamos la edad
        ejemploIfElse(edad);

        // -------------------------
        // Caso 2: usando if - else if - else
        // -------------------------
        // Indicamos en pantalla qué caso se está probando
        System.out.println("\n--- Caso 2: if - else elif ---");
        // Llamamos al método que contiene la lógica de este caso y le pasamos la edad
        ejemploIfElseIf(edad);

        // -------------------------
        // Caso 3: usando operador ternario
        // -------------------------
        // Indicamos en pantalla qué caso se está probando
        System.out.println("\n--- Caso 3: operador ternario ---");
        // Llamamos al método que contiene la lógica de este caso y le pasamos la edad
        ejemploTernario(edad);

        // Cerramos el objeto Scanner para liberar memoria y recursos
        sc.close();
    }
    // Caso 1: if - else
    static void ejemploIfElse(int edad) {
        // Preguntamos si la edad es mayor o igual a 18
        if (edad >= 18) {
            // Si la condición es verdadera, mostramos que es mayor de edad
            System.out.println("La persona es mayor de edad.");
        } 
        // En cualquier otro caso (es decir, menor de 18)
        else {
            // Mostramos que es menor de edad
            System.out.println("La persona es menor de edad.");
        }
    }
    // Caso 2: if - else if - else
    static void ejemploIfElseIf(int edad) {
        // Preguntamos si la edad es mayor o igual a 18
        if (edad >= 18) {
            // Si la condición se cumple, mostramos que es mayor de edad
            System.out.println("La persona es mayor de edad.");
        } 
        // Si no se cumplió la primera condición, verificamos si la edad es exactamente 0
        else if (edad == 0) {
            // Si la edad es 0, mostramos un mensaje especial
            System.out.println("La persona acaba de nacer.");
        } 
        // Si no se cumplió ninguna de las anteriores condiciones (es decir, 1 a 17)
        else {
            // Mostramos que es menor de edad
            System.out.println("La persona es menor de edad.");
        }
    }
    // Caso 3: Operador ternario (todo en una sola línea)
    static void ejemploTernario(int edad) {
        // Usamos el operador ternario para decidir el mensaje en una sola línea
        // (condición ? valor_si_verdadero : valor_si_falso)
        // Aquí anidamos 2 ternarios:
        //  - Si la edad es >= 18 -> mayor de edad
        //  - Si la edad == 0 -> acaba de nacer
        //  - Deotra forma -> menor de edad
        System.out.println(
            (edad >= 18) ? "La persona es mayor de edad." :
            (edad == 0) ? "La persona acaba de nacer." :
            "La persona es menor de edad."
        );
    }
}
