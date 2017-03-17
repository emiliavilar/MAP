public class PizzariaServiceMain {
	
	public static void main(String[] args) {
		
		AbstractPizzaria pizzaria = new Pizzaria();
		
		Pizza pizzariaChicago = pizzaria.createPizzaChicago("cheese");
		Pizza pizzariaNY = pizzaria.createPizzaNY("cheese");
		
		pizzariaChicago.exibirInfo();
		pizzariaNY.exibirInfo();
		
	}
}
