package main;

public class Decorator implements Component {
	Component c = new ConcreteComponent();

	@Override
	public void operation() {
		c.operation();
	}
}
