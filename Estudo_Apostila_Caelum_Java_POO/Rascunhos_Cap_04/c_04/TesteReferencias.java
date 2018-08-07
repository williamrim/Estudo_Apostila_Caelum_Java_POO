package c_04;

public class TesteReferencias {
	
//Capítulo 4.7
	public static void main(String[] args) {
		/*
		Conta c1;
		c1 = new Conta();
		
		Conta c2;
		c2 = new Conta();
		//neste caso, c1 e c2 tem referências diferentes na memória.
		*/
		
		/*
		Conta c1 = new Conta();
		c1.deposita(100);
		
		Conta c2 = c1;
		c2.deposita(200);
		//neste caso, c1 e c2 tem a mesma referência na memória.
		
		System.out.println("Saldo da c1 = " + c1.saldo);
		System.out.println("Saldo da c2 = " + c2.saldo);
		*/
		
		/*
		Conta c1 = new Conta();
		c1.titular = "Duke";
		c1.saldo = 227;
		
		Conta c2 = new Conta();
		c2.titular = "Duke";
		c1.saldo = 227;
		
		if (c1 == c2) {
			System.out.println("c1 e c2 são Contas iguais.");
		}
		else {
			System.out.println("c1 e c2 são Contas diferentes.");
		}
		*/
		
//Capítulo 4.8
		/*
		Conta c1 = new Conta();
		c1.titular = "c1";
		c1.saldo = 100;
		Conta c2 = new Conta();
		c2.titular = "c2";
		c2.saldo = 2000;
		
		System.out.println("Saldo de c1 = " + c1.saldo);
		System.out.println("Saldo de c2 = " + c2.saldo + "\n");
		
		if(c2.transferePara(c1, 1500)) {
			System.out.println("Transferência da conta " + c2.titular + 
					" para a conta " + c1.titular + " realizada com sucesso!");
		}
		else {
			System.out.println("Conta " + c2.titular + " sem saldo suficiente para transferir.");
		}
		System.out.println("Saldo de c1 = " + c1.saldo);
		System.out.println("Saldo de c2 = " + c2.saldo);		
	}
	*/

}
}