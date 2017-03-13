
class ContaBancaria {
	
	interface FabricaContaBancaria{
		ContaPoupanca criarContaPoupanca();
	}
	
	class FabricaContaPoupanca implements FabricaContaBancaria{
		
		@Override
		public ContaPoupanca criarContaPoupanca(){
			return new Poupanca();
		}
	}
	
	public interface ContaPoupanca{
		void exibirInfoPoupanca();
	}
	
	class Poupanca implements ContaPoupanca{
		
		@Override
		public void exibirInfoPoupanca(){
			System.out.println("Informações da poupança");
		}
	}
	
	public static void mais (String[] args){
		FabricaContaBancaria fabricaContaPoupanca = new FabricaContaPoupanca();
		ContaPoupanca poupanca = fabricaContaPoupanca.criarContaPoupanca();
		poupanca.exibirInfoPoupanca();
		System.out.println();
		
	}

}
