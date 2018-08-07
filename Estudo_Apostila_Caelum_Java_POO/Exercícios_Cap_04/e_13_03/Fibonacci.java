package e_13_03;

public class Fibonacci {
	int calculaFibonacci(int i) {
		return i < 2 ? i : this.calculaFibonacci(i - 1) + this.calculaFibonacci(i - 2);
	}

}
