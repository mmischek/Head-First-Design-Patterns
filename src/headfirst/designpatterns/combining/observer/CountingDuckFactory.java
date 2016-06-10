package headfirst.designpatterns.combining.observer;
/**
 * Concrete Factory
 * enables the counting of quacks
 * @author bethrobson
 * commends written by matthias mischek - tgm
 */
public class CountingDuckFactory extends AbstractDuckFactory {
  

	public Quackable createMallardDuck() {
		return new QuackCounter(new MallardDuck());
	}
  
	public Quackable createRedheadDuck() {
		return new QuackCounter(new RedheadDuck());
	}
	
	public Quackable createDuckCall() {
		return new QuackCounter(new DuckCall());
	}
   
	public Quackable createRubberDuck() {
		return new QuackCounter(new RubberDuck());
	}
}
