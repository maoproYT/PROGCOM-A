// Importas la clase Scanner para poder leer datos del usuario
import java.util.Scanner;

// Defines la clase principal del programa
public class Ejercicio10 {
    // Aquí empieza la ejecución del programa
    public static void main(String[] args) {
        // Creas el objeto Scanner para leer lo que escribes
        Scanner sc = new Scanner(System.in);
        // Definimos un saldo inicial (puedes cambiarlo si quieres)
        double saldo = 1000.0;
        // Te pido ingresar el monto que quieres retirar
        System.out.print("Ingresa el monto a retirar: ");
        // Guardas ese monto en la variable Valor1
        double Valor1 = sc.nextDouble();
        // MÉTODO 1: Usando if - else
        // Verificas si el monto es menor o igual al saldo
        if (Valor1 <= saldo) {
            // Si sí, te mostramos que la operación fue exitosa
            System.out.println("Operación exitosa (if-else). Saldo restante: " + (saldo - Valor1));
        } else {
            // Si no, te avisamos que no tienes suficiente saldo
            System.out.println("Operación rechazada (if-else). Saldo insuficiente.");
        }
        // MÉTODO 2: Usando if - else if - elif
        // Si el monto ingresado es cero
        if (Valor1 == 0) {
            System.out.println("No puedes retirar 0 (if-else if-else).");
        }
        // Si el monto es mayor al saldo
        else if (Valor1 > saldo) {
            System.out.println("Operación rechazada (if-else if-else). Saldo insuficiente.");
        }
        // Si todo está bien, la operación es válida
        else {
            System.out.println("Operación exitosa (if-else if-else). Saldo restante: " + (saldo - Valor1));
        }
        // MÉTODO 3: Usando operador ternario
        // Aquí decides el mensaje en una sola línea
        String resultado = (Valor1 <= saldo) 
                            ? "Operación exitosa (ternario). Saldo restante: " + (saldo - Valor1)
                            : "Operación rechazada (ternario). Saldo insuficiente.";
        // Muestras el resultado final en pantalla
        System.out.println(resultado);
        // Cierras el Scanner porque ya no lo usas
        sc.close();
    }
}
