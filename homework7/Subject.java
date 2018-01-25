package homework7;

import java.util.ArrayList;

public interface Subject {

	public ArrayList<Observer> observers = new ArrayList<Observer>();
	
	public void removeObserver(Observer obser);
	public void registerObserver(Observer obser);
	public void notifyObservers();
}
