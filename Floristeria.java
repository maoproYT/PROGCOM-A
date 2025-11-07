

public class Floristeria extends Casa {
    private String nombre_floristeria;
    private String[] tipos_flores;

    public Floristeria(String color, int numero_habitaciones, int numero_plantas, boolean tiene_jardin, boolean tiene_terraza,
                       String nombre_floristeria, String[] tipos_flores) {
        super(color, numero_habitaciones, numero_plantas, tiene_jardin, tiene_terraza);
        this.nombre_floristeria = nombre_floristeria;
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
        return descripcion_base + " Esta es la floristería '" + nombre_floristeria + "' y tiene las siguientes flores: " + flores + ".";
    }
}
