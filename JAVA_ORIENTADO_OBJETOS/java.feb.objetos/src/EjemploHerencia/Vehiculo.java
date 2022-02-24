package EjemploHerencia;

import java.util.Objects;

/**
 * clase principal vehiculo
 * @author estudiante
 *
 */

public class Vehiculo {
	
	
	
	private String motor;
	
	
	
	

//constructor//
	
	public Vehiculo() {
		
	}

	public Vehiculo(String motor) {
		this.motor=motor;
	}
	
	
	//metodos//
	
	public void Moverse() {
		System.out.println("me desplazo");
	}
	
	public void Pararse() {
		System.out.println("me paro");
	}


	public String getMotor() {
		return motor;
	}


	public void setMotor(String motor) {
		this.motor = motor;
	}


	@Override
	public String toString() {
		return "Vehiculo con motor= " + motor;
	}


	@Override
	public int hashCode() {
		return Objects.hash(motor);
	}


	@Override
	public boolean equals(Object obj) {
		boolean SonIguales=false;
			
		if (this == obj)
			SonIguales=true;
		else {
			
		Vehiculo other = (Vehiculo) obj;
		return this.getMotor().equals(other.getMotor());
		
	}
		return SonIguales;
	}
}
	


	
	
	
	