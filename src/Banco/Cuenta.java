package Banco;

	/**
	 * Programa relativo al Banco y cuenta corriente
	 * @author estudiante
	 *
	 */

	/*Realizar un programa que permita gestionar el saldo de una cuenta corriente. Una
	vez introducido el saldo inicial, se mostrará un menú que permitirá efectuar las
	siguientes operaciones:
	1. Hacer un reintegro, se pedirá la cantidad a retirar.
	2. Hacer un ingreso, se pedirá la cantidad a ingresar.
	3. Consultar el saldo y el número de reintegros e ingresos realizados.
	4. Finalizar las operaciones. Debe confirmar si realmente desea salir e
	informar del saldo al final de todas las operaciones.
	Debe realizarse una clase Cuenta y la clase Principal.*/



	public class Cuenta {

		private double saldo=0.0;
		private double reintegro=0.0;
		private double ingreso=0.0;
		private double SaldoFinal=0.0;
		private static int contadorReintegros=0;
		private static int contadorIngresos=0;
		
		
		
		//constructores//
		
		public Cuenta(double saldo) {
			super();
			setSaldo(saldo);
		}
		
		//metodos//
		
		public double IngresarCuenta() {
			double SaldoFinal=0;
			
			if (ingreso>0) {
				SaldoFinal=saldo+ingreso;
			}
			
			setSaldo(SaldoFinal);
			contadorIngresos++;
			return SaldoFinal;
		}
		
		public double RetirarCuenta() {
			double SaldoFinal=0;
			
			if (reintegro<getSaldo()) {
				SaldoFinal=saldo-reintegro;
			}else {
				System.out.println("El reintegro supera al Saldo, imposible realizar el reintegro");
			}
			
			setSaldo(SaldoFinal);
			contadorReintegros++;
			return SaldoFinal;
			
		}
		
		public double ConsultarSaldo() {
			
			return saldo;
			
		}

		public double getSaldo() {
			return saldo;
		}

		public double getReintegro() {
			return reintegro;
		}

		public double getIngreso() {
			return ingreso;
		}

		public double getSaldoFinal() {
			return SaldoFinal;
		}

		public static int getContadorReintegros() {
			return contadorReintegros;
		}

		public static int getContadorIngresos() {
			return contadorIngresos;
		}

		public void setSaldo(double saldo) {
			if (saldo>0) {
				this.saldo = saldo;
			}else {
				System.out.println("Saldo incorrecto");
			}
		}

		public void setReintegro(double reintegro) {
			if (reintegro<saldo) {
				this.reintegro = reintegro;
			}
			
		}

		public void setIngreso(double ingreso) {
			this.ingreso = ingreso;
		}
		
		public void setSaldoFinal(double saldoFinal) {
			saldoFinal=saldo;
			SaldoFinal = saldoFinal;
		}
		
		public String toString() {
			return "La cuenta tiene un saldo de "+ getSaldo();
		}
	}

