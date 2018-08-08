package e_14_01;

public class TestaPessoa {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.nome = "Fulano";
		p1.idade = 10;
		
		System.out.println(p1.nome + " tem " + p1.idade + " anos de idade.\n");
		
		System.out.println("...Um ano se passou...");
		p1.fazAniversario();
		System.out.println("E agora, " + p1.nome + " tem " + p1.idade + " anos de idade.\n");
		
		System.out.println("...Mais um ano se passou...");
		p1.fazAniversario();
		System.out.println("E agora, " + p1.nome + " tem " + p1.idade + " anos de idade.\n");
	}
}
