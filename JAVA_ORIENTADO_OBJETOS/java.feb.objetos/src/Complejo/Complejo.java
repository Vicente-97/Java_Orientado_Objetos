package Complejo;

import java.util.Objects;

public class Complejo {
	
	private Double real;
	private Double imaginario;
	
	public Complejo( ) {}

	public Complejo(Double real, Double imaginario) {
		super();
		this.real = real;
		this.imaginario = imaginario;
	}
	
	public Complejo suma(Complejo otroComplejo) {
		double real = this.real + otroComplejo.getReal();
		double imaginario = this.imaginario + otroComplejo.getImaginario();
		
		return new Complejo(real, imaginario);
		
		
		
	}

	public Double getReal() {
		return real;
	}

	public Double getImaginario() {
		return imaginario;
	}

	public void setReal(Double real) {
		this.real = real;
	}

	public void setImaginario(Double imaginario) {
		this.imaginario = imaginario;
	}

	@Override
	public String toString() {
		return  "(" + real + "," + imaginario + ")";
	}

	@Override
	public int hashCode() {
		return Objects.hash(imaginario, real);
	}

	@Override
	public boolean equals(Object obj) {
		
		Complejo otro=(Complejo) obj;
		boolean sonIguales=false;
		
		
		if (this.real.equals(otro.getReal()) && this.imaginario.equals(otro.getImaginario())){
			sonIguales=true;
		}
		
		return sonIguales;
	}
	
}
