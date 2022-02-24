package Familia;

public class Familia_mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Familia javier= new Familia("Villarreal", "Javier", "Hinojo");
		
		Familia vicente= new Familia("Villarreal", "Vicente", "Hinojo");
		
		
		System.out.println(javier.esHermano(vicente));
		
		
	}

}
