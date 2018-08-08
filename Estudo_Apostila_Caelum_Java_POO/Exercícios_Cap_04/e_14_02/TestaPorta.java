package e_14_02;

public class TestaPorta {
	public static void main(String[] args) {
		Porta p1 = new Porta();
		p1.aberta = true;
		p1.cor = "Marrom";
		p1.dimX = 80;
		p1.dimY = 2.10;
		p1.dimZ = 3;
		
		p1.fecha();
		p1.estaAberta();
		p1.pintaDe("Bege");
		System.out.println("A cor da Porta é " + p1.cor + ".\n");
		
		p1.abre();
		p1.estaAberta();
		p1.pintaDe("Marron");
		System.out.println("A cor da Porta é " + p1.cor + ".\n");
	}

}
