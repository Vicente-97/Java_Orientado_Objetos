package EjemploHerencia;

public class Avion extends Aereo {

	private String id;
	
	public Avion (String id) {
		setCombustible("keroseno");
		this.id=id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
