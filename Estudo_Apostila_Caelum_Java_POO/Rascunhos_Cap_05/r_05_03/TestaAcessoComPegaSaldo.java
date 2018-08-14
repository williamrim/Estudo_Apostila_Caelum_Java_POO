package r_05_03;

public class TestaAcessoComPegaSaldo {
	public static void main(String[] arg) {
		Conta minhaConta = new Conta();
		minhaConta.deposita(1000);
		System.out.println("Saldo da conta é de: " + minhaConta.getSaldo());
	}
}
