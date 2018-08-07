package Cap04_12_07;

public class Conta {
	String titular;
	int numero;
	String agencia;
	double saldo;
	Data dataAbertura;
	
	String impressao() {
		String dados = "Titular = " + this.titular;
		dados += "\nDia = " + this.dataAbertura.dia;
		dados += "\nMes = " + this.dataAbertura.mes;
		dados += "\nAno = " + this.dataAbertura.ano;
		return dados;
	}
}
