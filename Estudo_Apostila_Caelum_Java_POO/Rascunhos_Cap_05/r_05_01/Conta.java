package r_05_01;

public class Conta {
	String titular;
	int numero;
	double saldo;
	//private double saldo;
	
	/*
	void saca(double valor) {
		this.saldo = this.saldo - valor;
	}
	*/
	public void saca(double valor) {
		// possível sacar até o valor do saldo.
		if (valor > this.saldo) {
			System.out.println("Impossível sacar valor maior que o saldo.");
		}
		else {
			this.saldo -= valor;
		}
	}
	
}
