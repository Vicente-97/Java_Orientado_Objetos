package EjemploHerencia;

public class Dron extends Aereo {

	
	private Integer numAlas=0;
	
	public Dron(int alas,  String combustible) {
		setCombustible(combustible);
		this.numAlas=alas;
	}

	
	
	
	
	public Integer getNumAlas() {
		return numAlas;
	}

	public void setNumAlas(Integer numAlas) {
		numAlas = numAlas;
	}
}
