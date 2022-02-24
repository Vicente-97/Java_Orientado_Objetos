package Complejo;

public class CalculadoraApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Complejo[] arrayComplejos = new Complejo [5];
		
		
		Complejo c1 = new Complejo (3.0,3.0);
		Complejo c2 = new Complejo (2.0,1.0);
		Complejo c3 = new Complejo (3.0,3.0);
		
		arrayComplejos[0]=c1;
		arrayComplejos[1]=c2;
		arrayComplejos[2]=c3;
		
		//acceder a la ultima poscion//
		
		arrayComplejos[arrayComplejos.length-1]= new Complejo(2.0,5.0);
		// sumar posiciones de complejos, es necesario llamar al metodo//
		arrayComplejos[0].suma(arrayComplejos[2]);
		
		//Asignar a una variable el complejo creado en la ultima posicion//
		Complejo c4=arrayComplejos[arrayComplejos.length-1];
		
		//Probar metodos de suma//
		 Complejo resultadoSuma= c1.suma(c2);
		 resultadoSuma = c2.suma(c1);

		 System.out.println(c1.equals(c3));
	}
	
	/**
	 * [1, 0, 0]
	 * [0, 1, 0]
	 * [0, 0, 1]
	 */
	public static void crearMatrizDiagonal() {
		int [][]matriz = new int[3][3];
		
		matriz [0][0]=1;
		matriz [1][1]=1;
		matriz [2][2]=1;
		
		
		matriz [0][1]=0;
		matriz [0][2]=0;
		
		matriz [1][0]=0;
		matriz [1][2]=0;
		
		matriz [2][0]=0;
		matriz [2][1]=0;
		
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j< matriz[i].length; j++) {
				if(i==j) {
					matriz [i][j]=1;
				}else {
					matriz [i][j]=0;
				}
			}
		}
		
		System.out.println(matriz);
	}
	
	
	
	
}

