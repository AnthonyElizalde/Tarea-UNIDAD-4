package DesarrolloU4;

public class MainDeadpool {
	
	    public static void main(String[] args) {
	        // Crear una instancia de la clase Deadpool
	        Deadpool deadpool = new Deadpool("Wade Wilson", "Deadpool", "Regeneración acelerada");
	        
	        // Usar métodos de la clase Deadpool
	        deadpool.makeJoke();
	        deadpool.fight();
	        
	        // Mostrar la información del objeto deadpool usando el método toString()
	        System.out.println(deadpool.toString());
	    }
	}

