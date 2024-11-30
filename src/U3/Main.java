package U3;

public class Main {

    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula("Inception", 148, "Ciencia Ficción", "Christopher Nolan");
        pelicula.mostrarDetalles();

        Pelicula otraPelicula = new Pelicula("Titanic", 195, "Romance", "James Cameron");
        otraPelicula.mostrarDetalles();
    }
}
