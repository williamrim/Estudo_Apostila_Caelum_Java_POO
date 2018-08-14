package r_05_01;

public class TestaContaEstouro1 {
	public static void main(String[] args) {
		Conta minhaConta = new Conta();
		minhaConta.saldo = 1000.0;
		minhaConta.saca(5000); //saldo é só de 1000.
		System.out.println("Saldo é de: " + minhaConta.saldo);
	}

}
