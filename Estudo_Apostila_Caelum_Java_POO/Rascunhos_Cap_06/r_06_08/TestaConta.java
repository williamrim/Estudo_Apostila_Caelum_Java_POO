package r_06_08;

public class TestaConta {
	public static void main(String[] args) {
		Conta c1 = new Conta();
		System.out.println(c1.getSaldo());
		c1.deposita(100);
		System.out.println(c1.getSaldo());
	}

}
