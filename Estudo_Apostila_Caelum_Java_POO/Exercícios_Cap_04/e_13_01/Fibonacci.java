package e_13_01;

public class Fibonacci {
	int calculaFibonacci(int i) {
		if (i == 0) {
			return 0;
		}
		if (i == 1) {
			return 1;
		}
		else {
			return this.calculaFibonacci(i - 1) + this.calculaFibonacci(i - 2);
		}
	}

}
