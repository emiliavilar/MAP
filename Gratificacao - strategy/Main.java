
public class Main {
	public static void main(String[] args) {
		
		Funcionario gerente1 = new Funcionario(Funcionario.GERENTE,
				4500, 1);
		System.out.println(gerente1.calcularGratificacao());
		
		Funcionario gerente2 = new Funcionario(Funcionario.GERENTE,
				4500, 2);
		System.out.println(gerente2.calcularGratificacao());
		
		Funcionario lider1 = new Funcionario(Funcionario.LIDER,
				3000, 1);
		System.out.println(lider1.calcularGratificacao());
		
		Funcionario lider2 = new Funcionario(Funcionario.LIDER,
				3000, 2);
		System.out.println(lider2.calcularGratificacao());
		
		Funcionario dba1 = new Funcionario(Funcionario.DBA,
				1700, 1);
		System.out.println(dba1.calcularGratificacao());
		
		Funcionario dba2 = new Funcionario(Funcionario.DBA,
				1700, 2);
		System.out.println(dba2.calcularGratificacao());
		
		Funcionario dev1 = new Funcionario(Funcionario.DESENVOLVEDOR,
				2100, 1);
		System.out.println(dev1.calcularGratificacao());
		
		Funcionario dev2 = new Funcionario(Funcionario.DESENVOLVEDOR,
				2100, 2);
		System.out.println(dev2.calcularGratificacao());
		
	}
}