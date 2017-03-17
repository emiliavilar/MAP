
public class Pizzaria implements AbstractPizzaria {
	
	@Override
	public Pizza createPizzaChicago(String type){
		if(type.equals("cheese")){
			return new CheesePizzaChicago();
		}if(type.equals("clam")){
			return new ClamPizzaChicago();
		}if(type.equals("peperoni")){
			return new PeperoniPizzaChicago();
		}if(type.equals("veggie")){
			return new VeggiePizzaChicago();
		} return null;
	}
	
	@Override
	public Pizza createPizzaNY(String type){
		if(type.equals("cheese")){
			return new CheesePizzaNY();
		}if(type.equals("clam")){
			return new ClamPizzaNY();
		}if(type.equals("peperoni")){
			return new PeperoniPizzaNY();
		}if(type.equals("veggie")){
			return new VeggiePizzaNY();
		} return null;
	}
}
