package Cap04_12_09;

public class Conta {
	String titular;
	int numero;
	String agencia;
	double saldo;
	Data dataAbertura;
	
	String impressaoConta() {
		String dados = "Titular = " + this.titular + ".\n";
		dados += "Número = " + this.numero + ".\n";
		dados += "Agência = " + this.agencia + ".\n";
		dados += "Saldo = " + this.saldo + ".\n";
		dados += this.dataAbertura.formatada();
		return dados;
	}
}
