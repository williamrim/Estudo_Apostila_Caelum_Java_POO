package r_05_05;

public class Conta {
	String titular;
	int numero;
	double saldo;
	
	// construtor
	Conta (String titular){
		this.titular = titular;
	}

	Conta (int numero, String titular){
		this(titular); // chama o construtor declarado acima.
		this.numero = numero;
	}
}
