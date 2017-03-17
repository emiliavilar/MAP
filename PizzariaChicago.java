
public class PizzariaChicago implements AbstractPizzaria{

	@Override
	public Pizza createPizza(TypePizza typePizza) {
		ChicagoStylePizza pizzariaChicago = new ChicagoStylePizza();
		} else if (type.equals("veggie")) {
			pizza = new ChicagoStyleVeggiePizza();
		} else if (type.equals("clam")) {
			pizza = new ChicagoStyleClamPizza();
		} else if (type.equals("pepperoni")) {
			pizza = new ChicagoStylePepperoniPizza();
		}
		return null;
	}

}
