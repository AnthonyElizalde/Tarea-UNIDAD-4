package U3;

public class Documental {

    private String tema;

    /**
     * Constructor de Documental.
     *
     * @param titulo            el título del documental
     * @param duracionEnMinutos la duración del documental en minutos
     * @param genero            el género del documental
     * @param tema              el tema principal del documental
     * @throws IllegalArgumentException si el tema es nulo o vacío
     */
    public Documental(String titulo, int duracionEnMinutos, String genero, String tema) {
       
        if (tema == null || tema.trim().isEmpty()) {
            throw new IllegalArgumentException("El tema no puede ser nulo o vacío.");
        }
        this.tema = tema;
    }

    /**
     * Obtiene el tema del documental.
     *
     * @return el tema del documental
     */
    public String getTema() {
        return tema;
    }

    /**
     * Establece el tema del documental.
     *
     * @param tema el nuevo tema del documental
     * @throws IllegalArgumentException si el tema es nulo o vacío
     */
    public void setTema(String tema) {
        if (tema == null || tema.trim().isEmpty()) {
            throw new IllegalArgumentException("El tema no puede ser nulo o vacío.");
        }
        this.tema = tema;
    }

    /**
     * Muestra los detalles del documental.
     */
    public void mostrarDetalles() {
        System.out.println("Detalles del documental:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " minutos");
        System.out.println("Género: " + getGenero());
        System.out.println("Tema: " + tema);
        System.out.println();
    }

	private String getGenero() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getDuracionEnMinutos() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getTitulo() {
		// TODO Auto-generated method stub
		return null;
	}
}