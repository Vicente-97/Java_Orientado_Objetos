package MaquinaCafe;

public class MaquinaCafe {

	private int depositoCafe;
	private int depositoLeche;
	private int depositoVasos;
	private double monedero=10.0;
	private double saldo=0;
	
	private final double PRECIO_CAFE=1.0;
	private final double PRECIO_LECHE=0.8;
	private final double PRECIO_CAFE_LECHE=1.5;
	
	private final int CAPACIDAD_MAX_CAFE=50;
	private final int CAPACIDAD_MAX_CAFE_LECHE=50;
	private final int CAPACIDAD_MAX_VASOS=50;
	
	
	//constructor//
	
	
	public MaquinaCafe() {
		llenarDepositos();
	}
	
	
	/*public MaquinaCafe(int depositoCafe, int depositoLeche, int depositoVasos, double monedero) {
		super();
		 depositoCafe =this.depositoCafe;
		 depositoLeche =this.depositoLeche;
		 depositoVasos = this.depositoVasos;
		 monedero =this.monedero;*/
	
	
	// metodos //
	
	
	public void llenarDepositos() {
		this.depositoCafe=CAPACIDAD_MAX_CAFE;
		this.depositoLeche=CAPACIDAD_MAX_CAFE_LECHE;
		this.depositoVasos=CAPACIDAD_MAX_VASOS;
	}
	
	public String ServirCafe(double dineroCliente) {
		double cambio=0.0;
		String Resultado="";
		
		
		if(dineroCliente>PRECIO_CAFE && dineroCliente<monedero+PRECIO_CAFE) {
			cambio=dineroCliente-PRECIO_CAFE;
			monedero-=dineroCliente;
			monedero+=PRECIO_CAFE;
		setDepositoCafe(depositoCafe-1);
		setDepositoVasos(depositoVasos-1);
			Resultado="Producto Servido";
			
		}else {
			throw new MaquinaCafeExceptions("Error de precio");
		}
			return Resultado;
	}
	public String ServirLeche(double dineroCliente) {
		double cambio=0.0;
		String resultado="";
		
		if(dineroCliente>PRECIO_LECHE && dineroCliente<monedero+PRECIO_LECHE) {
			cambio=dineroCliente-PRECIO_LECHE;
			monedero-=dineroCliente;
			monedero+=PRECIO_LECHE;
			setDepositoLeche(depositoLeche-1);
			setDepositoVasos(depositoVasos -1);
			resultado="Producto Servido";
		}else {
			throw new MaquinaCafeExceptions("Error de precio");
		}
			return resultado;
	}
	public String ServirCafeConLeche(double dineroCliente) {
		double cambio=0.0;
		String resultado="";
		
		if(dineroCliente>PRECIO_CAFE_LECHE && dineroCliente<monedero+PRECIO_CAFE_LECHE) {
			cambio=dineroCliente-PRECIO_CAFE_LECHE;
			monedero-=dineroCliente;
			monedero+=PRECIO_CAFE_LECHE;
			setDepositoLeche(depositoLeche-1);
			setDepositoCafe(depositoCafe-1);
			setDepositoVasos(depositoVasos -1);
			resultado="Producto servido";
		}else {
			throw new MaquinaCafeExceptions("Error de precio");
		}
			return resultado;
	}

	public int getDepositoCafe() {
		return depositoCafe;
	}

	public int getDepositoLeche() {
		return depositoLeche;
	}

	public int getDepositoVasos() {
		return depositoVasos;
	}

	public double getMonedero() {
		return monedero;
	}

	public void setDepositoCafe(int depositoCafe) {
		this.depositoCafe = depositoCafe;
	}

	public void setDepositoLeche(int depositoLeche) {
		this.depositoLeche = depositoLeche;
	}

	public void setDepositoVasos(int depositoVasos) {
		this.depositoVasos = depositoVasos;
	}

	public void setMonedero(double monedero) {
		this.monedero = monedero;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String toString () {
		StringBuilder sb= new StringBuilder();
		sb.append("\n el deposito de cafe es:\n");
		sb.append(getDepositoCafe());
		sb.append("\n el deposito de leche es:\n");
		sb.append(getDepositoLeche());
		sb.append("\n el deposito de Vasos es:\n");
		sb.append(getDepositoVasos());
		
		
		return sb.toString();
	}
	
}
