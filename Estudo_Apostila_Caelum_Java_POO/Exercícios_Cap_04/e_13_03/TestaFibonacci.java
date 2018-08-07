package e_13_03;

public class TestaFibonacci {
	public static void main(String[] args) {
		Fibonacci f1 = new Fibonacci();
		for (int i = 1; i <= 6; i++) {
			int resultado = f1.calculaFibonacci(i);
			System.out.print(resultado + ", ");
		}
	}
}
