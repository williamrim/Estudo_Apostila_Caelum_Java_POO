package e_08_06;

public class Conta {
	private int dia;
	private int mes;
	private int ano;
	
	public void insereData(int d, int m, int a) {
		for(int i = 0; i == 0; i++) {
			if(d > 31) {
				System.out.println("Dia maior que 31.\nInsira data corretamente.\n");
				break;
			}
			if(m > 12) {
				System.out.println("Mês maior que 12.\nInsira data corretamente.\n");
				break;
			}
			if((m == 4)||(m == 6)||(m == 9)||(m == 11)&&(d > 30)) {
				this.mes = m;
				System.out.println("Mês " + this.mes + ".\nDia maior que 30.\nInsira data corretamente.\n");
				break;
			}
			if(a < 2000) {
				System.out.println("Ano menor que 2000.\nInsira data corretamente.\n");
				break;
			}
			if(this.bissexto(a)) {
				if((m == 2)&&(d > 29)) {
					System.out.println("Ano Bissexto.\nDia maior que 29.\nInsira data corretamente.\n");
					break;
				}
			}
			else{
				if((m == 2)&&(d > 28)) {
				System.out.println("Ano Normal.\nDia maior que 28.\nInsira data corretamente.\n");
				break;
				}
			}
			this.dia = d;
			this.mes = m;
			this.ano = a;
		}
	}
		
	public boolean bissexto(double a) {
		if(a % 4 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void getData() {
		System.out.println("Data: " + this.dia + "/" + this.mes + "/" + this.ano);
	}
}
