package Complejo;

public class ejemploMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		crearMatrizDiagonal(3);
		//ImprimirMatriz(crearMatrizDiagonal(5));
	}

		/**
		 * [1, 2, 3]
		 * [4, 5, 6]
		 * [7, 8, 9]
		 */
		public static void crearMatrizDiagonal( int tamaño) {
			int [][]matriz = new int[tamaño][tamaño];
			
			int variable = 1;
			
			StringBuilder Imprimir = new StringBuilder();
			
			
			for (int i=0; i<matriz.length; i++) {
				for (int j=0; j< matriz[i].length; j++) {
					matriz[i][j]=variable;
					Imprimir.append(variable);
					variable ++;
				}
				Imprimir.append(" \n");
			}
			
			System.out.println(Imprimir);
	

	/*public static void ImprimirMatriz(int matriz [][]) {
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j< matriz[i].length; j++) {
				
				System.out.println(matriz);*/
	}
			
			
	
		
		
}


