package U3;

public class Main3 {

    public static void main(String[] args) {
        try {
            // Creación de un documental válido
            Documental documental = new Documental("Planeta Tierra", 90, "Naturaleza", "Biodiversidad");
            documental.mostrarDetalles();

            // Intentar asignar un tema vacío
            documental.setTema(""); // Esto lanzará una excepción
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
