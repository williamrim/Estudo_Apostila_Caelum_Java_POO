package Cap04_12_05;

public class TestaConta {
	public static void main(String[] arg) {
		Conta c1 = new Conta();
		c1.titular = "Danilo";
		c1.saldo = 100;
		
		Conta c2 = c1;
		
		if ( c1 == c2) {
			System.out.println("Iguais");
		}
		else {
			System.out.println("Diferentes");
		}
		
		// agora deu igual pois a referência na memória é a mesma.
		// o objeto é o mesmo para c1 e c2.
	}

}
