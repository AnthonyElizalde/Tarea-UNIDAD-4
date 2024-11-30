package U3;

public class Invetigador {
	public class Investigador {
	    private String nombre;
	    private String campoEspecializacion;

	    public Investigador(String nombre, String campoEspecializacion) {
	        this.nombre = nombre;
	        this.campoEspecializacion = campoEspecializacion;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getCampoEspecializacion() {
	        return campoEspecializacion;
	    }

	    public void setCampoEspecializacion(String campoEspecializacion) {
	        this.campoEspecializacion = campoEspecializacion;
	    }

	    @Override
	    public String toString() {
	        return "Investigadords{" +
	                "nombre='" + nombre + '\'' +
	                ", campoEspecializacion='" + campoEspecializacion + '\'' +
	                '}';
	    }
	}

}
