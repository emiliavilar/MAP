
public class Filho implements Familia{
	
	Pai dadosPai;
	String email;
	
	public Filho(){
		dadosPai = new Pai();
	}
	
	public String getNome() {
		return dadosPai.nome;
	}

	public void setNome(String nome) {
		dadosPai.nome = nome;
	}

	public int getIdade() {
		return dadosPai.idade;
	}

	public void setIdade(int idade) {
		dadosPai.idade = idade;
	}
	
		public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String infoMembro() {
		return dadosPai.toString() + ", Email: " + this.email;
	}

}
