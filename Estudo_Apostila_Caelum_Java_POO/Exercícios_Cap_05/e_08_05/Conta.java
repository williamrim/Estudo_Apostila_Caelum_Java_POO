package e_08_05;

public class Conta {
	private static int identificador;
	
	Conta(){
		Conta.identificador++;
	}
	
	public int getIdentificador() {
		return Conta.identificador;
	}
	
}
