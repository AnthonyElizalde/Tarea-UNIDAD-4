package U3;

import java.awt.Component;
import java.time.temporal.Temporal;
import javax.swing.JList;

public class Serie {
	    private String titulo;
	    private JList<Temporal> temporadas;

	    public Serie(String titulo) {
	        this.titulo = titulo;
	        this.temporadas = new JList<>();
	    }

	    public String getTitulo() {
	        return titulo;
	    }

	    public void setTitulo(String titulo) {
	        this.titulo = titulo;
	    }

	    public <Temporada> JList<Temporal> getTemporadas() {
	        return temporadas;
	    }

	    public void agregarTemporada(Component temporada) {
	        this.temporadas.add(temporada);
	    }

	    @SuppressWarnings("deprecation")
		@Override
	    public String toString() {
	        return "Serie{" +
	                "titulo='" + titulo + '\'' +
	                ", temporadas=" + temporadas.size() +
	                '}';
	    }
	}


