public class Main {
    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        String[] flores = {"Rosas", "Girasoles", "Claveles", "Lirios"};

        Floristeria miFloristeria = new Floristeria("Blanco", 4, 2, true, true, flores);

        System.out.println("\n" + miFloristeria.descripcion());

        System.out.print("\n¿De qué color te gustaría pintar la floristería Mauricio?: ");
        String nuevoColor = br.readLine();
        miFloristeria.pintar(nuevoColor);

        System.out.println("\nGracias por visitar la floristería Mauricio.");
    }
}
