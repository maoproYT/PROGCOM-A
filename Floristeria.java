public class Floristeria extends Casa {
    private String nombre_floristeria = "Mauricio"; // nombre fijo
    private String[] tipos_flores;
    private boolean tienePlantasDisponibles = true; // boolean fijo definido aquí

    public Floristeria(String color, int numero_habitaciones, int numero_plantas,
                       boolean tiene_jardin, boolean tiene_terraza, String[] tipos_flores) {

        super(color, numero_habitaciones, numero_plantas, tiene_jardin, tiene_terraza);
        this.tipos_flores = tipos_flores;
    }

    @Override
    public String descripcion() {
        String descripcion_base = super.descripcion();
        String flores = "";

        for (int i = 0; i < tipos_flores.length; i++) {
            flores += tipos_flores[i];
            if (i < tipos_flores.length - 1) {
                flores += ", ";
            }
        }

        String disponibilidad = tienePlantasDisponibles
                ? "Actualmente tiene plantas disponibles para la venta."
                : "Por el momento no tiene plantas disponibles.";

        return descripcion_base + " Esta es la floristería '" + nombre_floristeria +
                "', especializada en flores como: " + flores + ". " + disponibilidad;
    }
}
