package DesarrolloU4;

public class NationalGeographicSeries {

	    private String name;
	    private int episodes;
	    private String topic;

	    public NationalGeographicSeries(String name, int episodes, String topic) {
	        this.name = name;
	        this.episodes = episodes;
	        this.topic = topic;
	    }

	    public void playEpisode(int episodeNumber) {
	        if (episodeNumber > 0 && episodeNumber <= episodes) {
	            System.out.println("Reproduciendo episodio " + episodeNumber + " de " + name + ": " + topic);
	        } else {
	            System.out.println("Episodio no válido.");
	        }
	    }
	}


