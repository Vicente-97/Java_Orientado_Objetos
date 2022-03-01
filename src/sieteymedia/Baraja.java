package sieteymedia;

import java.util.concurrent.ThreadLocalRandom;

public class Baraja {
	private final Integer numCartas =40;
	private int siguiente;
	private final Integer CARTAS_POR_PALO =12;
	
	private Carta[] cartitas; //pluras importa
	
	public Baraja() {
		super();
		
		this.cartitas= new Carta[numCartas];
		
		int numerodePalos = Palo.values().length;
		
		int cont=0;
		for(int i=0;i<numerodePalos; i++) {
			for(int j=0; j<CARTAS_POR_PALO; j++) {
			cartitas [cont] = new Carta(j+1, Palo.values()[i]);
			cont ++;
		}
		}
		
		
		//for(int i=0; i<numCartas; i++) {
			//cartitas[i]=new Carta((i+1)%12, Palo.BASTOS);
		//}
	}
	
	public void barajar() {
		
	}
	
	
	public int getPosicionAleatoria() {
	return 	ThreadLocalRandom.current().nextInt(0,numCartas);
		
	}
	
}
