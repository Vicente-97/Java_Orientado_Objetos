package MaquinaCafe;

import java.util.Scanner;

public class MaquinaCafeApp {
	
	public static String MENU_OPCIONES_MAQUINA="1----Servir café solo (1 euro) \n"
			+ "2----Servir leche (0,8 euros)\n"
			+ "3----Servir café con leche (1,5 euros)\n"
			+ "4----Consultar estado máquina. Aparecen los datos de los depósitos y del monedero \n"
			+ "5----Apagar máquina y salir";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		MaquinaCafe MaquinaCafe=new MaquinaCafe();
		
		Scanner sc =new Scanner(System.in);
		System.out.println(MENU_OPCIONES_MAQUINA);
		System.out.println("Elija una de las siguientes opciones");

		
		String opcion=sc.nextLine();
	while (!opcion.equalsIgnoreCase("5")) {
		try {
			
			if(opcion.equalsIgnoreCase("1")) {
				System.out.println("Cuanto dinero va a depositar?");
				Double dineroCliente= Double.valueOf(sc.nextInt());
				
				System.out.println(MaquinaCafe.ServirCafe(dineroCliente));
			}else if (opcion.equalsIgnoreCase("2")) {
				System.out.println("Cuanto dinero va a depositar?");
				Double dineroCliente=Double.valueOf(sc.nextInt());
				
				System.out.println(MaquinaCafe.ServirLeche(dineroCliente));
			}else if (opcion.equalsIgnoreCase("3")) {
				System.out.println("Cuanto dinero va a depositar?");
				Double dineroCliente=Double.valueOf(sc.nextInt());
				
				System.out.println(MaquinaCafe.ServirCafeConLeche(dineroCliente));
			}else if (opcion.equalsIgnoreCase("4")) {
				
				System.out.println(MaquinaCafe);
				
			}else if (opcion.equalsIgnoreCase("5")) {
				System.out.println("Maquina apagada");
			}
			
			System.out.println(MENU_OPCIONES_MAQUINA);
			opcion=sc.nextLine();
		
		
			
			
		}catch(Exception errorMaquina) {
			System.out.println("se ha producido una excepcion " + errorMaquina.getMessage());
		}
		
	
		
	
		}
	
	}
}
