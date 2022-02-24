package Linea;

public class PlanoMainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto p1 =new Punto(5.0, 3.0);
		System.out.println(p1);
		
		p1.moverDerecha(2.0);
		System.out.println(p1);
		
		
		
		Punto p2= new Punto(-5.0, 3.0);
		System.out.println(p2);
		
		
		
		Linea linea =new Linea(p1, p2);
		System.out.println(linea);
	}

}
