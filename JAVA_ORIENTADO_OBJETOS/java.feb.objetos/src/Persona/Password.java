package Persona;

public class Password {
	
	private Integer longitud=8;
	private String contrasenna;
	
	
	
	
	
	
	
	
	// constructor //
	
	
	public Password (int longitud) {
		
	}
	
	
	
	
	
	
	// getter y setter y metódos equals , etc..
	
	
	
	public Integer getLongitud() {
		return this.longitud;
	}
	public String getContrasenna() {
		return contrasenna;
	}
	public void setLongitud(Integer longitud) {
		this.longitud = longitud;
	}
	public void setContrasenna(String contrasenna) {
		this.contrasenna = contrasenna;
	}
	
	public int NumeroAleatorio() {
		return (int) Math.random()*100;
	}
	

		
		
	}


