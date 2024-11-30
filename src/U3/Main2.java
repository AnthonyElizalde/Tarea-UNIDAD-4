package U3;

public class Main2 {

    public static void main(String[] args) {
        try {
            SerieDeTV serie = new SerieDeTV("Breaking Bad", 45, "Drama", 5);
            serie.mostrarDetalles();
            
            serie.setTemporadas(6);
            serie.mostrarDetalles();
            
            // Intentar establecer un número negativo de temporadas
            serie.setTemporadas(-1); // Esto lanzará una excepción
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
