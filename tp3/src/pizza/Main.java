package pizza;

public class Main {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {

		Pizza p = new Pizza();
		p.bake();
//		p.bake();
		p.deliver();
//		p.deliver();
		
		ICalculPrix cp = new ConcreteCalculPrix();
		ICalculPrix rsr = new RéductionSiRetard(cp, System.currentTimeMillis()- 2_000_0000);
		ICalculPrix hh = new HappyHours(cp, System.currentTimeMillis(), 0, 10);
		
		System.out.println(hh.Calcprix(p));
	}
	
	
}
