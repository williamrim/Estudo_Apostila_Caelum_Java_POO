package e_12_06;

public class Conta {
	String titular;
	int numero;
	String agencia;
	double saldo;
	Data dataAbertura;
	
	String recuperaDadosParaImpressao() {
		String dados = "Titular = " + this.titular + ".\n";
		dados += "Número = " + this.numero + ".\n";
		dados += "Agência = " + this.agencia + ".\n";
		dados += "Saldo = " + this.saldo + ".\n";
		return dados;
	}
}
