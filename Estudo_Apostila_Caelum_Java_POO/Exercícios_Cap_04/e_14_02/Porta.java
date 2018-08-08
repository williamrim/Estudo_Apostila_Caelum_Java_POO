package e_14_02;

public class Porta {
	boolean aberta;
	String cor;
	double dimX, dimY, dimZ;
	
	public void abre() {
		this.aberta = true;
	}

	public void fecha() {
		this.aberta = false;
	}
	
	public void pintaDe(String t) {
		this.cor = t;
	}
	
	public void estaAberta() {
		String condicao;
		if (this.aberta == true) {
			condicao = "aberta.";
		}
		else {
			condicao = "fechada.";
		}
		System.out.println("A porta está " + condicao);
	}
}
