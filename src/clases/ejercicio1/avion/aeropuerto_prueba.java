package clases.ejercicio1.avion;

import java.util.Scanner;

public class aeropuerto_prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CrearAviones();
	}
	
	public static void CrearAviones() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuantos aviones quieres crear");
		int opcion = sc.nextInt();
		avion[] aeropuerto= new avion[opcion+1];
		for (int i = 0; i < opcion+1; ++i) {
			aeropuerto [i]= new avion(i+"", 200);
		}
		
		for (int j = 0; j< aeropuerto.length; j++) {
			System.out.println(aeropuerto[j]);
		}
	}
		 
}
