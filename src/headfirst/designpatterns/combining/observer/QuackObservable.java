package headfirst.designpatterns.combining.observer;
/**
 * Observer Pattern
 * interface
 * own the registerObserver and notifyObservers methods
 * @author bethrobson
 * commends written by matthias mischek - tgm
 */
public interface QuackObservable {
	public void registerObserver(Observer observer);
	public void notifyObservers();
}
