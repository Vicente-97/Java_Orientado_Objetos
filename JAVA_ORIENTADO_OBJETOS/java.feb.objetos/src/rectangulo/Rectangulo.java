package rectangulo;
 




public class Rectangulo {
	 private double longitud=1.0;
	 private double ancho=1.0;
	 
	 
	 //construir rectangulo (constructores)//
		 
		 public Rectangulo(double longitud, double ancho) {
				super();
				setLongitud(longitud);
				setAncho(ancho);
				
				
			}
		 
		 
		 
		 //metodos//
		 
		 /**
		  * Calcular el perimetro del rectangulo
		  * Calcular el area del rectangulo
		  * @return
		  */
		 
		 public double CalcularPerimetro() {
			 double resultado=0.0;
			 
			 resultado=(longitud*2)+(ancho*2);
			 
			 
			 return resultado;
		 }
		 
		 
		 public double CalcularArea() {
			 double resultado=0;
			 
			 resultado=ancho*longitud;
			 
			 return resultado;
		 }
	
		 
		 
		 //getter y setter //
		 /**
		  * 	Getter y setter
		  * @param longitud
		  */
		

		public void setLongitud(double longitud) {
			if (longitud>0 && longitud <20) {
				System.out.println("Medidas correctas dentros de los parametros");
				this.longitud = longitud;
			}else {
				throw new RectanguloException("Longitud incorrecta, Medidas no validas");
			}
		}
		

		public void setAncho(double ancho) {
			if (ancho>0 && ancho <20) {
				System.out.println("Medidas correctas dentros de los parametros");
				this.ancho = ancho;
			}else {
			
				throw new RectanguloException("Anchura incorrecta, Medidas no validas");
			}
		}



		public double getLongitud() {
			return longitud;
		}


		public double getAncho() {
			return ancho;
		}



		public String toString () {
			StringBuilder sb= new StringBuilder();
			sb.append("\n el ancho del rectangulo es : \n");
			sb.append(getAncho());
			sb.append("\n la longitud del rectangulo es : \n");
			sb.append(getLongitud());
			sb.append("\n");
			sb.append("\n su perimetro es : \n");
			sb.append(CalcularPerimetro());
			sb.append("\n su area es : \n");
			sb.append(CalcularArea());
			
			return sb.toString();
		}
}
				
				
				
				
				
				