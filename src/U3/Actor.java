package U3;

public class Actor {
	
	    private String nombre;
	    private String nacionalidad;

	    public Actor(String nombre, String nacionalidad) {
	        this.nombre = nombre;
	        this.nacionalidad = nacionalidad;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getNacionalidad() {
	        return nacionalidad;
	    }

	    public void setNacionalidad(String nacionalidad) {
	        this.nacionalidad = nacionalidad;
	    }

	    @Override
	    public String toString() {
	        return "Actor{" +
	                "nombre='" + nombre + '\'' +
	                ", nacionalidad='" + nacionalidad + '\'' +
	                '}';
	    }
	}

