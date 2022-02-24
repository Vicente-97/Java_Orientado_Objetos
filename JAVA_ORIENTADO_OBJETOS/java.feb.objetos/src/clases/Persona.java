package clases;

public class Persona {
	
	//atributos --> características
	private String nombre = "nombre_por_defecto";
	private String apellidos = "apellidos_por_defecto";
	private int edad;
	private double altura;
	protected String dni;

	
	// Constructores
	public Persona() {	}	
	
	public Persona(String name, String surname) {
		this.apellidos = surname;
		this.nombre = name;
	}
	
	private Persona(String name, String apellidos, int age, double height) {
		if(! name.isEmpty()) {
			this.nombre=name;
		}
		if(!apellidos.isEmpty()) {
			this.apellidos=apellidos;
		}
		if(age > 0 && age <150) {
			edad = age;
		}
		if(height > 0 && height <3) {
			altura = height;
		}
		
	}
	
	//métodos
	public void saludar() {
		System.out.println(
				"Hola, mi nombre es "
						+this.nombre+
					" "+ this.apellidos+
				" tengo "+ this.edad + " años y mido "+
				this.altura + " metros");
	}

	
	//getter y setter

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if(edad > 0 && edad <150) {
			this.edad = edad;
		}
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
}
	
	
