package DesarrolloU4;

public class Deadpool {

	    private String realName;
	    private String alias;
	    private String superpower;

	    public Deadpool(String realName, String alias, String superpower) {
	        this.realName = realName;
	        this.alias = alias;
	        this.superpower = superpower;
	    }

	    public void makeJoke() {
	        System.out.println(alias + ": \"¿En serio? ¿Otro cameo?\" ");
	    }

	    public void fight() {
	        System.out.println(alias + " está luchando con " + superpower + ".");
	    }

	    @Override
	    public String toString() {
	        return "Deadpool{" +
	               "realName='" + realName + '\'' +
	               ", alias='" + alias + '\'' +
	               ", superpower='" + superpower + '\'' +
	               '}';
	    }
	}

