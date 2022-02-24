package rectangulo;

import java.util.Scanner;

public class rectangulo_main {
	
	public static String MENU_RECTANGULO_OPCIONES="Introduce la opcione que desea\n"
													+ "a--- Para calcular su area \n"
													+ "b--- Para calcular su perímetro";

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce los datos relativos a la longitud");
		 int longitud=Integer.valueOf(sc.nextInt());
		 
		 System.out.println("Introduce los datos de anchura");
		 int ancho=Integer.valueOf(sc.nextInt());
		 
		 Rectangulo rectangulo =new Rectangulo(longitud, ancho);
		
		
		
		try {
			
			
		}catch(Exception errorRectangulo) {
			System.out.println("seha producido una excepcion" + errorRectangulo.getMessage());
		}
		
		
		
	
		
		
		
		System.out.println(MENU_RECTANGULO_OPCIONES);
		Scanner sc1 = new Scanner(System.in);
		String opcion=sc1.nextLine();
		
		
		System.out.println(rectangulo);
		
		
		
		if (opcion.equalsIgnoreCase("a")) {
			System.out.println("El area del rectangulo es: "+ rectangulo.CalcularArea());
		}else if (opcion.equalsIgnoreCase("b")) {
			System.out.println(" es su area "+ rectangulo.CalcularPerimetro());
		}
		
		//System.out.println("El area del rectangulo es: "+ rectangulo.CalcularArea());
		//System.out.println("El area del rectangulo es: "+ rectangulo.CalcularPerimetro());
		
		/*// TODO Auto-generated method stub
		Rectangulo rectanguloCreado=null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce los datos de anchura");
		 int ancho=Integer.valueOf(sc.nextInt());
		System.out.println("Introduce los datos relativos a la longitud");
		 int longitud=Integer.valueOf(sc.nextInt());
		rectanguloCreado=new Rectangulo(longitud, ancho);
		
		System.out.println(MENU_RECTANGULO_OPCIONES);
		Scanner sc1 = new Scanner(System.in);
		String opcion=sc1.nextLine();
		
		
		if (opcion.equalsIgnoreCase("a")) {
			System.out.println("es su perimetro "+rectanguloCreado.CalcularArea());
		}else if (opcion.equalsIgnoreCase("b")) {
			System.out.println(" es su area "+ rectanguloCreado.CalcularPerimetro());
		}*/
		
	
		
	
	
	 
		sc.close();
		sc1.close();
		}
		
	
/*public static Rectangulo RectanguloMenu() {
	int ancho=1;
	int longitud=1;
	Rectangulo rectanguloCreado=null;
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce los datos de anchura");
	ancho=Integer.valueOf(sc.nextInt());
	System.out.println("Introduce los datos relativos a la longitud");
	longitud=Integer.valueOf(sc.nextInt());
	
	
	
	
	return rectanguloCreado = new Rectangulo(longitud,ancho);*/
	
}




