package mailbox;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	
	private List<Observer> lObs;
	
	public Subject() {
		lObs = new ArrayList<Observer>();
	}
	public void attach(Observer o) {
		lObs.add(o);
	}
	
	public void detach() {
		lObs.clear();
	}
	
	public void notifyObservers() {
		for (Observer obs : lObs) {
			obs.update(this);
		}
	}
}
