package r_05_01;

public class Conta {
	String titular;
	int numero;
	private double saldo;
	
	void saca(double valor) {
		this.saldo = this.saldo - valor;
	}

}
