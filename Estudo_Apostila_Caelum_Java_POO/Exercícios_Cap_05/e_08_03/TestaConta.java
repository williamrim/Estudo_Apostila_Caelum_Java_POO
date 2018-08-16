package e_08_03;

public class TestaConta {
	public static void main(String[] ags) {
		Conta c = new Conta();
		c.numero = 45;
		c.saldo = 100;
		c.titular = "Fulano";
		
		c.setTitular("Batman");
		System.out.println(c.getTitular());
	}
}
