// Importamos la clase Scanner para leer entrada desde teclado
import java.util.Scanner;

// Definimos la clase principal Ejercicio8
public class Ejercicio8 {
    // Método principal: punto de inicio del programa
    public static void main(String[] args) {

        // Creamos el objeto Scanner para leer lo que escribe el usuario
        Scanner sc = new Scanner(System.in);

        // Mostramos un mensaje pidiendo la contraseña
        System.out.print("Ingresa una contraseña: ");
        // Guardamos la contraseña ingresada en la variable tipo String
        String password = sc.nextLine();

        // -------------------------------
        // MÉTODO 1: Usando if - else
        // -------------------------------

        // Verificamos si cumple todas las reglas:
        // - longitud mayor a 8
        // - contiene al menos un número
        // - contiene al menos una letra mayúscula
        if (password.length() > 8 && password.matches(".*[0-9].*") && password.matches(".*[A-Z].*")) {
            // Si cumple todas las condiciones
            System.out.println("Contraseña válida (if-else)");
        } else {
            // Si no cumple alguna condición
            System.out.println("Contraseña inválida (if-else)");
        }

        // -------------------------------
        // MÉTODO 2: Usando if - else if - elIF// -------------------------------

        // Primero verificamos si la contraseña es demasiado corta
        if (password.length() <= 8) {
            System.out.println("Contraseña inválida: debe tener más de 8 caracteres (if-else if-else)");
        }
        // Si no tiene números
        else if (!password.matches(".*[0-9].*")) {
            System.out.println("Contraseña inválida: debe contener al menos un número (if-else if-else)");
        }
        // Si no tiene mayúsculas
        else if (!password.matches(".*[A-Z].*")) {
            System.out.println("Contraseña inválida: debe contener al menos una mayúscula (if-else if-else)");
        }
        // Si cumple todo
        else {
            System.out.println("Contraseña válida (if-else if-else)");
        }
        // -------------------------------
        // MÉTODO 3: Usando operador ternario
        // -------------------------------
        // Usamos el operador ternario para evaluar en una sola línea
        String resultado = (password.length() > 8 && password.matches(".*[0-9].*") && password.matches(".*[A-Z].*"))
                            ? "Contraseña válida (ternario)"
                            : "Contraseña inválida (ternario)";
        // Mostramos el resultado final
        System.out.println(resultado);
        // Cerramos el Scanner para liberar recursos
        sc.close();
    }
}
