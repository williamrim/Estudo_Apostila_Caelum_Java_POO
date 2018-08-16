package e_08_02;

public class TestaConta {
	public static void main(String[] args) {
		Conta c = new Conta();
		c.numero = 45;
		c.saldo = 100;
		c.titular = "Fulano";
		
		System.out.println("Número: " + c.getNumero());
		System.out.println("Saldo: " + c.getSaldo());
		System.out.println("Titular: " + c.getTitular());
	}

}
