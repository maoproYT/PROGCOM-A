
public class Casa {
    private String color;
    private int numero_habitaciones;
    private int numero_plantas;
    private boolean tiene_jardin;
    private boolean tiene_terraza;

    public Casa(String color, int numero_habitaciones, int numero_plantas, boolean tiene_jardin, boolean tiene_terraza) {
        this.color = color;
        this.numero_habitaciones = numero_habitaciones;
        this.numero_plantas = numero_plantas;
        this.tiene_jardin = tiene_jardin;
        this.tiene_terraza = tiene_terraza;
    }

    public String descripcion() {
        String descripcion = "La casa es de color " + this.color + ", tiene " + this.numero_habitaciones +
                " habitaciones y " + this.numero_plantas + " plantas.";
        if (this.tiene_jardin) {
            descripcion += " Tiene jardín.";
        }
        if (this.tiene_terraza) {
            descripcion += " Tiene terraza.";
        }
        return descripcion;
    }

    public void pintar(String nuevoColor) {
        this.color = nuevoColor;
        System.out.println("Nuevo color de la casa: " + this.color);
    }
}
