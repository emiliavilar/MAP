
public class Main {
	
	
	public static void main(String[]args){
		
		Pai pai = new Pai();
		pai.nome = "Joao";
		pai.idade = 50;
		
		Filho filho = new Filho();
		filho.setNome("Carlos");
		filho.setIdade(20);
		filho.setEmail("carlos@teste.com");
		
		Main.infoMembro(pai);
		Main.infoMembro(filho);
		
	}

	private static void infoMembro(Familia familia) {
		System.out.println(familia.infoMembro());
		
	}

}
