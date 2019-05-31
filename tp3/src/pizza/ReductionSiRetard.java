package pizza;

public class RéductionSiRetard implements ICalculPrix{
	
	private ICalculPrix p;
	private long commandTime;
	
	public RéductionSiRetard(ICalculPrix p, long commandTime) {
		this.p = p;
		this.commandTime = commandTime;
	}
	
	@Override
	public float Calcprix(Pizza pizza) {
		long currentTime = System.currentTimeMillis();
		if ((currentTime - commandTime) > (30*60*1000)) {
			return (float) (p.Calcprix(pizza)*0.1*((currentTime-commandTime)/(15*60*1000)));
		}
		return p.Calcprix(pizza);
	}

}
