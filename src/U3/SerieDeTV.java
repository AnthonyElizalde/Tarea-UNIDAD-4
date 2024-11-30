package U3;

public class SerieDeTV {
	
	    private int temporadas;

	    /**
	     * Constructor de SerieDeTV.
	     *
	     * @param titulo            el título de la serie
	     * @param duracionEnMinutos la duración promedio de un episodio en minutos
	     * @param genero            el género de la serie
	     * @param temporadas        el número de temporadas de la serie
	     * @throws IllegalArgumentException si el número de temporadas es negativo
	     */
	    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int temporadas) {
	        
	        if (temporadas < 0) {
	            throw new IllegalArgumentException("El número de temporadas no puede ser negativo.");
	        }
	        this.temporadas = temporadas;
	    }

	    /**
	     * Obtiene el número de temporadas de la serie.
	     *
	     * @return el número de temporadas
	     */
	    public int getTemporadas() {
	        return temporadas;
	    }

	    /**
	     * Establece el número de temporadas de la serie.
	     *
	     * @param temporadas el nuevo número de temporadas (debe ser no negativo)
	     * @throws IllegalArgumentException si el número de temporadas es negativo
	     */
	    public void setTemporadas(int temporadas) {
	        if (temporadas < 0) {
	            throw new IllegalArgumentException("El número de temporadas no puede ser negativo.");
	        }
	        this.temporadas = temporadas;
	    }

	    /**
	     * Muestra los detalles de la serie de TV.
	     */
	    public void mostrarDetalles() {
	        System.out.println("Detalles de la serie de TV:");
	        System.out.println("ID: " + getId());
	        System.out.println("Título: " + getTitulo());
	        System.out.println("Duración promedio de un episodio: " + getDuracionEnMinutos() + " minutos");
	        System.out.println("Género: " + getGenero());
	        System.out.println("Temporadas: " + temporadas);
	        System.out.println();
	    }

		private String getDuracionEnMinutos() {
			// TODO Auto-generated method stub
			return null;
		}

		private String getGenero() {
			// TODO Auto-generated method stub
			return null;
		}

		private String getTitulo() {
			// TODO Auto-generated method stub
			return null;
		}

		private String getId() {
			// TODO Auto-generated method stub
			return null;
		}
	}

