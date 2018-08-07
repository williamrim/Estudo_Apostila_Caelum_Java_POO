package Cap04_12_06;

public class TestaConta {
	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.titular = "Fulano";
		c1.numero = 123;
		c1.agencia = "45678-9";
		c1.saldo = 50.0;

		Data data = new Data();
		c1.dataAbertura = data;
		
		System.out.println(c1.recuperaDadosParaImpressao());
	}

}
