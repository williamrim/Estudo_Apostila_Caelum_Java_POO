package e_08_01;

public class TestaConta {
	public static void main(String[] args) {
		Conta c = new Conta();
		c.a1 = 5;
		Conta.a2 = 6;
		// erro pois não é possível acessar atributo "private".
		// c.a3 = 2;
	}

}
