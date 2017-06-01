
public class Pai implements Familia {

	String nome;
	int idade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String infoMembro() {
		return ("Nome: " + this.nome + ", Idade: " + this.idade);
	}

	@Override
	public String toString() {
		return "Nome: " + nome + ", Idade: " + idade + "";
	}
	
	

}
