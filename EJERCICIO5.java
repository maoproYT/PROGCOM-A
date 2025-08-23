import java.util.Scanner;  

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Permite leer datos desde teclado

        System.out.print("Ingresa un número: ");  
        int Valor1 = sc.nextInt();  // Guarda el número ingresado en Valor1

        // MÉTODO 1: if - else
        if (Valor1 % 2 == 0) {  // Verifica si el residuo de dividir entre 2 es 0
            System.out.println("Par");  // Si es 0 → número par
        } else {
            System.out.println("Impar");  // Si no es 0 → número impar
        }

        // MÉTODO 2: if - else if - else
        if (Valor1 % 2 == 0) {  // Primera condición: par
            System.out.println("Par");
        } else if (Valor1 % 2 != 0) {  // Segunda condición: no es divisible entre 2
            System.out.println("Impar");
        } else {
            System.out.println("Error");  // Caso extra (nunca debería pasar)
        }

        // MÉTODO 3: operador ternario
        System.out.println((Valor1 % 2 == 0) ? "Par" : "Impar");
        // Si la condición es verdadera imprime "Par", si es falsa imprime "Impar"

        sc.close();  // Se cierra el objeto Scanner
    }
}

