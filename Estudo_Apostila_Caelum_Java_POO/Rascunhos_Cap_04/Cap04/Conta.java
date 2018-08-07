package Cap04;

//Capítulo 4.4
/*
class Conta {
	int numero;
	String titular;
	double saldo;
}
*/

//Capítulo 4.5
/*
class Conta {
	double salario;
	int numero;
	String titular;
	double saldo;
	
	void saca(double quantidade) {
		double novoSaldo = this.saldo - quantidade;
		this.saldo = novoSaldo;
	}
	
	void deposita(double quantidade) {
		this.saldo += quantidade;
	}
}
*/

//Capítulo 4.6
/*
class Conta {
	double salario;
	int numero;
	String titular;
	double saldo;
	
	void deposita(double quantidade) {
		this.saldo += quantidade;
	}
	
	boolean saca(double valor) {
		if (this.saldo < valor) {
			return false;
		}
		else {
			this.saldo = this.saldo - valor;
			return true;
		}
	}
}
*/

//Capítulo 4.7
/*
class Conta {
	double salario;
	int numero;
	String titular;
	double saldo;
	
	void deposita(double quantidade) {
		this.saldo += quantidade;
	}
	
	boolean saca(double valor) {
		if (this.saldo < valor) {
			return false;
		}
		else {
			this.saldo = this.saldo - valor;
			return true;
		}
	}
*/	
	/*
	void transfere(Conta destino, double valor) {
		this.saldo = this.saldo - valor;
		destino.saldo = destino.saldo + valor;
	}
	*/
	
	/*
	boolean transfere(Conta destino, double valor) {
		if(this.saca(valor) == false) {
			//não deu pra sacar
			return false;
		}
		else {
			destino.deposita(valor);
			return true;
		}
	}
	*/

/*
//Capítulo 4.8
	boolean transferePara(Conta destino, double valor) {
		if(this.saca(valor)) {
			destino.deposita(valor);
			return true;
		}
		else {
			//não deu pra sacar
			return false;
		}
	}
*/
	
	
//Capítulo 4.9

/*
class Conta {
	int numero = 1234;
	String titular = "Duke";
	double saldo = 1000;
}	
*/

/*
class Cliente {
	String nome;
	String sobremone;
	String cpf;
}
	
class Conta {
	int numero;
	double saldo;
	// quando iniciar Conta, o Cliente será iniciado junto.
	Cliente titular = new Cliente();
}
*/

