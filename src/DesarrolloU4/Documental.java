package DesarrolloU4;

public class Documental {
	
	    private String titulo;
	    private String director;
	    private String tema;
	    private int duracionMinutos;
	    private int anioLanzamiento;

	    public Documental(String titulo, String director, String tema, int duracionMinutos, int anioLanzamiento) {
	        this.titulo = titulo;
	        this.director = director;
	        this.tema = tema;
	        this.duracionMinutos = duracionMinutos;
	        this.anioLanzamiento = anioLanzamiento;
	    }

	    // Método para mostrar información del documental
	    public void mostrarInformacion() {
	        System.out.println("Documental: " + titulo);
	        System.out.println("Director: " + director);
	        System.out.println("Tema: " + tema);
	        System.out.println("Duración: " + duracionMinutos + " minutos");
	        System.out.println("Año de lanzamiento: " + anioLanzamiento);
	    }

	    // Método para simular la reproducción del documental
	    public void reproducir() {
	        System.out.println("Reproduciendo el documental \"" + titulo + "\"...");
	    }

	    // Método para evaluar el documental
	    public void calificar(int estrellas) {
	        if (estrellas < 1 || estrellas > 5) {
	            System.out.println("Por favor, introduce una calificación válida (1-5 estrellas).");
	        } else {
	            System.out.println("Has calificado el documental \"" + titulo + "\" con " + estrellas + " estrellas.");
	        }
	    }
	}


