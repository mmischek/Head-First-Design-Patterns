package headfirst.designpatterns.combining.observer;

/**
 * Abstract Factory of the Factory Pattern
 * @author bethrobson
 * commends written by matthias mischek - tgm
 */
public abstract class AbstractDuckFactory {
 
	public abstract Quackable createMallardDuck();
	public abstract Quackable createRedheadDuck();
	public abstract Quackable createDuckCall();
	public abstract Quackable createRubberDuck();
}
