package pizza;

public class HappyHours implements ICalculPrix {

	private ICalculPrix p;
	private long commandTime;
	private long HHbegin, HHend;
	
	public HappyHours(ICalculPrix p, long commandTime, long HHbegin, long HHend) {
		this.p = p;
		this.commandTime = commandTime;
		this.HHbegin = HHbegin;
		this.HHend = HHend;
	}
	
	@Override
	public float Calcprix(Pizza pizza) {
		if ((commandTime > HHbegin) && (commandTime < HHend)) {
			return (float) (p.Calcprix(pizza)*0.5);
		}
		return p.Calcprix(pizza);
	}

}
