package Cap04;

//Capítulo 4.10

public class TestaCarro {
	public static void main (String[] args) {
		Carro meuCarro;
		meuCarro = new Carro();
		meuCarro.cor = "Verde";
		meuCarro.modelo = "Fusca";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeMaxima = 80;
		
		//liga o carro
		meuCarro.liga();
		
		//acelera o carro
		meuCarro.acelera(20);
		
		System.out.println("Velocidade atual do meu carro é de " + meuCarro.velocidadeAtual + " km/h.");
}
}
