package Banco;


import java.util.Scanner;

public class Cuenta_main {
	
	public static String MENU_OPCIONES_CUENTA="Introduce la opcion que desee realizar \n"
			+ "a--- Hacer un reintegro, se pedirá la cantidad a retirar. \n"
			+ "b---Hacer un ingreso, se pedirá la cantidad a ingresar. \n"
			+ "c--- Consultar el saldo y el número de reintegros e ingresos realizados. \n"
			+ "d--- informar del saldo al final de todas las operaciones. \n"
			+ "e--- salir";


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			// TODO Auto-generated method stub
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduce tu Saldo Inicial");
			double saldo=Double.valueOf(sc.nextInt());
			
			Cuenta cuenta = new Cuenta(saldo);
			
			System.out.println(MENU_OPCIONES_CUENTA);
			Scanner sc1 = new Scanner(System.in);
			String opcion=sc1.nextLine();
			
		while(!opcion.equalsIgnoreCase("e")) {
			if (opcion.equalsIgnoreCase("a")) {
				System.out.println("Introduce la cantidad a retirar");
				double reintegro=Double.valueOf(sc.nextInt());
				cuenta.setReintegro(reintegro);
				if (reintegro<saldo) {
					System.out.println("Este es su saldo final, despues del reintegro "+ cuenta.RetirarCuenta());
				}else {
					System.out.println("Imposible realizar el reintegro, cantidad a retirar mayor a su saldo.");
				}
			}else if (opcion.equals("b")) {
				System.out.println("Introduce la cantidad a ingresar");
				double ingreso=Double.valueOf(sc.nextInt());
				cuenta.setIngreso(ingreso);
				if (ingreso>0) {
					System.out.println("Este es su saldo final despúes de realizar el ingreso "+ cuenta.IngresarCuenta());
				}else {
					System.out.println("Imposible realizar un ingreso menor a 0, cantidad incorrecta");
				}
			}else if (opcion.equalsIgnoreCase("c")) {
				System.out.println(" Este es su saldo " + cuenta.ConsultarSaldo()+ " Este es el numero de ingresos " + cuenta.getContadorIngresos()+ " Este es el numero total de reintegros "+ cuenta.getContadorReintegros());
			}else if (opcion.equalsIgnoreCase("d")) {
				System.out.println("Este es su saldo final "+ cuenta.getSaldo()+ " Ha realizado un total de "+ cuenta.getContadorIngresos()+ " Ingresos "+ " Un total de "+ cuenta.getContadorReintegros()+ " Reintegros ");
			}else if (opcion.equalsIgnoreCase("e")) {
				System.out.println("El programa ha terminado, muchas gracias");
						
			}
			
			System.out.println(MENU_OPCIONES_CUENTA);
			opcion=sc1.nextLine();
		}
		
	}
	}


	
	
	
	
	
	
	


