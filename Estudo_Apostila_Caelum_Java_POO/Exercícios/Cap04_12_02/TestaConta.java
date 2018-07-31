package Cap04_12_02;

public class TestaConta {
	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.titular = "Fulano";
		c1.numero = 123;
		c1.agencia = "45678-9";
		c1.saldo = 50.0;
		c1.dataAbertura = "04/05/2015";
		c1.deposita(100.0);
		System.out.println("Rendimento Mensal da conta do " + c1.titular + " é igual a "
				+ c1.calculaRendimento() + ".\n");
		
		
		Conta c2 = new Conta();
		c2.titular = "Beltrano";
		c2.numero = 1234;
		c2.agencia = "45678-9";
		c2.saldo = 500.0;
		c2.dataAbertura = "10/05/2015";
		c2.deposita(500);
		c2.saca(900);
		System.out.println("Rendimento Mensal da conta do " + c2.titular + " é igual a "
				+ c2.calculaRendimento() + ".\n");
		
		
		Conta c3 = new Conta();
		c3.titular = "Ciclano";
		c3.numero = 12345;
		c3.agencia = "45678-9";
		c3.saldo = 250.0;
		c3.dataAbertura = "20/05/2015";
		c3.deposita(-100);
	}
}
