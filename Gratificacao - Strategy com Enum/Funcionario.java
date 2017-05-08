
public class Funcionario {
	
	protected double salarioBase;
	protected EnumCargo cargo;
	protected int nivel;
	protected Gratificacao estrategiaDeGratificacao;

	public Funcionario(EnumCargo cargo, double salarioBase, int nivel) {
		this.cargo = cargo;
		this.salarioBase = salarioBase;
		this.nivel = nivel;
	}

	public double calcularGratificacao() {
		return estrategiaDeGratificacao.calcularGratificacao(this);
	}

	public double getSalarioBase() {
		return salarioBase;
	}
  
  	public int getNivel() {
		return nivel;
	}
}