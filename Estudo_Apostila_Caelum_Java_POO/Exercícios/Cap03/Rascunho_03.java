package Cap03;

public class Rascunho_03 {

	//public static void main(String[] args) {
	
		
/* Capítulo 3.1 */
	/*
	//public static void main(String[] args) {
		int Idade;
		int IdadeAnoQueVem;
		int Cinco;
	
		System.out.println("Variáveis tipo: Inteiros!\nNúmeros inteiros.");
		Idade = 15;
		IdadeAnoQueVem = Idade+1;
		System.out.println("Idade = "+Idade);
		System.out.println("IdadeAnoQueVem = "+IdadeAnoQueVem);
		
		Idade = Idade/2;
		IdadeAnoQueVem = (IdadeAnoQueVem)/2;
		System.out.println();
		System.out.println("Idade dividido por 2 = "+Idade);
		System.out.println("IdadeAnoQueVem dividivo por 2 = "+IdadeAnoQueVem);
		System.out.println();
		Cinco = 11%2;
		System.out.println("Resto da divisão de 5 por 2 (5/2)= "+Cinco);
		System.out.println("\n");
		
		
		System.out.println("Variáveis tipo: Double!\nNúmeros decimais.");
		double pi, x;
		
		pi = 3.141516;
		x = 1.500*3;
		System.out.println("Pi = "+pi);
		System.out.println("x = "+x);
		System.out.println("\n");
		
		
		System.out.println("Variáveis tipo: Boolean!\nCondições Verdadeiro ou Falso.");
		boolean menor, maior;
		
		menor = Idade<16;
		System.out.print("Idade é menor que 16 = "+menor+"\n");
		maior = Idade>10;
		System.out.println("Idade é maior que 10 = "+maior);
		System.out.println("\n");
		
		
		System.out.println("Variáveis tipo: Char\nMantém sempre apenas um caractere.");
		char a, b;
		a = 'a';
		b = 'b';
		System.out.println("Variável a = "+a);
		System.out.println("Variável b = "+b);
	*/
		
		
/* Capítulo 3.5 */
	/*
	//public static void main(String[] args) {
		//double d = 3.1415;
		//int i = d;
		
		//double d = 5;
		//int = d;
		
		//int i = 5;
		//double d2 = i;
		
	/*
		double d3 = 3.14;
		System.out.println(d3);
		int i = (int) d3;
		System.out.println(i);
	
		
		//long x = 10000;
		//int i = (int) x;
		
		//float x = 0.0;
		//float y = 0.0f;
		//double d = 5;
		//float f = 3;
		//float x = f + (float) d; 
	/*	
		double d = 0;
		float f = 0;
		int i = 0;
		d = f;
		f = (float) d;
		d = i;
		i = (int) d:
		f = i;
		i = (int) f;
	*/	
	
	
		
/* Capítulo 3.6 */
	/*	
	//public static void main(String[] args) {
		//int idade = 15;
		int idade = 20;
		if (idade <18) {
			System.out.println("Não pode entrar");
		} else {
			System.out.println("Pode entrar");
		}
	*/	
	/*	
		int idade = 15;
		boolean amigoDoDono = true;
		if (idade < 18 && !amigoDoDono) {
			System.out.println("Nao pode entrar");
		} else {
			System.out.println("Pode entrar");
		}
	*/
	/*
		int mes = 1;
		if (mes == 1) {
			System.out.println("Voce deveria estar de ferias");
		}
	*/
		
		
/* Capítulo 3.7 */		
	/*
	//public static void main(String[] args) {
		int idade = 15;
		while (idade < 18) {
			System.out.println("Menor de idade.\nIdade = " + idade);
			idade++;
		}
		System.out.println("\nMaior de idade.\nIdade = " + idade);
		
		int i = 0;
		while (i < 11) {
			System.out.println(i);
			i++;
		}
	*/
		

/* Capítulo 3.8 */	
	/*	
	//public static void main(String[] args) {
		for(int i = 0; i < 11; i++) {
			System.out.println(i);
		}
	
		int i = 5;
		int x = ++i;
		System.out.println(i + "\n" + x);
	*/
		
		
/* Capítulo 3.9 */		
	/*	
	//public static void main(String[] args) {
		for (int i = 20; i <= 100; i++ ) {
			if ( i % 19 == 0) {
				System.out.println("Encontrei um número divisível por 19 entre 20 e 100!\nÉ o " + i);
				//break encerra o loop;
				break;
			}
		}
		
		
		for (int i = 0; i < 100; i++) {
			if (i > 50 && i < 60) {
				System.out.println(i);
				//continue força voltar direto para o loop, sem executar o restante das funções.
				continue;
			}
			System.out.println(i);
		}
	*/
		
		
/* Capítulo 3.12 */
	/*
	 * 	While é um loop, onde a comparação é feita antes do código.
	 *  Do While é um loop, onde a comparação é feita depois do código.
	 *  
	 *  Do While é melhor de usar quando é preciso executar declarações dentro do loop.
	 *  Caso contrário, o While é mais simples de usar.
	 */
	/*	
	//public static void main(String[] args) {
		int i = 2;
		i = i/0;
		System.out.println(i);
		// Erro. Não se pode dividir por zero.
	*/	
	
	public static void main (String[] args) {
		int i = 10;
		int x = 1;
		//i++;			//i = 11 e x = 1
		//++i;			//i = 11 e x = 1
		//i--;			//i =  9 e x = 1
		//--i;			//i =  9 e x = 1
		//i += x;		//i = 11 e x = 1
		//i =+ x;		//i =  1 e x = 1
		//i -= x;		//i =  9 e x = 1
		//i =- x;		//i = -1 e x = 1
		
		System.out.println("i = " + i);
		System.out.println("x = " + x);
		
		//i += 10 é igual a i = i + 10
		//i =+ 10 é igual a i = 10
	
		
	}
}
