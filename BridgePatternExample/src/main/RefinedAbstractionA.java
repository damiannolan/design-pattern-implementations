package main;

/*
 * Refined Abstraction extends the interface defined by Abstraction
 * Composed with an implementation
 */
public class RefinedAbstractionA implements Abstraction {
	
	private Implementor impl;
	
	public RefinedAbstractionA(Implementor implementor) {
		this.impl = implementor;
	}
	
	@Override
	public void operation() {
		this.impl.implementation();
	}

}
