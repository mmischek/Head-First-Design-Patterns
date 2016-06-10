package headfirst.designpatterns.combining.observer;
/**
 * Adapter or Proxy Pattern
 * interface
 * own the quack method
 * @author bethrobson
 * commends written by matthias mischek - tgm
 */
public interface Quackable extends QuackObservable {
	public void quack();
}
