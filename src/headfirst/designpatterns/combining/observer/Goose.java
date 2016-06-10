package headfirst.designpatterns.combining.observer;
/**
 * Adapter Pattern or Proxy Pattern
 * @author bethrobson
 * commends written by matthias mischek - tgm
 */
public class Goose {

	public void honk() {
		System.out.println("Honk");
	}

	public String toString() {
		return "Goose";
	}
}
