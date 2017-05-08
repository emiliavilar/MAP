
public class Funcionario {
	
	protected double salarioBase;
	protected EnumCargo cargo;
	protected int nivel;
	
	public Funcionario(EnumCargo cargo, double salarioBase, int nivel) {
		this.cargo = cargo;
		this.salarioBase = salarioBase;
		this.nivel = nivel;
	}

	public double calcularGratificacao() {
		return cargo.calcularGratificacao(this);
	}

	public double getSalarioBase() {
		return salarioBase;
	}
  
  	public int getNivel() {
		return nivel;
	}
}