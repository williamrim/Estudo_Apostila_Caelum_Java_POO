package r_05_01;

public class TestaAcessoDireto {
	public static void main(String[] args) {
		Conta minhaConta = new Conta();
		
		// não compila. Não se pode acessar o atributo privado de outra classe.
		minhaConta.saldo = 1000;
	}

}
