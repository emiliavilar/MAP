
public enum EnumCargo implements Gratificacao {
	
	DBA{
		@Override
		public double calcularGratificacao(Funcionario funcionario) {
			if (funcionario.getNivel() >= 2) {
	              return funcionario.getSalarioBase() * 1.30;
	          }
	          return funcionario.getSalarioBase() * 1.20;
		}
	}, 
	
	DESENVOLVEDOR{
		@Override
        public double calcularGratificacao(Funcionario umFuncionario) {
              if (umFuncionario.getNivel() >= 2) {
                  return umFuncionario.getSalarioBase() * 1.25;
              }
              return umFuncionario.getSalarioBase() * 1.15;
		}
		
	}, 
	
	GERENTE{
		@Override
		public double calcularGratificacao(Funcionario umFuncionario) {
	          if (umFuncionario.getNivel() >= 2) {
	              return umFuncionario.getSalarioBase() * 1.45;
	          }
	          return umFuncionario.getSalarioBase() * 1.30;
		}
		
	}, 
		
	LIDER{
		public double calcularGratificacao(Funcionario umFuncionario) {
			if (umFuncionario.getNivel() >= 2) {
				return umFuncionario.getSalarioBase() * 1.35;
	        }
			return umFuncionario.getSalarioBase() * 1.25;
	    }
		
		};
}