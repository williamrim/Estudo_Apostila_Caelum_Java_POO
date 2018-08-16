package e_08_04;

public class TestaConta {
	public static void main(String[] args) {
		Conta c = new Conta("Fulanus Beltranus");
		c.numero = 45;
		c.saldo = 100;
		
		System.out.println("Número: " + c.getNumero());
		System.out.println("Saldo: " + c.getSaldo());
		System.out.println("Titular: " + c.getTitular());
		
	}
}
