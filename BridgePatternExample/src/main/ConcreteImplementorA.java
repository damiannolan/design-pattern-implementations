package main;

public class ConcreteImplementorA implements Implementor {

	public ConcreteImplementorA() {
		super();
		System.out.println("Created Implementation A");
	}

	@Override
	public void implementation() {
		System.out.println("A.implementation() called");
	}

}
