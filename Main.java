public class Main {
    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        System.out.print("Escribe el nombre de la floristería: ");
        String nombre = br.readLine();

        String[] flores = {"Rosas", "Tulipanes", "Orquídeas"};

        Floristeria miFloristeria = new Floristeria("Rosa", 2, 1, true, false, nombre, flores);

        System.out.println(miFloristeria.descripcion());

        System.out.print("¿De qué color quieres pintar la casa?: ");
        String nuevoColor = br.readLine();

        miFloristeria.pintar(nuevoColor);
    }
}