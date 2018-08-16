package e_08_03;

public class Conta {
	int numero;
	double saldo;
	String titular;
	
	public int getNumero() {
		return this.numero;
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	public String getTitular() {
		return this.titular;
	}
	
	public void setTitular(String nome) {
		this.titular = nome;
	}
	
	public void setSaldo(double valor) {
		this.saldo = valor;
	}
}
