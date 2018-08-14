package r_05_03;

public class Conta {
	private double saldo;
	private double limite;
	private String titular;
	
	/*
	public double pegaSaldo() {
		return this.saldo;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	*/
	
	/*
	public double getSaldo() {
		return this.saldo;
	}
	*/
	public double getSaldo() {
		return this.saldo + this.limite;
	}
	
	/*
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	Evitar usar setSaldo pois é preferível utilizar os métodos "saca" ou "deposita".
	*/
	
	public void deposita(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		}
		else {
			System.out.println("Impossível depositar valor negativo.");
		}
	}
	
	public String getTitular() {
		return this.titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	
}
