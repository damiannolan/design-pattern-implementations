package main;

public class RefinedAbstractionB implements Abstraction {
	
	private Implementor impl;

	public RefinedAbstractionB(Implementor impl) {
		super();
		this.impl = impl;
	}	
	
	@Override
	public void operation() {
		this.impl.implementation();
	}

}
