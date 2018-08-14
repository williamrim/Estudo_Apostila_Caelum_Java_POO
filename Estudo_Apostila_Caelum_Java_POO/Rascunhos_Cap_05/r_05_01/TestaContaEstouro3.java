package r_05_01;

public class TestaContaEstouro3 {
	public static void main(String[] args) {
		// Conta
		Conta minhaConta = new Conta();
		minhaConta.saldo = 100;
		
		//alterando o saldo
		double novoSaldo = -200;
		
		// verifica se novoSaldo é válido
		if (novoSaldo < 0) {
			System.out.println("Não posso mudar este saldo.");
		}
		else {
			minhaConta.saldo = novoSaldo;
		}
		System.out.println("Saldo é de: " + minhaConta.saldo);
	}

}
