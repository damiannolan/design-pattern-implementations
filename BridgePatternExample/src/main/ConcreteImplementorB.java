package main;

public class ConcreteImplementorB implements Implementor {

	public ConcreteImplementorB() {
		super();
		System.out.println("Created Implementation B");
	}

	@Override
	public void implementation() {
		System.out.println("B.implmentation() called.");
	}

}
