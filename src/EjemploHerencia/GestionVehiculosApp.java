package EjemploHerencia;

public class GestionVehiculosApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehiculo coche =new Vehiculo("diesel");
		
		Terrestre v =new Terrestre();
		
		v =new Terrestre(3, "diesel");
		
		Terrestre[] garaje= new Terrestre[10];
		Coche ferrari=new Coche();
		Coche panda=new Coche();
		Moto kawasaki = new Moto();
		Moto Ducati  = new Moto();
		//////////////////////////////////
		
		Aereo [] hangar = new Aereo[5];
		
		Avion iberia =new Avion("ididid");
		Avion vueling =new Avion("jsjds");
		
		Dron dron1 = new Dron(4, "Bateria");
		Dron dron2 = new Dron(5, "Bateria");
		
		//garaje aereo//
		hangar[0]=iberia;
		hangar[1]=vueling;
		hangar[2]=dron1;
		hangar[3]=dron2;
		
		
		//garaje normal//
		garaje[0]=ferrari;
		garaje[1]=panda;
		garaje[2]=kawasaki;
		garaje[3]=Ducati;
	}
	
}
