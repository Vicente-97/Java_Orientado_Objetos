package EjemploHerencia;

public class Terrestre extends Vehiculo {
	
	private int numRuedad=0;
	
	public Terrestre(){
		
	}

	public Terrestre(int ruedas, String motor) {
		
		this.numRuedad=ruedas;
		setMotor(motor);
	}

	@Override
	public String toString() {
		return super.toString()+"con"+ numRuedad +"ruedas";
	}

	public int getNumRuedad() {
		return numRuedad;
	}

	public void setNumRuedad(int numRuedad) {
		this.numRuedad = numRuedad;
	}
	
	
}
