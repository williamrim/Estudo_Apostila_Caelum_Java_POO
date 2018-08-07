package e_12_09;

public class Data {
	int dia;
	int mes;
	int ano;
	
	String formatada() {
		String dados = "Data de Abertura: " + this.dia + "/" + this.mes + "/" + this.ano + ".\n";
		return dados;
	}
}
