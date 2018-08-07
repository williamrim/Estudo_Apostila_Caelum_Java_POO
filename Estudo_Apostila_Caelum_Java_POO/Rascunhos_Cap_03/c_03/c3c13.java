package c_03;

public class c3c13 {
	
/* Capítulo 3.13 */

//3.13 - 1	
	/*
	public static void main(String[] args) {
		for (int i = 150; i <= 300; i++) {
			System.out.println(i);
		}
	}
	*/
	
//3.13 - 2
	/*
	public static void main(String[] args) {
		int soma = 0;
		for (int i = 0; i <= 1000; i++) {
			soma += i;
			System.out.println("soma até " + i + " é igual a " + soma);
		}	
	}	
	*/
	
//3.13 - 3	
	/*
	public static void main (String[] args) {
		for(int i = 0; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.println(i + " é múltiplo de 3.");
			}
		}
	}
	*/
	
//3.13 - 4 - Fatorial
	/*
	public static void main (String[] ars) {
		double n0 = 1;
		double fat = 0;
		double n = 40;
		for(int i = 1; i <= n; i++) {
			fat = i * n0;
			n0 = fat;
			System.out.println("Fatorial de " + i + " é igual a " + fat);
		}
	}
	*/
	
//3.13 - 6 - Fibonacci	
	/*
	public static void main (String[] args) {
		int F1 = 0;
		int F2 = 1;
		int F = 0;
		int n = 100;
		System.out.println("Fibonacci de 0 é igual a " + F1);
		System.out.println("Fibonacci de 1 é igual a " + F2);
		for (int i = 2; F <= n; i++) {
			F = F1 + F2;
			F1 = F2;
			F2 = F;
			System.out.println("Fibonacci de " + i + " é igual a " + F);
			
		}
	}
	*/
	
//3.13 - 7
	/*
	public static void main (String[] args) {
		int x = 13;
		for (int i = 0; x > 1; i++) {
			if (x % 2 == 0) {
				x = x / 2;
			} else {
				x = 3 * x + 1;
			}
			if (x > 1) {
				System.out.print(x + " -> ");
			} else {
				System.out.print(x + ".");
			}
		}
	}
	*/
	
//3.13 - 8
	/*
	public static void main (String[] args) {
		int n = 4;
		int x = 1;
		for (int i = 1; i <= n; i++) {
			for (int o = 1; o <= i; o++) {
				x = i * o;
				System.out.print(x + "  ");
			}
			System.out.println();
		}
	}
	*/
	
//3.13 - Desafio - Fatorial
	/*
	public static int Fatorial (int n) {
		
		if (n == 1) {
			return 1;
		} else {
			return n * Fatorial (n - 1);
		}
		//return n == 0 ? 1 : n * Fatorial (n - 1);
	}
	*/
		
	/*
	public static void main (String[] args) {
		int f = 4;
		System.out.println(Fatorial (f));
	}
	*/
	
		
//3.13 - Desafio - Fibonacci
	
	public static int Fibonacci (int n) {
		//return n < 2 ? n : Fibonacci (n - 1) + Fibonacci (n - 2);
		if (n == 0) {
			return 0;
		} else {
			if (n == 1) {
				return 1;
			} else {
				return Fibonacci (n - 1) + Fibonacci (n - 2);
			}
		}
	}
	
	public static void main (String[] args) {
		int i = 6;
		System.out.println(Fibonacci(i));
	}
}
	
