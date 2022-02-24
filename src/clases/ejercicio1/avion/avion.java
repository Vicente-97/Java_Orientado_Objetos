package clases.ejercicio1.avion;

public class avion {
	//atributos
		private  String idAvion;
		private  Integer capacidad;
		private  Integer numVuelos=0;
		private  Double kmVolados =0.0;
		private String compannia;
		
		
		//constructores
		
		
		
		public avion(String idAvion, Integer capacidad) {
			super();
			this.idAvion = idAvion;
			this.capacidad = capacidad;
		}

		
		public avion(String idAvion, Integer capacidad, String compannia) {
			super();
			this.idAvion = idAvion;
			this.capacidad = capacidad;
			this.compannia = compannia;
		}


		//metodos
		
		public boolean asignarVuelo(int viajeros, double kilometros ) {
			boolean asignarVuelo=false;
			if (viajeros<=this.capacidad) {
				//this.capacidad-=viajeros;
				this.kmVolados+=kilometros;
				this.numVuelos++;
				asignarVuelo=true;
			}
			return asignarVuelo;
		}
		
		public double totalKm (Integer numVuelos, Double kmVolados) {
			Double resultado=0.0;
			if (numVuelos>0 && kmVolados >0.0) {
				resultado=numVuelos*kmVolados;
			}
			
			return resultado;
			
		}
		
		public double mediaKm (Double kmVolados,Integer numVuelos ) {
			Double mediakm=0.0;
			Double totalKm=0.0;
			
			if (numVuelos>0 && kmVolados >0.0) {
				totalKm=numVuelos*kmVolados;
			}
			if (totalKm>0 ) {
				 mediakm=totalKm/numVuelos;
			}
			 return mediakm;
		}
		
		public String getInformacion() {
			return"Avión con id:"+ getIdAvion()+" de la compañía "+ getCompannia()+" ha realizado\n"
					+ getNumVuelos()+" vuelos, con un total de "+ getKmVolados()+" km y una media de"+ getMediaKms()+" de\n"
					+ "km por vuelo.";
		}
		


		private void setIdAvion(String idAvion) {
			this.idAvion = idAvion;
		}


		private void setCapacidad(Integer capacidad) {
			this.capacidad = capacidad;
		}


		private void setNumVuelos(Integer numVuelos) {
			this.numVuelos = numVuelos;
		}


		private void setKmVolados(Double kmVolados) {
			this.kmVolados = kmVolados;
		}


		public String getCompannia() {
			return compannia;
		}


		public void setCompannia(String compannia) {
			this.compannia = compannia;
		}


		public String getIdAvion() {
			return idAvion;
		}


		public Integer getCapacidad() {
			return capacidad;
		}


		public Integer getNumVuelos() {
			return numVuelos;
		}


		public Double getKmVolados() {
			return kmVolados;
		}
		public Double getMediaKms() {
			 double resultado=0;
			 if (numVuelos>0) {
				 resultado=kmVolados/numVuelos;
			 }
			
			
			return resultado;
		}
		
		public String toString () {
			
			return"avion con id: "+ getIdAvion();		}
}
		
	//getter y setter//
		