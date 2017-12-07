package main;

public class ConcreteDecoratorA extends Decorator {

	private boolean addedState;
	
	public void operation() {
		super.operation();
		
		System.out.println("ConcreteDecoratorA.operation() executing...");
		
		addedState = true;
		
		System.out.println("added State is now " + addedState);
	}
}
