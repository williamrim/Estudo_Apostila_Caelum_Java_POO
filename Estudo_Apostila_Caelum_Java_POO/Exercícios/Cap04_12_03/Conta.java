package Cap04_12_03;

public class Conta {
	String titular;
	int numero;
	String agencia;
	double saldo;
	String dataAbertura;
	
	void saca(double valor) {
		System.out.println("Tentativa de saque da conta do " + this.titular + ".");
		if (this.saldo < valor) {
			System.out.println("A conta do " + this.titular + " não tem saldo suficiente.");
		}
		else {
			this.saldo -= valor;
			System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
			System.out.println("O saldo da conta do " + this.titular + " agora é de R$ " + this.saldo + ".");
		}
	}
	
	void deposita(double valor) {
		System.out.println("Tentativa de depósito na conta do " + this.titular + ".");
		if (valor < 0) {
			System.out.println("Impossível depositar valor negativo. \n");
		}
		else {
			this.saldo += valor;
			System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
			System.out.println("O saldo da conta do " + this.titular + " agora é de R$ " + this.saldo + ".\n");
		}
	}
	
	double calculaRendimento() {
		double rendimento = 0;
		rendimento = this.saldo * 0.1;
		return rendimento;
	}
	
	String recuperaDadosParaImpressao() {
		String dados = "Titular = " + this.titular + ".\n";
		dados += "Número = " + this.numero + ".\n";
		dados += "Agência = " + this.agencia + ".\n";
		dados += "Saldo = " + this.saldo + ".\n";
		dados += "Data de abertura da conta = " + this.dataAbertura + ".\n";
		return dados;
	}
	
}
