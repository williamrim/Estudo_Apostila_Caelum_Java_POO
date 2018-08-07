package c_03;

public class c3c3_BalancoTrimestral {
	public static void main(String[] args) {
		/* 01. */
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		
		System.out.println(gastosTrimestre);
		
		/* 02. */
		int mediaMensal = gastosTrimestre/3;
		
		System.out.println("Valor da Média Mensal = "+mediaMensal);
	}

}
