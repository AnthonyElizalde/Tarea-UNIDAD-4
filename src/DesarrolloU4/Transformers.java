package DesarrolloU4;

public class Transformers {

	    private String title;
	    private String director;
	    private int releaseYear;

	    public Transformers(String title, String director, int releaseYear) {
	        this.title = title;
	        this.director = director;
	        this.releaseYear = releaseYear;
	    }

	    public void displayInfo() {
	        System.out.println("Película: " + title + " | Director: " + director + " | Año: " + releaseYear);
	    }

	    public void startBattle() {
	        System.out.println("¡Los Autobots están luchando contra los Decepticons!");
	    }
	}


