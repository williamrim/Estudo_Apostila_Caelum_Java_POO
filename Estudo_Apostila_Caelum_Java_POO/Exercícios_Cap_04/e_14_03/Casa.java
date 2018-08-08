package e_14_03;

public class Casa {
	String cor;
	Porta p1 = new Porta();
	Porta p2 = new Porta();
	Porta p3 = new Porta();
	
	public void pintaDe(String t) {
		this.cor = t;
	}
	
	public int quantasPortaEstaoAbertas() {
		int i = 0;
		if (p1.aberta == true) {
			i++;
		}
		if (p2.aberta == true) {
			i++;
		}
		if (p3.aberta == true) {
			i++;
		}
		return i;
	}
}
