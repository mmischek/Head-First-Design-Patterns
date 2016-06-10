package headfirst.designpatterns.combining.observer;
/**
 * Observer Pattern
 * implements Observer
 * @author bethrobson
 * commends written by matthias mischek - tgm
 */
public class Quackologist implements Observer {
 
	public void update(QuackObservable duck) {
		System.out.println("Quackologist: " + duck + " just quacked.");
	}
 
	public String toString() {
		return "Quackologist";
	}
}
