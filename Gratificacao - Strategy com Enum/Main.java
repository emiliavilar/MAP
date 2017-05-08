
public class Main {
	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario(EnumCargo.GERENTE,4500,1);
		System.out.println(funcionario1.calcularGratificacao());		
				
	}
}