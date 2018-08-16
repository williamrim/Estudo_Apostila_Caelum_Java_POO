package r_05_06;

public class Conta {
	// static faz com que o atributo seja da Classe e não do objeto.
	// assim é possível contar a quantidades de objetos, por exemplo.
	public static int totalDeContas;
	
	Conta(){
		Conta.totalDeContas ++;
	}
	
	//public libera acesso à um método sem a necessidade do uso de um objeto.
	public static int getTotalDeContas() {
		return Conta.totalDeContas;
	}

}
