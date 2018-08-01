package Cap04_12_03;

public class TestaConta {
	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.titular = "Fulano";
		c1.numero = 123;
		c1.agencia = "45678-9";
		c1.saldo = 50.0;
		c1.dataAbertura = "04/05/2015";
		
		
		Conta c2 = new Conta();
		c2.titular = "Beltrano";
		c2.numero = 1234;
		c2.agencia = "45678-9";
		c2.saldo = 500.0;
		c2.dataAbertura = "10/05/2015";
		
		
		Conta c3 = new Conta();
		c3.titular = "Ciclano";
		c3.numero = 12345;
		c3.agencia = "45678-9";
		c3.saldo = 250.0;
		c3.dataAbertura = "20/05/2015";
		
		System.out.println(c1.recuperaDadosParaImpressao());
		System.out.println(c2.recuperaDadosParaImpressao());
		System.out.println(c3.recuperaDadosParaImpressao());
	}

}
