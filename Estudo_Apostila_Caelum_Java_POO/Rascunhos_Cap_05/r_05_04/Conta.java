package r_05_04;

public class Conta {
	String titular;
	int numero;
	double saldo;
	
	/*
	// construtor
	Conta(){
		System.out.println("Contruindo uma conta.");
	}
	*/
	
	// construtor
	Conta(String titular) {
		this.titular = titular;
	}
}
