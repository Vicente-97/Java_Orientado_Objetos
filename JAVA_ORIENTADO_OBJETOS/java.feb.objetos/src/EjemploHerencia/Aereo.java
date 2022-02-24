package EjemploHerencia;

public class Aereo extends Vehiculo {

	private  String combustible;
	
	public Aereo () {
		
	}
		
	public Aereo(String combustible) {
			this.combustible=combustible;
	}

		
		
		
		
		
		public String getCombustible() {
			return combustible;
		}

		public void setCombustible(String combustible) {
			this.combustible = combustible;
		}
	}


