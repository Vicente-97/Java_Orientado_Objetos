package Linea;

import java.util.Objects;

public class Punto {

	private Double puntoA=0.0;
	private Double puntoB=0.0;
	
	
	
	
	
	
	
	
	
	public Punto(Double puntoA, Double puntoB) {
		super();
		this.puntoA = puntoA;
		this.puntoB = puntoB;
	}
	
	public void moverDerecha(double cantidad) {
		this.puntoA+=cantidad;
	}
	
	
	public Double getPuntoA() {
		return puntoA;
	}
	public Double getPuntoB() {
		return puntoB;
	}
	public void setPuntoA(Double puntoA) {
		this.puntoA = puntoA;
	}
	public void setPuntoB(Double puntoB) {
		this.puntoB = puntoB;
	}


	@Override
	public int hashCode() {
		return Objects.hash(puntoA, puntoB);
	}


	@Override
	public boolean equals(Object obj) {
		boolean sonIguales = false;
		
		if (this == obj) {
			sonIguales= true;
		}else {
			Punto other = (Punto) obj;
			if(other !=null &&
				other.getPuntoA().equals(this.puntoA) &&
			other.getPuntoB().equals(this.puntoB));
			sonIguales=true;
		}
		
		return sonIguales;
	}


	@Override
	public String toString() {
		return "Punto [puntoA=" + puntoA + ", puntoB=" + puntoB + "]";
	}

	
}
