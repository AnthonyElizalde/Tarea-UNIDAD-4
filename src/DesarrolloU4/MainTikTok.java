package DesarrolloU4;

public class MainTikTok {
	
	    public static void main(String[] args) {
	        // Crear una instancia de la clase TikTok
	        TikTok tiktok = new TikTok("DanceKing123", 1000, 50000);
	        
	        // Usar métodos de la clase TikTok
	        tiktok.postVideo("Nueva coreografía de moda");
	        tiktok.gainFollowers(200);
	        
	        // Mostrar la información del objeto tiktok usando el método toString()
	        System.out.println(tiktok.toString());
	    }
	}


