package pizza;

public class ConcreteCalculPrix implements ICalculPrix {

	@Override
	public float Calcprix(Pizza pizza) {
		return pizza.getPrix();
	}

}
