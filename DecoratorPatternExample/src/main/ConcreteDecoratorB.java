package main;

public class ConcreteDecoratorB extends Decorator {

	public void operation() {
		super.operation();
		System.out.println("ConreteDecoratorB.operation() executing...");
		anotherOperation();
	}
	
	private void anotherOperation() {
		System.out.println("ConcreteDecoratorB.anotherOperation() executing...");
	}
}
