package e_08_05;

public class TestaConta {
	public static void main(String[] args) {
		Conta c1 = new Conta();
		
		System.out.println("Existem " + c1.getIdentificador() + " contas abertas.");
		
		Conta c2 = new Conta();
		System.out.println("Existem " + c2.getIdentificador() + " contas abertas.");
		Conta c3 = new Conta();
		System.out.println("Existem " + c3.getIdentificador() + " contas abertas.");
		Conta c4 = new Conta();
		System.out.println("Existem " + c4.getIdentificador() + " contas abertas.");
		
	}

}
