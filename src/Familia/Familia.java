package Familia;

public class Familia {

	private Integer edad;
	private String apellido1;
	private String nombre;
	private String dni;
	private String apellido2;
	private double altura;
	private double peso;
	
	
	private Familia progenitor1;
	private Familia progenitor2;
	
	
	
	
	public Familia(String apellido1, String nombre, String apellido2) {
		super();
		this.apellido1 = apellido1;
		this.nombre = nombre;
		this.apellido2 = apellido2;
	}

	//Override//
	

	public Integer getEdad() {
		return edad;
	}

	public String getApellido1() {
		return apellido1;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDni() {
		return dni;
	}

	public double getAltura() {
		return altura;
	}

	public double getPeso() {
		return peso;
	}

	public Familia getProgenitor1() {
		return progenitor1;
	}

	public Familia getProgenitor2() {
		return progenitor2;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setProgenitor1(Familia progenitor1) {
		this.progenitor1 = progenitor1;
	}

	public void setProgenitor2(Familia progenitor2) {
		this.progenitor2 = progenitor2;
	}
	
	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public boolean esHermano(Familia personaDesconocida) {
		boolean sonHermanos = false;
	
		Familia convertida = personaDesconocida;
		
		sonHermanos = this.apellido1.equals(personaDesconocida.getApellido1())
				&& this.apellido2.equals(personaDesconocida.getApellido2());
				
		
		return sonHermanos;
	}


public boolean equals(Object familiaDesconocida) {
	boolean sonLaMismaPersona = false;
	
	Familia convertida = (Familia) familiaDesconocida;
	
	sonLaMismaPersona = this.dni.equals(convertida.getDni())
			&& this.nombre.equals(convertida.getNombre());
	
	return sonLaMismaPersona;
}
}