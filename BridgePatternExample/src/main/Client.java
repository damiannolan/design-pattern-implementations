package main;

public class Client {
	public static void main(String[] args) {
		Implementor impl = new ConcreteImplementorA();
		Implementor impl2 = new ConcreteImplementorB();
		
		Abstraction a = new RefinedAbstractionA(impl);
		a.operation();
		
		Abstraction b = new RefinedAbstractionB(impl2);
		b.operation();
		
	}
}
