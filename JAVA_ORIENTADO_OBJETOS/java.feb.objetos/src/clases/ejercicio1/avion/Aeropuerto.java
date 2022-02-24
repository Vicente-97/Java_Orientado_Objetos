package clases.ejercicio1.avion;

import java.util.Scanner;

public class Aeropuerto {
	
	public static String MENU_SECUNDARIO="Seleccione una opcion \n"
											+ "a-- asignar vuelo \n"
											+ "b-- obtener numero vuelos \n"
											+ "c-- obtener numero KM volados \n"
											+ "d-- obetener media de km volados \n"
											+ "e-- cambio de compañia \n"
													+ "f-- monstrar informacion\n"
													+ "g-- salir \n";

	public static void main(String[] args) {
	
		 avion jumbo = crearAvionConMenu();
		
		/*avion jumbo =new avion("iddd55",120);
		avion boeing = new avion("id47484", 120, "iberia");*/
		
		/*jumbo.asignarVuelo(100, 1000);
		jumbo.asignarVuelo(180, 1000);
		jumbo.asignarVuelo(50, 1000);*/
		 
		Scanner sc=new Scanner(System.in);
		
		
		
		System.out.println(MENU_SECUNDARIO);
		
		String opcion=sc.nextLine();
		
		while(!opcion.equalsIgnoreCase("g")){
			
		
			
			if (opcion.equalsIgnoreCase("a")) {
				
				System.out.println("Cuantos viajeros van en este viaje");
				int numeroViajeros=Integer.valueOf(sc.nextLine());	
				System.out.println("Cuantos km recorre este viaje");
				int kmsrecorrido=Integer.valueOf(sc.nextLine());
			
				
				
				
				if (jumbo.asignarVuelo(numeroViajeros, kmsrecorrido)) {
					System.out.println("Vuelo asginado correctamente");
				}else {
					System.out.println("el numero de pasajeros excede la capacidad");
				}
				
				
				
			}else if (opcion.equalsIgnoreCase("b")) {
				System.out.println(jumbo.getNumVuelos());
			}else if (opcion.equalsIgnoreCase("c")){
				System.out.println(jumbo.getKmVolados());
			}else if (opcion.equalsIgnoreCase("d")) {
				System.out.println(jumbo.getMediaKms());
			}else if (opcion.equalsIgnoreCase("e")) {	
				System.out.println("Que nueva compaña quiere");
				String nuevaCompañia=sc.nextLine();
				jumbo.setCompannia(nuevaCompañia);
				System.out.println("Su compañia se ha cambiado");
				System.out.println("Su nueva compañia es"+ jumbo.getCompannia());
			}else if (opcion.equalsIgnoreCase("f")) {
				System.out.println(jumbo.getInformacion());
			}
			System.out.println(MENU_SECUNDARIO);
			opcion=sc.nextLine();
		}
		
		
		/*jumbo.setCompannia("vuyeling");
		jumbo.getCompannia();*/
		
		
		
	}
	public static avion crearAvionConMenu() {
		System.out.println("1- crear un avion solo con el identificador. \n"
				+ "2- crear avion con el identificador y compañia\n"
				+ "#########################");
		int capacidad=0;
		avion avioncreado= null;
		Scanner sc=new Scanner (System.in);
		int opcion1=Integer.valueOf(sc.nextLine());
		
		
		if (opcion1==1) {
			System.out.println("Introduce el id del avion");
			String identificador= sc.nextLine();
			System.out.println("Introduzca la capacidad");
			capacidad=Integer.valueOf(sc.nextLine());
			
			avioncreado=new avion(identificador, capacidad);
			
		}else if (opcion1==2) {
			System.out.println("Introduce el id del avion");
			String identificador= sc.nextLine();
			System.out.println("Introduzca  de la compañia");
			String compañia=(sc.nextLine());
			System.out.println("Introduzca la capacidad");
			capacidad=Integer.valueOf(sc.nextLine());
			
			avioncreado=new avion(identificador, capacidad, compañia);
			
		}else {
			System.out.println("LA OPCION INTRODUCIDA NO ES CORRECTA");
		}
		
		return avioncreado;
	}
	
	
}
