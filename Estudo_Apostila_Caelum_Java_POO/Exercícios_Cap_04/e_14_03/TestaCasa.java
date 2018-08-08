package e_14_03;

public class TestaCasa {
	public static void main(String[] args) {
		Casa c1 = new Casa();
		c1.cor = "Amarela";
		c1.p1.fecha();
		c1.p2.abre();
		c1.p3.fecha();
	
		System.out.println("Número de portas abertas na casa " + c1.cor + ": "
							+ c1.quantasPortaEstaoAbertas() + ".");	
	}
}
