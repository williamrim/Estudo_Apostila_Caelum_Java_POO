package e_08_05;

public class TestaConta {
	public static void main(String[] args) {
		Conta c1 = new Conta();
		
		System.out.println("Existem " + c1.getIdentificador() + " contas abertas.");
		
		Conta c2 = new Conta();
		Conta c3 = new Conta();
		Conta c4 = new Conta();
		
		System.out.println("Existem " + c1.getIdentificador() + " contas abertas.");
		
	}

}
