import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Permite leer datos desde teclado

        System.out.print("Ingresa el primer número: ");
        int Valor1 = sc.nextInt();  // Primer valor ingresado

        System.out.print("Ingresa el segundo número: ");
        int Valor2 = sc.nextInt();  // Segundo valor ingresado

        System.out.print("Ingresa el tercer número: ");
        int Valor3 = sc.nextInt();  // Tercer valor ingresado
        // MÉTODO 1: if - else
        int mayor1;
        if (Valor1 >= Valor2 && Valor1 >= Valor3) {  // Si Valor1 es mayor o igual a los otros dos
            mayor1 = Valor1;
        } else if (Valor2 >= Valor1 && Valor2 >= Valor3) {  // Si Valor2 es mayor o igual
            mayor1 = Valor2;
        } else {
            mayor1 = Valor3;  // Si no, el mayor es Valor3
        }
        System.out.println("Mayor (if-else): " + mayor1);
        // MÉTODO 2: if - else if - elif
        int mayor2;
        if (Valor1 >= Valor2 && Valor1 >= Valor3) {  
            mayor2 = Valor1;
        } else if (Valor2 >= Valor1 && Valor2 >= Valor3) {  
            mayor2 = Valor2;
        } else if (Valor3 >= Valor1 && Valor3 >= Valor2) {  
            mayor2 = Valor3;
        } else {
            mayor2 = -1;  // Caso de error (no debería ocurrir)
        }
        System.out.println("Mayor (if-else if-else): " + mayor2);
        // MÉTODO 3: Operador ternario (encadenado)
        int mayor3 = (Valor1 >= Valor2) 
                        ? (Valor1 >= Valor3 ? Valor1 : Valor3) 
                        : (Valor2 >= Valor3 ? Valor2 : Valor3);
        System.out.println("Mayor (ternario): " + mayor3);
        sc.close();  // Se cierra el Scanner
    }
}
